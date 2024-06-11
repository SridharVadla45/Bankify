package com.java100xdev.Bankify.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {

    @GetMapping("/balance")
    public ResponseEntity<String> getBalanceDetails(){
        return new ResponseEntity<>("Endpoint for balance details", HttpStatus.OK);
    }
}
