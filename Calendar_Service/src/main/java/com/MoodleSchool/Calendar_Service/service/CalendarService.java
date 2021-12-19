package com.MoodleSchool.Calendar_Service.service;

import com.MoodleSchool.Calendar_Service.entity.calendar;
import com.MoodleSchool.Calendar_Service.repository.CalendarRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.extern.slf4j.Slf4j;


/**
 *
 * @author Nada Al-Ashi
 */

@Service
@Slf4j
public class CalendarService {
    @Autowired
    private CalendarRepository calendarRepository;

    @Autowired
    private RestTemplate restTemplate;

    public calendar saveCalendar(calendar Calendar) {
        log.info("Inside saveCalendar of CalendarService");
        return calendarRepository.save(Calendar);
    }

    public ResponseTemplateVO getcalendarWhithcourses(@PathVariable("id") Integer event_id) {
        log.info("Inside getcalendarWhithcourses of CalendarService");
        ResponseTemplateVO vo = new ResponseTemplateVO(); 
        calendar Calendar = calendarRepository.findById(event_id);
        courses Courses = 
            restTemplate.getForObject(url:"http://Courses-Service/courses/" + Calendar.getId()
                    ,courses.class);

        vo.setcalendar(Calendar);
        vo.setcourses(Courses);

        return vo;
    }
}
