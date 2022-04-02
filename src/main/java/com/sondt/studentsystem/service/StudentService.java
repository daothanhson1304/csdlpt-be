package com.sondt.studentsystem.service;

import com.sondt.studentsystem.model.Student;

import java.util.List;

public interface StudentService {
    public Integer saveStudent(Student student);
    public List<Student> getAllStudent();
    public String deleteById(Integer id);
}
