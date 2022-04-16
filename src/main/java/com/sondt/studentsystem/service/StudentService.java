package com.sondt.studentsystem.service;

import com.sondt.studentsystem.model.Student;

import java.util.List;

public interface StudentService {
    public List<Student> saveStudent(Student student);
    public List<Student> getAllStudent();
    public List<Student> deleteById(Integer id);
}
