package com.elearning.app.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//Un controlador de prueba nada mas, se puede eliminar
@Controller
public class HomeApi {

    @GetMapping("/home")
    public String home() {
        return "index";
    }

}
