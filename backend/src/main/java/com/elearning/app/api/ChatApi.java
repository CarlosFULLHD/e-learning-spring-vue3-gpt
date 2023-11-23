package com.elearning.app.api;

import com.elearning.app.bl.ChatGPTBl;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
@CrossOrigin(origins = "http://localhost:9000")
@RestController
@RequestMapping("/api/chat")
public class ChatApi {
    private final Logger logger = LoggerFactory.getLogger(ChatApi.class);
    private final ChatGPTBl chatGPTBl;

    public ChatApi(ChatGPTBl chatGPTBl) {
        this.chatGPTBl = chatGPTBl;
    }


    @PostMapping("/message")
    public String sendMessage(@RequestBody String message) {
        logger.info("Message received in API class: {}", message);
        return chatGPTBl.processMessage(message);
    }
}
