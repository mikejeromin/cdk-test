package com.myorg.handlers;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
public class TestLambda implements RequestHandler<String, String>
{
    @Override
    public String handleRequest(String name, Context context) {
        //Simple Lambda function handler to input a string and output a hello phrase
        return "Hello "+ name;
    }
}