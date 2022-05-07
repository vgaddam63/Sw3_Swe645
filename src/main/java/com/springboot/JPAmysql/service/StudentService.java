package com.springboot.JPAmysql.service;

import com.springboot.JPAmysql.entity.Student;
import com.springboot.JPAmysql.exceptions.ResourceNotFoundException;
import com.springboot.JPAmysql.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public Student saveStudent(Student student)
    {
        return repository.save(student);
    }

    public List<Student> getStudents(){
        return repository.findAll();
    }

//    public Student getStudentBySID(String student_id){
//        return repository.findByStudentid(student_id);
//
//    }


    public Student getStudentBySID(String student_id){
        Student student = repository.findByStudentid(student_id).orElseThrow(() -> new ResourceNotFoundException("student does not exists with id:"+student_id));
        System.out.println("Printing here*********************************************************");
        System.out.println(student);
        System.out.println("Printing here*********************************************************");
        return student;
    }


//    public List<Student> getStudentIds() {
//        return repository.findAllStudentid();
//    }
}
