package com.example.db.service;

import com.example.db.entity.StudentEntity;
import com.example.db.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;
    public String deleteStudent(int id) {
        StudentEntity student = studentRepository.findById(id).orElse(null);
        if (student == null) {
            return "Такого студента нет";
        }
        studentRepository.deleteById(id);
        return "Студент удален";
    }

    public List<StudentEntity> getPeopleByTicket(String studTicket) {
        return studentRepository.findAllByStudTicket(studTicket);
    }

    public List<StudentEntity> getPeopleGroupName(String groupName) {
        return studentRepository.findAllByGroupName(groupName);
    }

    public StudentEntity getStudentById(int id) {
        return studentRepository.findById(id).orElse(null);
    }

    public String saveStudent(StudentEntity student) {
        studentRepository.save(student);
        return "Добавлен новый студент";
    }

    public StudentEntity updateStudent(StudentEntity student, int id) {
        StudentEntity targetStudent = studentRepository.findById(id).orElse(null);
        if (targetStudent == null) {
            return null;
        }
        targetStudent.setFormStudy(student.getFormStudy());
        return studentRepository.save(targetStudent);
    }
}
