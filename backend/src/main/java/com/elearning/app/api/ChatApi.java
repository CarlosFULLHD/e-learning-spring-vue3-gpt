package com.elearning.app.api;

import com.elearning.app.bl.ChatGPTBl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@RestController
@RequestMapping("/api")
public class ChatApi {
    private final Logger logger = LoggerFactory.getLogger(ChatApi.class);
    private final ChatGPTBl chatGPTBl;

    public ChatApi(ChatGPTBl chatGPTBl) {
        this.chatGPTBl = chatGPTBl;
    }


    @PostMapping("/chatgpt")
    public ResponseEntity<String> getChatGptResponse(@RequestBody String userQuestion) {
        // Lógica para enviar petición a OpenAI y recibir respuesta
        String openAiResponse = chatGPTBl.processMessage(userQuestion);
        return ResponseEntity.ok(openAiResponse);
    }
    @GetMapping("/v1")
    public String hello() {
        return "Hello, world";
    }


}
