package com.producer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void produceMessage() {
        kafkaTemplate.send("messages", "{ " + Math.round(Math.random() * 100) + ", " + Math.round(Math.random() * 100) + " }");
    }
}
