package com.example.db.controller;

import com.example.db.entity.StudentEntity;
import com.example.db.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin

public class StudentController {

    private StudentService studentService;

    @PostMapping("/addStudent")
    public String newStudent(@RequestBody StudentEntity student) {
        return studentService.saveStudent(student);
    }

    @GetMapping("/student/{id}")
    public StudentEntity getStudentById(@PathVariable int id) {
        return studentService.getStudentById(id);
    }


    @GetMapping("/student/by-ticket")
    public List<StudentEntity> getPeopleByTicket(@RequestParam String studTicket) {
        return studentService.getPeopleByTicket(studTicket);
    }

    @GetMapping("/student/by-name")
    public List<StudentEntity> getPeopleGroupName(@RequestParam String groupName) {
        return studentService.getPeopleGroupName(groupName);
    }

    @DeleteMapping("student/{id}")
    public String deleteStudent(@PathVariable int id) {
        return studentService.deleteStudent(id);
    }

    @PatchMapping("/student/{id}")
    public StudentEntity updateStudent(@RequestBody StudentEntity student, @PathVariable int id) {
        return studentService.updateStudent(student, id);
    }

}

