package com.sondt.studentsystem.service;

import com.sondt.studentsystem.model.Student;
import com.sondt.studentsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public String deleteById(Integer id) {
        Student student = studentRepository.findById(id).orElseThrow();
        studentRepository.delete(student);
        return "delete success";
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Integer saveStudent(Student student) {

        Student newStudent= studentRepository.save(student);
        return newStudent.getId();
    }
}
