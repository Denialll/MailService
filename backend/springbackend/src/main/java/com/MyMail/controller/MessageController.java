package com.MyMail.controller;


import com.MyMail.entity.Message;
import org.hibernate.mapping.Collection;
import org.hibernate.mapping.MappedSuperclass;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
@RestController
@RequestMapping("/")
@CrossOrigin("http://localhost:5173/")
public class MessageController {


    @GetMapping
    public ArrayList<Message> getMyObject() {
        ArrayList<Message> messages = new ArrayList<>();

        Message message1 = new Message();
        message1.setTitle("Hello!");
        message1.setSender("Daniel");
        message1.setImportant(true);
        message1.setDate(new Date(3212121212121L));

        Message message2 = new Message();
        message2.setTitle("We need more code!");
        message2.setSender("Vova");
        message1.setDate(new Date(1912121212121L));

        Message message3 = new Message();
        message3.setTitle("How are you?");
        message3.setSender("Lisa");
        message1.setDate(new Date(1212121212121L));

        Collections.addAll(messages, message1, message2, message3);
        return messages;
    }
}
