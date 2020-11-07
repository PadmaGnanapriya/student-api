package com.kelaniya.uni.student.api;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class InMemoryStudentRepository implements StudentRepository {

    Map<String,Student> studentMap = new HashMap<>(); //in memory database

    public InMemoryStudentRepository () {
        Student kamal = new Student("1","kamal", 25, "13123123");
        Student nimal = new Student("2","nimal", 23, "2342342");
        studentMap.put("1", kamal);
        studentMap.put("2", nimal);
    }

    @Override
    public Student getStudent(String id) {

        return studentMap.get(id);

    }

    @Override
    public void addStudent(Student student) {
        studentMap.put(student.getId(),student);
    }

}
