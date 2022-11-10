package com.dasunicodes.studentsystem.service;

import com.dasunicodes.studentsystem.model.Student;
import com.dasunicodes.studentsystem.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImplementation implements StudentService{
    @Autowired
    private StudentRepo studentRepo;

    @Override
    public Student saveStudentData(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepo.findAll();
    }
}
