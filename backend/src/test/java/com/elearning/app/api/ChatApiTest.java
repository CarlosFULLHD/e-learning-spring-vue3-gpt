//package com.elearning.app.api;
//
//import com.elearning.app.bl.ChatGPTBl;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.junit.MockitoJUnitRunner;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//@RunWith(MockitoJUnitRunner.class)
//public class ChatApiTest {
//
//    @Mock
//    private ChatGPTBl chatGPTBl;
//
//    @InjectMocks
//    private ChatApi chatApi;
//
//    @BeforeEach
//    public void setUp() {
//        // Inicialización si es necesaria
//    }
//
//    @Test
//    public void testGetChatGptResponse() {
//        String userQuestion = "¿Cómo está el clima hoy?";
//        String expectedResponse = "La respuesta del clima es soleado";
//
//        Mockito.when(chatGPTBl.processMessage(userQuestion)).thenReturn(expectedResponse);
//
//        ResponseEntity<String> response = chatApi.getChatGptResponse(userQuestion);
//
//        assertEquals(HttpStatus.OK, response.getStatusCode());
//        assertEquals(expectedResponse, response.getBody());
//    }
//
//    // Aquí podrías agregar más pruebas para manejar diferentes escenarios de entrada y respuesta
//}
