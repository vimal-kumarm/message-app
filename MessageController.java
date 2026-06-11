package com.example.messaging.controller;
import com.example.messaging.entity.Message;
import com.example.messaging.service.MessageService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/messages")
public class MessageController{
 private final MessageService service;
 public MessageController(MessageService service){this.service=service;}
 @PostMapping
 public Message send(@RequestBody Message m){return service.send(m);}
 @GetMapping
 public List<Message> getAll(){return service.getAll();}
}