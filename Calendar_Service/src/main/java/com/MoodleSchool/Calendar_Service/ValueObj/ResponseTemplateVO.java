package com.MoodleSchool.Calendar_Service.ValueObj;

import com.MoodleSchool.Calendar_Service.entity.calendar;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** @author Nada Al-Ashi */

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ResponseTemplateVO {
    private calendar Calendar;
    private courses Courses;

}
