package org.example.Service;

import org.example.Base.BaseMethods;
import org.example.Endpoints.Endpoints;

import io.restassured.response.Response;

public class AuthService extends BaseMethods{

    public Response login(Object body){
        return post(setRequest(),Endpoints.LOGIN,body);
    }
    
}
