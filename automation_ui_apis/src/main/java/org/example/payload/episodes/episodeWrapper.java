package org.example.payload.episodes;


import lombok.Data;


@Data
public class episodeWrapper {
    
    
     private String scenarioName;
     private int expectedStatusCode;
     private episodePayload payload;
}
