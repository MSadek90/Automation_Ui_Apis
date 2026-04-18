package org.example.AuthTypes;


import org.example.Base.BaseAuth;

import io.restassured.builder.RequestSpecBuilder;


public class ApiKey extends BaseAuth{

    @Override
    public void handleAuth(RequestSpecBuilder Builder){
    }
    
}
