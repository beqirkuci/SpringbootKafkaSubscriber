package com.springbootkafka.springbootkafkaapp.service;

import com.springbootkafka.springbootkafkaapp.events.MyEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class KafkaProducerService {

  public static final String TOPIC = "my-topic";

  private final KafkaTemplate<String, MyEvent> kafkaTemplate;

  public void sendFlightEvent(MyEvent event){
    String key = event.getKey();
    kafkaTemplate.send(TOPIC, key , event);
    log.info("Producer produced the message {}", event);
  }


}
