package com.MoodleSchool.Cloud_Gateway;

import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Nada Al-Ashi
 */

@RestController

public class FallBackMethodController {
    
    @GetMapping("/calendarServiceFallBack")
    public String calendarServiceFallBackMethod(){
        return "Calendar Service is taking longer than Expected." +
                " Please try again later";
    }

    @GetMapping("/coursesServiceFallBack")
    public String coursesServiceFallBackMethod(){
        return "Courses Service is taking longer than Expected." +
                " Please try again later";
    }
}
