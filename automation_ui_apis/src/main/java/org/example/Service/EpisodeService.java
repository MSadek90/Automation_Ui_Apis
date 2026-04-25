package org.example.service;


import org.example.Base.BaseMethods;
import org.example.Endpoints.Endpoints;
import org.example.enums.AuthType;
import org.example.factory.AuthFactory;
import io.restassured.response.Response;



public class EpisodeService extends BaseMethods {
    public Response createEpisode(Object Body){

        return postRequest(setRequest(AuthFactory.selectAuth(AuthType.BEARER)),Endpoints.EPISODES,Body);

    }
}
