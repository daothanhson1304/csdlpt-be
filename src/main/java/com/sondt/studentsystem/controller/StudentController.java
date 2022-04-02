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
    public Integer add(@RequestBody Student student){

        Integer id =studentService.saveStudent(student);
        return id;
    }
    @GetMapping("/getAll")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable("id") Integer id){
        studentService.deleteById(id);
        return "delete success";
    }
}
