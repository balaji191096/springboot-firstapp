package com.example.firstapp.student;

import java.time.LocalDate;

import jakarta.persistence.*;



@Entity
@Table
public class Student {
    @Id
    @SequenceGenerator(
        name="student_sequence",
        sequenceName = "student_sequence",
        allocationSize =  1
    )
    @GeneratedValue(
        strategy =  GenerationType.SEQUENCE,
        generator = "student_sequence"
    )
    private Long id;
    private String name;
    private int age;
    private String skills;
    private LocalDate dateOfBirth;


    public Student(String name, Long id, int age, String skills, LocalDate dateOfBirth){
        this.name = name;
        this.id = id;
        this.skills = skills;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
    }

        public Student(String name,  int age, String skills, LocalDate dateOfBirth){
        this.name = name;
        this.skills = skills;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
    }

    public Student(){}

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setSkills(String skills){
        this.skills =skills;
    }

    public void setDateofBirth(LocalDate dateOfBirth){
        this.dateOfBirth = dateOfBirth;
        
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public String getSkills() {
        return skills;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", id=" + id + ", age=" + age + ", skills=" + skills + ", dateOfBirth="
                + dateOfBirth + "]";
    }


    
    
}
