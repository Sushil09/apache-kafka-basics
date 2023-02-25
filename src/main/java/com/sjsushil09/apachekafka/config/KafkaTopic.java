package com.sjsushil09.apachekafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopic {

    @Bean
    public NewTopic javaguidesTopic() {
        return TopicBuilder.name("sjsushil09")
                .build();
    }
}
