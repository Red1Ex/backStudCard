package com.example.db.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "students-list")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(name = "first-name")
    String firstName;
    @Column(name = "last-name")
    String lastName;
    @Column(name = "second-name")
    String secondName;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "birth-date")
    Date birthDate;
    @Column(name = "gender")
    String gender;
    @Column(name = "phone-number")
    String phone;
    @Column(name = "email")
    String email;
    @Column(name = "address")
    String address;
    @Column(name = "enrollmant-date")
    Date enrollmantDate;
    @Column(name = "group-name")
    String groupName;
    @Column(name = "form-study")
    String formStudy;
    @Column(name = "stud-ticket")
    String studTicket;
}
