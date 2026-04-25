package org.example.service;

import org.example.Base.BaseMethods;
import org.example.Endpoints.Endpoints;

import io.restassured.response.Response;

public class AuthService extends BaseMethods{

    public Response loginRequest(Object body){
        return postRequest(setRequest(),Endpoints.LOGIN,body);
    }



    
}
