package com.ciclo3retog24.retog24.controlador;

import com.ciclo3retog24.retog24.entidad.Message;
import com.ciclo3retog24.retog24.servicio.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/messages")
@CrossOrigin(origins = "*")
public class ApiMessage {

    @Autowired
    private MessageService service;


}
