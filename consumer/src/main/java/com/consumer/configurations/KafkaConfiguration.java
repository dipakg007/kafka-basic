package com.consumer.configurations;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfiguration {

    @KafkaListener(topics="messages", groupId = "group-1")
    public void updatedMessage(String message){
        System.out.println(message);
    }
}
