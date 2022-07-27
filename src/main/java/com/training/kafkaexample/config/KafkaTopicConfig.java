package com.training.kafkaexample.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    // 1 - define a new Topic
    @Bean
    public NewTopic exampleTopic(){
        return TopicBuilder.name("example").build();
    }
}
