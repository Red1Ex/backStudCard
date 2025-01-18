package com.example.db.repository;

import com.example.db.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {
    List <StudentEntity> findAllByStudTicket(String name);
    List <StudentEntity> findAllByGroupName(String name);
}
