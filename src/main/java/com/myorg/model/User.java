package com.myorg.model;

import com.amazonaws.services.dynamodbv2.datamodeling.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@DynamoDBTable(tableName = "TestTable")
public class User {
    @DynamoDBHashKey(attributeName="Id")
    public Integer id;
    @DynamoDBAttribute(attributeName = "Name")
    public String name;
    @DynamoDBAttribute(attributeName = "Job")
    public String job;
}