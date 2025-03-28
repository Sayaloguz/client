package com.sarawipay.practica.repository;

import com.sarawipay.practica.model.Client;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClientRepository  {

    Client findById(String id);

    List<Client> findByName(String name);

    List<Client> findByEmail(String email);

    Optional<Client> merchantClient(Client client);
}