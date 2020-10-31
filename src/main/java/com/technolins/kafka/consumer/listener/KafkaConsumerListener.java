package com.technolins.kafka.consumer.listener;

import com.technolins.kafka.consumer.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerListener {

    @KafkaListener(topics = "kafkatopic", groupId = "group_id", containerFactory = "concurrentKafkaListenerContainerFactory")
    public void consume(User user){
        System.out.println("Consume : " + user.toString());
    }
}
