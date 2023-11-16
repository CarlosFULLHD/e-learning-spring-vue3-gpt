package com.elearning.app.dao;

import com.elearning.app.entity.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface LessonDao extends JpaRepository<Lesson, Long> {
  
}
