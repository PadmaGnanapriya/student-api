package com.kelaniya.uni.student.api;

public class Student {

    //todo: make these properties private, and use getters and setters to access
    private String id;
    private String name;
    private int age;
    private String tp;

    public Student(String id, String name, int age, String tp) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.tp = tp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTp() {
        return tp;
    }

    public void setTp(String tp) {
        this.tp = tp;
    }
}
