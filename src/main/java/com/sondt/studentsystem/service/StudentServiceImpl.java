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
    public  List<Student> deleteById(Integer id) {
        List<Student> students = studentRepository.findAll();
        Student student = studentRepository.findById(id).orElseThrow();
        studentRepository.delete(student);
        students.remove(student);
        return students;
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public List<Student> saveStudent(Student student) {
        List<Student> students = studentRepository.findAll();
        Student newStudent= studentRepository.save(student);
        students.add(student);
        return students;
    }
}
