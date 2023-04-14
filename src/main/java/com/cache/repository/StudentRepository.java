package com.cache.repository;

import com.cache.entites.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

    Optional<Student> findByStudentRollNo(int rollNo);
}
