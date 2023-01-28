package com.Spring_testing.Student_management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public STUDENT getStudent(int regNo) {

        return studentRepository.getStudent(regNo);
    }
    public String addStudent(STUDENT student) {
        return studentRepository.addStudent(student);
    }
    public String DeleteStudent(int regNo) {
        return studentRepository.DeleteStudent(regNo);
    }
    public String updateStudent(STUDENT student) {
        return studentRepository.updateStudent(student);
    }
}
