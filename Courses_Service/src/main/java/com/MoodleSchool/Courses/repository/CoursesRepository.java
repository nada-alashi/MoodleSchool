package com.MoodleSchool.Courses.repository;

import com.MoodleSchool.Courses.entitys.courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Nada Al-Ashi
 */

@Repository
public interface CoursesRepository extends JpaRepository<courses, String>  {
    courses findByCoursesId(Integer id);
}
