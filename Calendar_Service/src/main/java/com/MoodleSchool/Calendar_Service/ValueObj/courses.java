package com.MoodleSchool.Calendar_Service.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** @author Nada Al-Ashi */

@Data
@AllArgsConstructor
@NoArgsConstructor

public class courses {
    private String name;
    private Integer id;
    private String teacher_name;	
    private String category;
    private String level;
    private String description;
}
