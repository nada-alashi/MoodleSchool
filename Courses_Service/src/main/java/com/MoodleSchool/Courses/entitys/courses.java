package com.MoodleSchool.Courses.entitys;

/**
 *
 * @author Nada Al-Ashi
 */

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 *
 * @author Nada Al-Ashi
 */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class courses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String name;
    private Integer id;
    private String teacher_name;	
    private String category;
    private String level;
    private String description;
}
