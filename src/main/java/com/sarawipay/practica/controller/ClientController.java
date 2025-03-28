package com.sarawipay.practica.controller;

import com.sarawipay.practica.model.Client;
import com.sarawipay.practica.service.ClientService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
@Getter
@Setter
public class ClientController {

    @Autowired
    private ClientService clientService;

    // Para comprobar que el acceso a la tabla funciona
    @GetMapping("all")
    public List<Client> getAll() {
        return clientService.findAll();
    }

    // Arreglar
    @GetMapping("id/{id}")
    public Client getById(@PathVariable String id) {
        return clientService.findById(id);
    }
}
