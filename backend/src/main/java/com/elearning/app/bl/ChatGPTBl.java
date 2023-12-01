//package com.elearning.app.bl;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.web.client.RestTemplate;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@Service
//public class ChatGPTBl {
//    @Value("${openai.api.url}")
//    private String apiUrl;
//
//    @Value("${openai.api.key}")
//    private String apiKey;
//    private final RestTemplate restTemplate;
//    private final Logger logger = LoggerFactory.getLogger(ChatGPTBl.class);
//
//    public ChatGPTBl(RestTemplate restTemplate) {
//        this.restTemplate = restTemplate;
//    }
//
//    public String processMessage(String userMessage) {
//        //Excepciones para el mensaje
//        if (userMessage == null || userMessage.isEmpty()) {
//            logger.error("Message is null or empty");
//            return "Message is null or empty";
//        }
//        logger.info("Message received in BL class: {}", userMessage);
//        //Llamada al cliente de OpenAI
//        return sendMessageToOpenAi(userMessage);
//    }
//
//    public String sendMessageToOpenAi(String userMessage) {
//        // Aquí construirías el cuerpo de la solicitud conforme a la API de OpenAI
//        logger.info("Message received in DAO class: {}", userMessage);
//        List<Map<String, String>> messages = new ArrayList<>();
//        messages.add(Map.of("role", "system", "content", "Eres un docente profesional que enseña habilidades blandas, el usuario te hablara sobre que le gustaria aprender a el, le das la  importancia de estas habilidades blandas a lo que el necesita aprender y que pasara si no las aprende, tambien le invitas a leer nuestras membresias de pago abajo de la pagina y le das la bienvenida a E learning app, tu plataforma de aprendizaje"));
//        messages.add(Map.of("role", "user", "content", userMessage));
//
//        Map<String, Object> requestBody = new HashMap<>();
//        requestBody.put("model", "gpt-3.5-turbo");
//        requestBody.put("messages", messages);
//        logger.info("Request body: {}", requestBody);
//        // Establecer los headers
//        HttpHeaders headers = new HttpHeaders();
//        headers.setBearerAuth(apiKey);
//        headers.setContentType(MediaType.APPLICATION_JSON);
//
//        // Crear la entidad de solicitud
//        HttpEntity<Map<String, Object>> requestEntity = new HttpEntity<>(requestBody, headers);
//        logger.info("Request entity: {}", requestEntity);
//        // Hacer la llamada a la API y obtener la respuesta
//        ResponseEntity<Map> response = restTemplate.postForEntity(apiUrl, requestEntity, Map.class);
////        ResponseEntity<String> response = restTemplate.postForEntity(apiUrl, requestEntity, String.class);
//
//        if (response.getStatusCode().is2xxSuccessful() && response.getBody() != null) {
//            List<Map<String, Object>> choices = (List<Map<String, Object>>) response.getBody().get("choices");
//            if (!choices.isEmpty()) {
//                Map<String, String> message = (Map<String, String>) choices.get(0).get("message");
//                return message.get("content");
//            }
//
//            logger.info("Response: {}", response);
//            // Procesar la respuesta como sea necesario
//            return "No se pudo obtener una respuesta de OpenAI";
//        }
//        return userMessage;
//    }
//}
