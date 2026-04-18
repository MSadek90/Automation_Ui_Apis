package org.example.AuthTypes;

import org.example.Base.BaseAuth;

import io.restassured.builder.RequestSpecBuilder;




public class BasicAuth extends BaseAuth {
 

    private String username;
    private String password;

    public BasicAuth(String username,String password){
  
        this.username= username;
        this.password= password;
    }


    @Override
    public void handleAuth(RequestSpecBuilder builder){

        builder.addHeader(username,password);

    }

}
