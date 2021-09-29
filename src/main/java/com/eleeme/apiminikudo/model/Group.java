package com.eleeme.apiminikudo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document("group")
public class Group {

    @Id
    private String id;
    private String name;
    private LocalDateTime createdAt;

}
