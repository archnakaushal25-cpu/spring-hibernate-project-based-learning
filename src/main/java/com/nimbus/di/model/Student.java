package com.nimbus.di.model;

public class Student {
    private final Course course;
    public Student(Course course) { this.course = course; }
    public void displayDetails() {
        System.out.println("Student enrolled in course: " + course.getCourseName());
    }
}
