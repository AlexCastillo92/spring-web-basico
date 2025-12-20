
package com.empresa.springwebbasico.service;

import org.springframework.stereotype.Service;

@Service
public class MensajeService {

    public String obtenerMensaje() {
        return "Hola desde HomeController";
    }
}
