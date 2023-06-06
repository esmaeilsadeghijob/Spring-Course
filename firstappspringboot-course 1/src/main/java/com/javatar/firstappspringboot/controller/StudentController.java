package com.javatar.firstappspringboot.controller;

import com.javatar.firstappspringboot.model.Student;
import com.javatar.firstappspringboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

//    Get (list)
//    Get (id)
//    Post
//    Put
//    Delete

    @Autowired
    private StudentService studentService;

    @PostMapping
    public Student save(@RequestBody Student student) {
        return studentService.save(student);
    }

    @GetMapping
    public List<Student> students() {
        return studentService.students();
    }

    @GetMapping("/{id}")
    public Student studentById(@PathVariable Integer id) {
        return studentService.studentById(id);
    }


    @DeleteMapping("/{id}")
    public void deletedById(@PathVariable Integer id) {
        studentService.deletedById(id);
    }

    @GetMapping("/lastname")
    public List<Student> findByLastName(@RequestParam String lastName) {
        return studentService.findByLastName(lastName);
    }

}
