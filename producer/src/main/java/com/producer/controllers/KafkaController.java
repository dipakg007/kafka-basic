package com.producer.controllers;

import com.producer.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class KafkaController {

    @Autowired
    private KafkaService kafkaService;

    @PostMapping("/message")
    public ResponseEntity<?> produceMessage(){
        kafkaService.produceMessage();
        return new ResponseEntity<>(Map.of("Message", "Produced one message"), HttpStatus.OK);
    }
}
