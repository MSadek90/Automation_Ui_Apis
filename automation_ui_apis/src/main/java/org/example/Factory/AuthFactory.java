package org.example.factory;

import org.example.AuthTypes.ApiKey;
import org.example.AuthTypes.BasicAuth;
import org.example.AuthTypes.BearerAuth;
import org.example.Base.BaseAuth;
import org.example.enums.AuthType;
import org.example.utilities.ConfigReader;

public class AuthFactory {

    public static BaseAuth selectAuth(AuthType auth){

        switch (auth) {
            case BEARER:
                return new BearerAuth(ConfigReader.readValueFromConfigFile(".env", "AdminToken"));
           
            case BASIC:
                return new BasicAuth("null","null");

            case API_KEY:
                return new ApiKey();
        
            default:
                throw new IllegalArgumentException("this: " + auth + " :type of auth not found");
        }        

    }


}
