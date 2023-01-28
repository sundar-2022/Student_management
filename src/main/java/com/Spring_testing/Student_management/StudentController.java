package com.Spring_testing.Student_management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/get_student/{regNo}")
    public ResponseEntity getStudent(@PathVariable("regNo") int regNo){
        STUDENT student = studentService.getStudent(regNo);
        return new ResponseEntity<>(student, HttpStatus.FOUND);
    }

    @PostMapping("/add_student")
    public ResponseEntity addStudent(@RequestBody STUDENT student){
        String response = studentService.addStudent(student);
        return new ResponseEntity<>(response,HttpStatus.CREATED);
    }

    @DeleteMapping("/delete_student")
    public ResponseEntity DeleteStudent(@RequestParam("q") int regNo){
        String response = studentService.DeleteStudent(regNo);
        if(response.equals("Invalid id"))
            return new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(response,HttpStatus.FOUND);
    }

    @PutMapping("/update_student")
    public ResponseEntity updateStudent(@RequestBody STUDENT student){
        String response = studentService.updateStudent(student);
        if(response.equals("Invalid regNo")) {
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }
             return new ResponseEntity<>(response,HttpStatus.ACCEPTED);
    }
}
