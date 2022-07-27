package com.training.kafkaexample;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class KafkaApplicationListener {

    @KafkaListener( topics = "example" ,groupId = "groupId")
    public void listener(String data){
        log.info("received data from kafka :" + data + " 🔥 !");
    }
}
