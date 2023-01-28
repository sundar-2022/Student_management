package com.Spring_testing.Student_management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/get_student/{regNo}")
    public STUDENT getStudent(@PathVariable("regNo") int regNo){

        return studentService.getStudent(regNo);
    }

    @PostMapping("/add_student")
    public String addStudent(@RequestBody STUDENT student){
        return studentService.addStudent(student);
    }

    @DeleteMapping("/delete_student")
    public String DeleteStudent(@RequestParam("q") int regNo){
        return studentService.DeleteStudent(regNo);
    }

    @PutMapping("/update_student")
    public String updateStudent(@RequestBody STUDENT student){
        return studentService.updateStudent(student);
    }
}
