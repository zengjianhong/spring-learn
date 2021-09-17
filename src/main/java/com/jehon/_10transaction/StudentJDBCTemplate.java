package com.jehon._10transaction;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import javax.sql.DataSource;
import java.util.List;

/**
 * @author jehon
 */
public class StudentJDBCTemplate implements StudentDAO {

    private JdbcTemplate jdbcTemplate;
    private PlatformTransactionManager transactionManager;

    @Override
    public void setDataSource(DataSource ds) {
        this.jdbcTemplate = new JdbcTemplate(ds);
    }

    public void setTransactionManager(PlatformTransactionManager transactionManager) {
        this.transactionManager = transactionManager;
    }

    @Override
    public void create(String name, Integer age, Integer marks, Integer year) {
        TransactionDefinition def = new DefaultTransactionDefinition();
        TransactionStatus status = transactionManager.getTransaction(def);
        try {
            String SQL1 = "insert into Student(name, age) values (?, ?)";
            jdbcTemplate.update(SQL1, name, age);

            // Get the latest student id to be used in Marks table
            String SQL2 = "select max(id) from student";
            int sid = jdbcTemplate.queryForObject(SQL2, null, Integer.class);
            String SQL3 = "insert into Marks(sid, marks, year) values(?,?,?)";

            jdbcTemplate.update(SQL3, sid, marks, year);
            System.out.println("Created Name = " + name + ", Age = " + age);
//            transactionManager.commit(status); // 编程式事务

            // to simulate the exception
            throw new RuntimeException("simulate Error condition");

        } catch (DataAccessException e) {
            System.out.println("Error in creating record, rolling back");
//            transactionManager.rollback(status); // 编程式事务
            throw e;
        }
    }

    @Override
    public List<StudentMarks> listStudents() {
        String SQL = "select * from Student, Marks where Student.id=Marks.sid";
        List<StudentMarks> studentMarks = jdbcTemplate.query(SQL, new StudentMarksMapper());
        return studentMarks;
    }
}
