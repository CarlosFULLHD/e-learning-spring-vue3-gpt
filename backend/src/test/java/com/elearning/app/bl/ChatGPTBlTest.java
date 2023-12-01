//package com.elearning.app.bl;
//
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.mockito.*;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.ResponseEntity;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.web.client.RestTemplate;
//
//import java.util.List;
//import java.util.Map;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class ChatGPTBlTest {
//
//    @Mock
//    private RestTemplate restTemplate;
//
//    @InjectMocks
//    private ChatGPTBl chatGPTBl;
//
//    @Test
//    public void testProcessMessage_ValidResponse() {
//        // Mocking the response from OpenAI API
//        ResponseEntity<Map> mockResponse = ResponseEntity.ok(Map.of(
//                "choices", List.of(Map.of(
//                        "message", Map.of("content", "Respuesta simulada de OpenAI")
//                ))
//        ));
//
//        Mockito.when(restTemplate.postForEntity(
//                ArgumentMatchers.anyString(),
//                ArgumentMatchers.any(),
//                ArgumentMatchers.<Class<Map>>any()
//        )).thenReturn(mockResponse);
//
//        String result = chatGPTBl.processMessage("pregunta de prueba");
//        assertEquals("Respuesta simulada de OpenAI", result);
//    }
//
//    // Aquí podrías agregar más pruebas para manejar respuestas vacías, errores, etc.
//}
