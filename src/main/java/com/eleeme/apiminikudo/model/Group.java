package com.eleeme.apiminikudo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Set;

@Document("groups")
public class Group {

    @Id
    private String id;
    private LocalDateTime createdAt;
    private String name;
    private Set<String> usersId;

}
