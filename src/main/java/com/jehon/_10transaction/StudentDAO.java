package com.jehon._10transaction;

import javax.sql.DataSource;
import java.util.List;

/**
 * @author jehon
 */
public interface StudentDAO {

    /**
     * This is the method to be used to initialize
     * database resources ie. connection.
     */
    void setDataSource(DataSource ds);

    /**
     * This is the method to be used to create
     * a record in the Student and Marks tables.
     */
    void create(String name, Integer age, Integer marks, Integer year);

    /**
     * This is the method to be used to list down
     * all the records from the Student and Marks tables.
     */
    List<StudentMarks> listStudents();
}
