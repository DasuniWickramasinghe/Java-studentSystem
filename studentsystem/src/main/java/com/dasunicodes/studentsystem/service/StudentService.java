package com.dasunicodes.studentsystem.service;

import com.dasunicodes.studentsystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudentData(Student student);
    public List<Student> getAllStudent();
    }
