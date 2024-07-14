package com.emiyaconsulting.behaviortracker.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Parent {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String relationship;
}
