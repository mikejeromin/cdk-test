package com.myorg.stacks;

import software.amazon.awscdk.Duration;
import software.amazon.awscdk.Stack;
import software.amazon.awscdk.StackProps;
import software.amazon.awscdk.services.lambda.Code;
import software.amazon.awscdk.services.lambda.Function;
import software.amazon.awscdk.services.lambda.Runtime;
import software.constructs.Construct;

public class LambdaTestStack extends Stack {
    public LambdaTestStack(final Construct scope, final String id) {
        this(scope, id, null);
    }

    public LambdaTestStack(final Construct scope, final String id, final StackProps props) {
        super(scope, id, props);

        Function.Builder.create(this, "hello-world-lambda")
                .runtime(Runtime.JAVA_21)
                .handler("com.myorg.mike.TestLambda")
                .memorySize(128)
                .timeout(Duration.seconds(20))
                .functionName("Mikes-First-CDK-Lambda")
                .code(Code.fromAsset("./assets/function.jar"))
                .build();
    }

}
