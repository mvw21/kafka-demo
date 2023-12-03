package com.example.demokafka.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);
    @KafkaListener(topics = "demo-topic", groupId = "myGroup")
    public void consume(String message){
        LOGGER.info(String.format("Message received -> %s", message));
    }
}
