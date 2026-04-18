package org.example.Base;

import io.restassured.builder.RequestSpecBuilder;

public abstract class BaseAuth {
    
    public abstract void handleAuth(RequestSpecBuilder builder);
    
}
