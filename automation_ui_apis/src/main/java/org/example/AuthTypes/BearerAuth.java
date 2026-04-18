package org.example.AuthTypes;

import org.example.Base.BaseAuth;

import io.restassured.builder.RequestSpecBuilder;





public class BearerAuth extends BaseAuth{

    
    private String token;

    public BearerAuth(String token){
         this.token = token;
    }
    
    @Override
    public void handleAuth(RequestSpecBuilder builder){

        builder.addHeader("Authorization", "Bearer"+ token);

    }

}