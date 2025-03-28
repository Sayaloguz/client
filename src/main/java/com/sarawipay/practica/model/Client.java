package com.sarawipay.practica.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.*;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

@DynamoDBTable(tableName = "MainTable")
public class Client extends MainTable {

    @DynamoDBAttribute(attributeName = "cifNifNie")
    private String cifNifNie;

    @DynamoDBAttribute(attributeName = "name")
    private String name;

    @DynamoDBAttribute(attributeName = "surname")
    private String surname;

    @DynamoDBAttribute(attributeName = "phone")
    private String phone;

    @DynamoDBAttribute(attributeName = "email") // Va a ser el SK, dato duplicado
    private String email;


    @Override
    @DynamoDBHashKey(attributeName = "PK")
    public String getPK() {
        return super.getPK();
    }

}
