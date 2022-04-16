package com.sondt.studentsystem.controller;

import com.sondt.studentsystem.model.Student;
import com.sondt.studentsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")

public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public List<Student> add(@RequestBody Student student){
        System.out.println(student.getName()+"-"+student.getAddress()+"-"+student.getImage()+"-"+student.getAge());
        List<Student> students=studentService.saveStudent(student);
        return students;
    }
    @GetMapping("/getAll")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }

    @DeleteMapping("/delete/{id}")
    public List<Student> deleteById(@PathVariable("id") Integer id){
        List<Student> students=studentService.deleteById(id);
        return students;
    }
}
