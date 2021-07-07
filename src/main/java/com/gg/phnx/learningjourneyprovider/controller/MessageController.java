package com.gg.phnx.learningjourneyprovider.controller;

import com.gg.phnx.learningjourneyprovider.model.MessageResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageController {

    @GetMapping
    public MessageResponse getMessage() {
        MessageResponse messageResponse = new MessageResponse();
        messageResponse.setDescription("Hello World");
        return messageResponse;
    }
}
