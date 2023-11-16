package com.elearning.app.dao;

import com.elearning.app.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface SubjectDao extends JpaRepository<Subject, Long> {
    
}

