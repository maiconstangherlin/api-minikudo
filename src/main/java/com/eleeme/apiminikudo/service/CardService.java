package com.eleeme.apiminikudo.service;

import com.eleeme.apiminikudo.repository.CardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CardService {

    private final CardRepository cardRepository;

}
