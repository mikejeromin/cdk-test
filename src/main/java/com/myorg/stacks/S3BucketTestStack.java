package com.myorg.stacks;

import software.amazon.awscdk.RemovalPolicy;
import software.amazon.awscdk.services.s3.Bucket;
import software.constructs.Construct;
import software.amazon.awscdk.Stack;
import software.amazon.awscdk.StackProps;

public class S3BucketTestStack extends Stack {
    public S3BucketTestStack(final Construct scope, final String id) {
        this(scope, id, null);
    }

    public S3BucketTestStack(final Construct scope, final String id, final StackProps props) {
        super(scope, id, props);

        Bucket firstCdkBucket = Bucket.Builder.create(this, "FirstCdkBucket")
                .versioned(true)
                .bucketName("mikes-first-cdk-bucket")
                .removalPolicy(RemovalPolicy.DESTROY)
                .autoDeleteObjects(true)
                .build();

    }
}
