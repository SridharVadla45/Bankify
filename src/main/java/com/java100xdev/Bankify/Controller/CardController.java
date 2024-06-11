package com.java100xdev.Bankify.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardController {

    @GetMapping("/card")
    public ResponseEntity<String> getCardDetails(){
        return new ResponseEntity<>("Endpoint for card details", HttpStatus.OK);
    }
}
