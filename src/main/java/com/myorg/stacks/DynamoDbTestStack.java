package com.myorg.stacks;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.dynamodbv2.model.CreateTableRequest;
import com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput;
import com.amazonaws.services.dynamodbv2.model.UpdateTableRequest;
import com.myorg.model.User;
import lombok.extern.slf4j.Slf4j;
import software.amazon.awscdk.Stack;
import software.amazon.awscdk.StackProps;
import software.constructs.Construct;

@Slf4j
public class DynamoDbTestStack extends Stack {

    public DynamoDbTestStack(final Construct scope, final String id) {
        this(scope, id, null);
    }

    public DynamoDbTestStack(final Construct scope, final String id, final StackProps props) {
        super(scope, id, props);

        AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard().withRegion(Regions.US_EAST_2).build();
        DynamoDBMapper mapper = new DynamoDBMapper(client);
        CreateTableRequest userTable = mapper.generateCreateTableRequest(User.class);
        userTable.setProvisionedThroughput(new ProvisionedThroughput(5L, 5L));

        String tableName = "User";
        log.info("Building Table: {}",tableName);
        client.createTable(userTable);


//        DynamoDB dynamoDB = new DynamoDB(client);
//        Table table = dynamoDB.getTable(tableName);

//        log.info("Building Item.");
//        User user = User.builder()
//                .id(1)
//                .job("Super Hero")
//                .name("BatMan")
//                .build();
//
//        mapper.load(user);
//        item.getClass()
//        table.putItem(item);


    }
}
