package com.sarawipay.practica.service;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBQueryExpression;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;
import com.sarawipay.practica.model.Client;
import com.sarawipay.practica.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService implements ClientRepository {


    // REPASAR CONFIGURACIÓN DE LOS BEANS
    @Autowired
    private DynamoDBMapper dynamoDBMapper;

    public List<Client> findAll() {
        return dynamoDBMapper.scan(Client.class, new DynamoDBScanExpression());
    }

    // A PARTIR DE AQUÍ: INCOMPLETO

    public Client save(Client client) {
        dynamoDBMapper.save(client);
        return client;
    }

    public Client findById(String id) {
        /*Optional<Client> client = Optional.ofNullable(dynamoDBMapper.load(Client.class, id));
        if (client.isPresent()) {
            System.out.println("ENTRA");
            return client.get();
        }*/
        Client client = dynamoDBMapper.load(Client.class, id);
        System.out.println("ENTRA!!!!!!!");
        if (client != null) {
            return client;
        }
        return null;
    }

    // Consideramos List ya que en principio pueden haber nombres duplicados
    // addExpressionAttributeValuesEntry(String key, AttributeValue value)
    // addExpressionAttributeNamesEntry(String key, String value)
    public List<Client> findByName(String name) {
        DynamoDBQueryExpression<Client> query = new DynamoDBQueryExpression<>();
        return dynamoDBMapper.query(Client.class, new DynamoDBQueryExpression<Client>());
    }

    public List<Client> findByEmail(String email) {
        return dynamoDBMapper.query(Client.class, new DynamoDBQueryExpression<Client>());
    }

    // De momento devuelven Optional vacío como placeholder
    public Optional<Client> modify(String name) {
        return Optional.empty();
    }

    public Optional<Client> merchantClient(Client client) {
        return Optional.empty();
    }

}
