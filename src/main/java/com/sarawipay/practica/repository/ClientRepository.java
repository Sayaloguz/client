package com.sarawipay.practica.repository;

import com.sarawipay.practica.model.Client;
import org.springframework.data.repository.CrudRepository;
import java.util.Optional;

public interface ClientRepository extends CrudRepository<Client, String> {
    Optional<Client> findByName(String name);
    Optional<Client> findByEmail(String email);

    Optional<Client> merchantClient(Client client);
}
