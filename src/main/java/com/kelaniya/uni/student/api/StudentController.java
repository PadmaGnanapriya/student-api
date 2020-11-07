package com.kelaniya.uni.student.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

//    //Field injection is not recomonded.
//    @Autowired
//    StudentRepository studentRepository;

    StudentRepository studentRepository;
    
    @Autowired
    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @PostMapping("/student")
    public void addStudent(@RequestBody Student student) { //this is a POST endpoint

        //implementation to add the new student to the system

        System.out.println("Adding a new user to the system"); //todo -delete-
        System.out.println("ID: "+student.getId()+" name: "+student.getName());

        studentRepository.addStudent(student);
        //end of implementation

    }

    @GetMapping("/student")
    public Student getStudent(@RequestParam String id) {
        System.out.println("Getting the user. userId: " + id);

        //we have the student id, next --> query our database
        Student student = studentRepository.getStudent(id);

        //return the information of the student
        return student;

    }


    /**
     * --REST METHODS--
     * GET -- If you fetch some resource from the server
     * POST -- If you publish some resource to the server
     * DELETE -- if you delete/remove a resource from the server
     * PATCH -- if you update an existing resource in the server
     * .
     * .
     * .
     * .
     *
     */


}
