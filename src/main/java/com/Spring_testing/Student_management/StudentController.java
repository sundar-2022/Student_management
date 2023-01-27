package com.Spring_testing.Student_management;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {

    Map<Integer,STUDENT> db = new HashMap<>();

    @GetMapping("/get_student")
    public STUDENT getStudent(@RequestParam("q") int RegNo){
        return db.get(RegNo);
    }

    @PostMapping("/add_student")
    public String addStudent(@RequestBody STUDENT student){
        if(student==null) return "Invalid Student";
        int RegNo = student.getRegNo();
        db.put(RegNo,student);
        return "Student Added Successfully";
    }

    @DeleteMapping("/delete_student")
    public String DeleteStudent(@RequestParam("q") int RegNo){
        db.remove(RegNo);
        return "Deleted successfully";
    }

    @PutMapping("/update_student")
    public String updateStudent(@RequestBody STUDENT student){
        int RegNo = student.getRegNo();
        try {
            db.replace(RegNo, student);
            db.forEach((k,v)->{
                System.out.println(k+"="+v);
            });
        }
        catch(Exception e){
            return e.getMessage();
        }
        return "Updated Successfully";
    }
}
