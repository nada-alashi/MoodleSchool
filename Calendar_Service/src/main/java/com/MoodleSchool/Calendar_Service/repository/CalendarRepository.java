package com.MoodleSchool.Calendar_Service.repository;

import com.MoodleSchool.Courses.entity.calendar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Nada Al-Ashi
 */

@Repository
public interface CalendarRepository extends JpaRepository<calendar, String>{

}
