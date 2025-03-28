package com.sarawipay.practica.model;

import com.amazonaws.services.dynamodbv2.datamodeling.*;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@DynamoDBDocument
public class MainTable {

    @DynamoDBHashKey(attributeName = "PK") // Referenciará a "cifNifNie"
    @JsonProperty("PK") // Necesario junto con DYnamoDBDocument para mapear correctamente
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