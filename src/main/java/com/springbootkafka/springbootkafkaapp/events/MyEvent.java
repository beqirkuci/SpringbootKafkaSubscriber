package com.springbootkafka.springbootkafkaapp.events;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyEvent implements Serializable {
    private static final long serialVersionUID = 1L;

    private String key;
    private String message;
}
