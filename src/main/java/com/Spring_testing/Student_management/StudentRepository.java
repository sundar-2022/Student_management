package com.Spring_testing.Student_management;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepository {

    Map<Integer, STUDENT> db = new HashMap<>();

    public STUDENT getStudent(int regNo) {

        return db.get(regNo);
    }

    public String addStudent(STUDENT student) {
        int regNo = student.getregNo();
        db.put(regNo, student);
        return "Student Added Successfully";
    }
    public String DeleteStudent(int regNo) {
        if (!db.containsKey(regNo)) {
            return "Invalid id";
        }
        db.remove(regNo);
        return "Deleted successfully";
    }
    public String updateStudent(STUDENT student) {
        int regNo = student.getregNo();
        if (!db.containsKey(regNo))
            return "Invalid regNo";
        db.replace(regNo, student);
        return "Updated Successfully";
    }
}
