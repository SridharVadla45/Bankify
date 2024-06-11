package com.java100xdev.Bankify.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

    @GetMapping("/contact")
    public ResponseEntity<String> getContactDetails(){
        return new ResponseEntity<>("Endpoint for Contact details", HttpStatus.OK);
    }
}
