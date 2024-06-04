package com.oussama.student_roster.services;

import com.oussama.student_roster.models.Student;
import com.oussama.student_roster.repositories.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository studentRepo;

    public StudentService(StudentRepository studentRepo) {
        this.studentRepo = studentRepo;
    }

    public List<Student> allStudents() {
        return studentRepo.findAll();
    }

    public List<Student> dormStudents(Long dormId) {
        return studentRepo.findByDormIdIs(dormId);
    }

    public Student addStudent(Student student) {
        return studentRepo.save(student);
    }

    public Student updateStudent(Student student) {
        return studentRepo.save(student);
    }

    public void removeFromDorm(Student student) {
        student.setDorm(null);
        studentRepo.save(student);
    }

    public Student findStudent(Long id) {
        Optional<Student> optionalStudent = studentRepo.findById(id);
        return optionalStudent.orElse(null);
    }
}