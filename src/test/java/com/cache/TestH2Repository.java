package com.cache;

import com.cache.entites.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface TestH2Repository extends JpaRepository<Student,Integer> {
    public Student findByStudentName(String studentName);
}
