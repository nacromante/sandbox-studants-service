package com.fred.sandboxstudentsservice.msgs;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix = "msg")
public class Msg {
    private String error;
}