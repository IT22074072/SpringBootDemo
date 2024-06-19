package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

// REST controllers handle HTTP requests and return JSON responses.
@RestController

// Annotation to map HTTP requests to this controller. The path specified will be the base URL for all requests in this controller.
@RequestMapping(path="api/v1/student")


public class StudentController {

    // Declaring a final variable for the StudentService, which will be injected by Spring.
    private final StudentService studentService;


    // Constructor for the StudentController, with the StudentService being injected by Spring.
    // The @Autowired annotation indicates that the StudentService should be injected automatically.
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }



    // Mapping for HTTP GET requests to the base URL.
    // This method will be called when a GET request is made to "api/v1/student".
    @GetMapping
    public List<Student> getStudents(){
        // This method calls the getStudents() method of the StudentService
        // and returns the list of students.
        return studentService.getStudents();

    }
}
