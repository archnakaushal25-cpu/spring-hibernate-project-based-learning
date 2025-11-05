package com.nimbus.di.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.nimbus.di.model.Course;
import com.nimbus.di.model.Student;

@Configuration
public class AppConfig {
    @Bean
    public Course course() { return new Course("Spring Framework"); }

    @Bean
    public Student student() { return new Student(course()); }
}
