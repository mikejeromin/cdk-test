# Welcome to your CDK Java project!

This is a blank project for CDK development with Java.
The `cdk.json` file tells the CDK Toolkit how to execute your app.
It is a [Maven](https://maven.apache.org/) based project, so you can open this project with any Maven compatible Java IDE to build and run tests.

## Useful commands
 * `mvn package`     compile and run tests
 * `cdk ls`          list all stacks in the app
 * `cdk synth`       emits the synthesized CloudFormation template
 * `cdk deploy`      deploy this stack to your default AWS account/region
 * `cdk diff`        compare deployed stack with current state
 * `cdk docs`        open CDK documentation

Mike Notes
https://docs.aws.amazon.com/cdk/v2/guide/hello_world.html

PreReqs: 
- npm
  - install
- java
  - install environment variables/path
- mvn
  - install environment variables/path
- aws cdk
  - npm install -g aws-cdk
- aws cli
  - install and configure
- git
  - install and configure

Set Up:
  - Create empty project
    - mkdir cdk-test
  - Go into it and initialize the app
    - cd .\cdk-test\
    - cdk init app --language java
  - Build it
    - mvn compile -q
  - Check out stack
    - cdk ls
  - Build AWS Cloudformation template
    - cdk synth
    - This will generate a json for the stack in the cdk.out folder
  - Bootstrap
    - cdk bootstrap
    - https://docs.aws.amazon.com/cdk/v2/guide/bootstrapping.html
    - essentially provisioning resources for aws cdk before you can deploy. Consists of s3 bucket to store files/ iam roles json that grant permissions to do deploy.
  - Deploy
    - cdk deploy
  - Modify the app
    - cdk diff
  - Destroy
    - cdk destroy