package com.example.fruitProject.model;

import org.springframework.scheduling.annotation.Async;

public interface EmailSender {
    @Async
    void send(String to, String email);
}
