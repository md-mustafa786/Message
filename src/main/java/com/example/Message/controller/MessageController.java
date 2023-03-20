package com.example.Message.controller;

import com.example.Message.model.Message;
import com.example.Message.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MessageController {

    @Autowired
    MessageService messageService;

    @GetMapping(value = "get/message")
    public List<Message> getMessage(){
        return messageService.getAll();
    }

    @PostMapping(value = "add/message")
    public ResponseEntity<String> addMessage(@RequestBody Message message){
        messageService.save(message);
        return new ResponseEntity<>("saved", HttpStatus.OK);
    }
}
