package com.nimbus.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.nimbus.di.config.AppConfig;
import com.nimbus.di.model.Student;

public class MainDI {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Student student = context.getBean(Student.class);
        student.displayDetails();
        context.close();
    }
}
