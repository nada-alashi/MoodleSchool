package com.MoodleSchool.Calendar_Service.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Nada Al-Ashi
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class calendar {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String event_title;
    private Integer event_id;
    private String course_name;
    private Date Date;
    private String type_of_event;
    private Datetime duration;
    private String description;
    private Integer id;
}
