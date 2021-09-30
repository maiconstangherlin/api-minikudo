package com.eleeme.apiminikudo.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Document(collation = "cards")
public class Card {

    @Id
    private String id;
    private LocalDateTime createdAt;
    private LocalDate date;
    private String groupId;
    private String originUserId;
    private String targerUserId;
    private String message;

}
