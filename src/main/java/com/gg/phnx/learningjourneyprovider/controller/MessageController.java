package com.gg.phnx.learningjourneyprovider.controller;

import com.gg.phnx.learningjourneyprovider.model.MessageResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageController {

    @GetMapping
    public MessageResponse getMessage(@RequestParam String name) {
        MessageResponse messageResponse = new MessageResponse();
        messageResponse.setMessage("Hello World " + name + " Message From Provider");
        return messageResponse;
    }
}
