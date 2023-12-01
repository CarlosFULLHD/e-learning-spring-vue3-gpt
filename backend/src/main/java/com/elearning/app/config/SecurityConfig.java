//package com.elearning.app.config;
//
//import org.slf4j.Logger;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//    Logger logger = org.slf4j.LoggerFactory.getLogger(SecurityConfig.class);
//
//    // Configuracion de seguridad por Spring Security 6.0 - actualizar a 6.1 si es
//    // necesario
//    // Clase no necesaria para nada se puede eliminar
//    @Bean
//    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        logger.info("SecurityConfig.securityFilterChain");
//        return http
//                .authorizeHttpRequests(auth -> auth
//                        .requestMatchers("/**").permitAll()// Hacer esta url accesible para TODOS
//                        .anyRequest().authenticated())// Cualquier otra request debe ser autenticada
//                .formLogin(Customizer.withDefaults())
//                .oauth2Login(Customizer.withDefaults())
//                .build();
//
//    }
//}
