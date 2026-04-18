package org.example.Factory;

import org.example.AuthTypes.ApiKey;
import org.example.AuthTypes.BasicAuth;
import org.example.AuthTypes.BearerAuth;
import org.example.Base.BaseAuth;
import org.example.Enums.AuthType;
import org.example.Utilities.ConfigReader;

public class AuthFactory {

    public BaseAuth selectAuth(AuthType auth){

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
