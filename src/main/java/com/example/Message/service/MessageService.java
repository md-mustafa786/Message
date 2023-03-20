package com.example.Message.service;

import com.example.Message.dao.MessageRepository;
import com.example.Message.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    @Autowired
    MessageRepository messageRepository;
    public List<Message> getAll() {
      return messageRepository.findAll();
    }

    public void save(Message message) {
        messageRepository.save(message);
    }
}
