package com.javatar.firstappspringboot.service;

import com.javatar.firstappspringboot.model.Student;
import com.javatar.firstappspringboot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentsRepository;

    public Student save(Student student) {
        return studentsRepository.save(student);
    }

    public List<Student> students() {
        return (List<Student>) studentsRepository.findAll();
    }

    public Student studentById(int id) {
        return studentsRepository.findById(id).get();
    }

    public void deletedById(int id) {
        studentsRepository.deleteById(id);
    }

    public List<Student> findByLastName(String lastName){
        return studentsRepository.findByLastname(lastName);
    }

}
