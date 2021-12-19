package com.MoodleSchool.Courses.service;

import com.MoodleSchool.Course.entitys.courses;
import com.MoodleSchool.Courses.repository.CoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;

/**
 *
 * @author Nada Al-Ashi
 */

@Service
@Slf4j

public class CourseService {
    @Autowired
    private CoursesRepository coursesRepository;

    public courses saveCourses(courses, Course){
        log.info("Inside saveCourses of CourseService")
        return coursesRepository.save(Course);
    }

    public courses findCoursesById(Integer id){
        log.info("Inside saveCourses of CourseService");
        return coursesRepository.findByCoursesId(id);
    }
}
