package com.java100xdev.Bankify.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("/account")
    public ResponseEntity<String> getAccountDetails(){
        return new ResponseEntity<>("Endpoint for Account details", HttpStatus.OK);
    }
}
