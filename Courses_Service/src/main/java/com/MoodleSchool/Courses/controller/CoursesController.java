package com.MoodleSchool.Courses.controller;

import com.MoodleSchool.Courses.entitys.courses;
import com.MoodleSchool.Courses.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import lombok.extern.slf4j.Slf4j;

/**
 *
 * @author Nada Al-Ashi
 */

@RestController
@RequestMapping("/courses")
@Slf4j
public class CoursesController {
    @Autowired
    private CourseService courseService;

    @PostMapping("/")
    public courses saveCourses(@RequestBody courses Course) {
        log.info("Inside saveCourses method of CoursesController");
        return courseService.saveCourses(Course);
    }    

    @GetMapping("/{id}")
    public courses findCoursesById(@PathVariable("id") Integer id) {
        log.info("Inside findCoursesById method of CoursesController");
        return courseService.findCoursesById(id);
    }
}
