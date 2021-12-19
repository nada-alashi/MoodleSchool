package com.MoodleSchool.Calendar_Service.controller;

import com.MoodleSchool.Calendar_Service.ValueObj.ResponseTemplateVO;
import com.MoodleSchool.Calendar_Service.service.CalendarService;
import com.MoodleSchool.Calendar_Service.entity.calendar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



/**
 *
 * @author Nada Al-Ashi
 */

@RestController
@RequestMapping("/calendar")
@Slf4j
public class CalendarController {

    @Autowired
    private CalendarService calendarService;

    @PostMapping("/")
    public calendar saveCalendar(@RequestBody calendar Calendar) {
        log.info("Inside saveCalendar of CalendarController");
        return calendarService.saveCalendar(Calendar);

    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getcalendarWhithcourses(@PathVariable("id") Integer event_id) {
        log.info("Inside getcalendarWhithcourses of CalendarController");
        return CalendarService.getcalendarWhithcourses(event_id);
    }
}
