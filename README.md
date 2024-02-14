# Mike's first aws cli deployment project!
Using AWS hello world example to get started.
https://docs.aws.amazon.com/cdk/v2/guide/hello_world.html

## Stacks
  - S3 Bucket creation.
  - Lambda Hello Test Handler that takes in a string to output a response.

## PreReqs: 
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

## Project Set Up and Deployment Process:
  - Create new project command line or use Intellij
    - `mkdir cdk-test`
  - Go into the project and initialize the app if it hasn't been already
    - `cd .\cdk-test\`
    - `cdk init app --language java`
  - Build
    - `mvn compile -q`
  - Compile and run tests
    - `mvn package`
  - List all stacks in the app
    - `cdk ls`
  - Build AWS Cloudformation template
    - `cdk synth`
    - Emits the synthesized CloudFormation template
    - This will generate a json for the stack in the cdk.out folder
  - Bootstrap
    - `cdk bootstrap`
    - https://docs.aws.amazon.com/cdk/v2/guide/bootstrapping.html
    - essentially provisioning resources for aws cdk before you can deploy. Consists of s3 bucket to store files/ iam roles json that grant permissions to do deploy.
  - Deploy this stack to your default AWS account/region
    - `cdk deploy`
      - 'cdk deploy {stackNameHere}'
  - Modify the app, compare deployed stack with current state
    - `cdk diff`
  - Destroy
    - `cdk destroy`
  - Docs
    - `cdk docs`


This is a blank project for CDK development with Java.
The `cdk.json` file tells the CDK Toolkit how to execute your app.
It is a [Maven](https://maven.apache.org/) based project, so you can open this project with any Maven compatible Java IDE to build and run tests. 
