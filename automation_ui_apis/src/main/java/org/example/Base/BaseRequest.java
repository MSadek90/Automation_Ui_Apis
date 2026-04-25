package org.example.Base;





import org.example.utilities.ConfigReader;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.specification.RequestSpecification;

public abstract class BaseRequest {

   
     /* Builder */
    protected RequestSpecBuilder getCommonSpec(){
       return new RequestSpecBuilder()
        .setBaseUri(ConfigReader.readValueFromConfigFile(".env", "BaseUrl"))
        .addHeader("Content-Type", "application/json")
        .log(LogDetail.ALL);
    }


    /* Request without token */
       public RequestSpecification setRequest(){
       return getCommonSpec()
       .build();
    }



    /* Request with token */
       public RequestSpecification setRequest(BaseAuth auth){
       
         RequestSpecBuilder builder = getCommonSpec();
         if (auth != null) {
            auth.handleAuth(builder);
         }
         return builder.build();
      
       
    }
}
