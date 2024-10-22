package com.springbootkafka.springbootkafkaapp.controller;

import com.springbootkafka.springbootkafkaapp.events.MyEvent;
import com.springbootkafka.springbootkafkaapp.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

  private final KafkaProducerService producerService;

  @Autowired
  public KafkaController(KafkaProducerService producerService) {
    this.producerService = producerService;
  }

  @PostMapping("/publish")
  public ResponseEntity<String> publishMessage(@RequestParam("message") String message) {
    producerService.sendFlightEvent(new MyEvent("my-topic", message));
    return ResponseEntity.ok("Message published to Kafka topic");
  }
}