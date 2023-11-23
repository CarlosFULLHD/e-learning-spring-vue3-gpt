package com.elearning.app.bl;

import com.elearning.app.dao.OpenAiApiClient;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Service
public class ChatGPTBl {

    private final OpenAiApiClient openAiApiClient;
    private final Logger logger = LoggerFactory.getLogger(ChatGPTBl.class);
    public ChatGPTBl(OpenAiApiClient openAiApiClient) {
        this.openAiApiClient = openAiApiClient;
    }

    public String processMessage(String userMessage) {
        //Excepciones para el mensaje
        if (userMessage == null || userMessage.isEmpty()) {
            logger.error("Message is null or empty");
            return "Message is null or empty";
        }
        logger.info("Message received in BL class: {}", userMessage);
        //Llamada al cliente de OpenAI
        return openAiApiClient.sendMessageToOpenAi(userMessage);
    }
}
