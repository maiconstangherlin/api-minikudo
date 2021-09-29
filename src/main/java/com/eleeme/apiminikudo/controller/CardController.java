package com.eleeme.apiminikudo.controller;

import com.eleeme.apiminikudo.model.Card;
import com.eleeme.apiminikudo.repository.CardRepository;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/kudo-card")
public class CardController {

    private final CardRepository cardRepository;

    @GetMapping("/{id}")
    @ApiOperation("Find by id")
    public ResponseEntity<Card> getById(@PathVariable("id") String id) {
        Optional<Card> kudoCard = cardRepository.findById(id);

        return kudoCard.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

}
