package com.springboot.JPAmysql.repository;

import com.springboot.JPAmysql.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student,Integer>{
    Optional<Student> findByStudentid(String student_id);

}
