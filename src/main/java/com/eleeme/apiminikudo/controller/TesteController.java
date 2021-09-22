package com.eleeme.apiminikudo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/teste")
@Api("Teste")
public class TesteController {

    @GetMapping
    @ApiOperation("Metodo teste")
    public ResponseEntity<String> teste() {
        return ResponseEntity.ok("teste");
    }

}
