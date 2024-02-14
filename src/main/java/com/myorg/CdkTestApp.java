package com.myorg;

import com.myorg.stacks.lambdaTestStack;
import com.myorg.stacks.s3BucketTestStack;
import software.amazon.awscdk.App;
import software.amazon.awscdk.Environment;
import software.amazon.awscdk.StackProps;

public class CdkTestApp {
    public static void main(final String[] args) {
        App app = new App();
        new s3BucketTestStack(app, "s3BucketTestStack", StackProps.builder()
            .env(Environment.builder()
                .account(System.getenv("CDK_DEFAULT_ACCOUNT"))
                .region(System.getenv("CDK_DEFAULT_REGION"))
                .build()
            )
            .build()
        );
        new lambdaTestStack(app, "cdkLambdaExample");

        app.synth();
    }

}
