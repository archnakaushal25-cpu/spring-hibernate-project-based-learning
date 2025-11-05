package com.nimbus.crud;

import com.nimbus.crud.dao.StudentDAO;
import com.nimbus.crud.entity.Student;

public class MainCRUD {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        Student student = new Student();
        student.setName("Alice");
        student.setCourse("Java");
        dao.create(student);
        // Add read/update/delete usages
    }
}
