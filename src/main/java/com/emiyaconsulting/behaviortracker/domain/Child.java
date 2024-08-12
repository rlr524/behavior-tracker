package com.emiyaconsulting.behaviortracker.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document
public class Child {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String grade;
    private String gender;
}
