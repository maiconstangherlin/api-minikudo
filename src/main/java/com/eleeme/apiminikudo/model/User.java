package com.eleeme.apiminikudo.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document("users")
public class User {

    @Id
    private String id;
    private String name;
    private String email;
    private String password;

}
