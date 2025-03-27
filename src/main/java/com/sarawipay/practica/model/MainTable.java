package com.sarawipay.practica.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

@DynamoDBTable(tableName = "MainTable")
// FUTUROS CAMBIOS: ¿Clase abstracta? Eliminar constructores si al final cambio.
public class MainTable {

    @DynamoDBHashKey(attributeName = "PK") // Referenciará a "cifNifNie"
    private String PK;

    @DynamoDBRangeKey(attributeName = "SK") // Referenciará a "email"
    private String SK;

    @DynamoDBAttribute(attributeName = "id")
    private String id;

    @DynamoDBAttribute(attributeName = "status")
    private String status;

    @DynamoDBAttribute(attributeName = "gIndex2Pk")
    private String gIndex2Pk;

    @DynamoDBAttribute(attributeName = "createTime")
    private String createTime; // String o LocalDateTime?

}