package com.java100xdev.Bankify.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticeController {

    @GetMapping("/notice")
    public ResponseEntity<String> getNoticeDetails(){
        return new ResponseEntity<>("Endpoint for notice details", HttpStatus.OK);
    }
}
