package com.kelaniya.uni.student.api;

public interface StudentRepository {

    Student getStudent(String id);

    void addStudent(Student student);
}
