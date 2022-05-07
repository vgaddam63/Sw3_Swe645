package com.springboot.JPAmysql.controller;


import com.springboot.JPAmysql.entity.Student;
import com.springboot.JPAmysql.exceptions.ResourceNotFoundException;
import com.springboot.JPAmysql.repository.StudentRepository;
import com.springboot.JPAmysql.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", allowedHeaders = "*", maxAge = 4500)
public class StudentController {

    @Autowired
    private StudentService service;

    @Autowired
    private StudentRepository studentRepo;

    @PostMapping("/addstudent")
    public Student addStudent(@RequestBody Student student){
        return service.saveStudent(student);
    }

    @GetMapping("/students")
    public List<Student> findAllStudents(){
        List<Student> temp = service.getStudents();
//        System.out.println("******************Printing Here**************");
//        System.out.println(temp.get(0));
//        System.out.println("******************Printing Here**************");
        return service.getStudents();
    }

    @GetMapping("/getstudent/{student_id}")
    public Student findStudentBySID(@PathVariable String student_id){
        return service.getStudentBySID(student_id);
    }
    //    @GetMapping("/studentids")
//    public List<Student> findAllStudentIds(){
//        List<Student> temp = service.getStudentIds();
//        System.out.println("******************Printing Here**************");
//        System.out.println(temp);
//        System.out.println("******************Printing Here**************");
//        return service.getStudentIds();
//    }


//    @GetMapping("/getStudent/{student_id}")
//    public ResponseEntity<Student> findStudentBySID(@PathVariable String student_id){
//        Student student = studentRepo.findByStudentid(student_id).orElseThrow(() -> new ResourceNotFoundException("student does not exists with id:"+student_id));
//        return ResponseEntity.ok(student);
//    }

// getting updates API servies in bakend.. RDS database...
// 


}
