package com.springbootkafka.springbootkafkaapp.service;


import com.springbootkafka.springbootkafkaapp.events.MyEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j

public class KafkaConsumerService {

  @KafkaListener(topics = "my-topic", groupId = "my-group")
  public void flightEventConsumer(MyEvent message) {
    log.info("Consumer consume Kafka message -> {}", message);

  }

}
