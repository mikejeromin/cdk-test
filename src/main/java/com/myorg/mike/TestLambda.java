package com.myorg.mike;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
public class TestLambda implements RequestHandler<String, String>
{
    @Override
    public String handleRequest(String name, Context context) {
        return "Hello "+ name;
    }
}