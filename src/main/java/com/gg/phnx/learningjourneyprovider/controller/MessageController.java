package com.gg.phnx.learningjourneyprovider.controller;

import com.gg.phnx.learningjourneyprovider.model.MessageResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Deprecated
    @GetMapping("/message")
    public MessageResponse getMessageDeprecated() {
        MessageResponse messageResponse = new MessageResponse();
        messageResponse.setMessage("Hello World");
        return messageResponse;
    }

    @GetMapping("/messages")
    public MessageResponse getMessage() {
        MessageResponse messageResponse = new MessageResponse();
        messageResponse.setMessage("Hello World");
        return messageResponse;
    }
}
