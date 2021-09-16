package com.jehon._7config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author jehon
 */
@Configuration
@Import(TextEditorConfig.class)
public class HelloWorldConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public HelloWorld helloWorld() {
        return new HelloWorld();
    }
}
