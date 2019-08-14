package com.example.card.controller;

import com.example.card.bean.Card;
import com.example.card.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
public class CardController {

    @Autowired
    private CardService cardService;


    @RequestMapping(value= "/query/{personId}", method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List query(@PathVariable String personId){
        return cardService.getCardListById(personId);
    }

    @RequestMapping(value= "/updateCard", method= RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void updateCard(@RequestBody(required = true) Card card) {

        cardService.updateCard(card);
    }

}
