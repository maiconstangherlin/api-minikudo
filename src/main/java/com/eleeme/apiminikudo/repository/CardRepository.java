package com.eleeme.apiminikudo.repository;

import com.eleeme.apiminikudo.model.Card;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CardRepository extends MongoRepository<Card, String> {

}
