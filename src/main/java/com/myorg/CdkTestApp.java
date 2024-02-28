package com.myorg;

import com.myorg.stacks.DynamoDbTestStack;
import com.myorg.stacks.LambdaTestStack;
import com.myorg.stacks.S3BucketTestStack;
import software.amazon.awscdk.App;
import software.amazon.awscdk.Environment;
import software.amazon.awscdk.StackProps;

public class CdkTestApp {
    public static void main(final String[] args) {
        App app = new App();
        new S3BucketTestStack(app, "s3BucketTestStack", StackProps.builder()
            .env(Environment.builder()
                .account(System.getenv("CDK_DEFAULT_ACCOUNT"))
                .region(System.getenv("CDK_DEFAULT_REGION"))
                .build()
            )
            .build()
        );
        new LambdaTestStack(app, "cdkLambdaExample");
        new DynamoDbTestStack(app, "dynamoDbExample");

        app.synth();
    }

}
