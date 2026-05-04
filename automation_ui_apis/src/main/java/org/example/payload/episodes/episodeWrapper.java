package org.example.payload.episodes;


import lombok.ToString;
import lombok.Data;


@Data
@ToString(of = {"scenarioName"})
public class episodeWrapper {
    
    
     private String scenarioName;
     private int expectedStatusCode;
     private episodePayload payload;
}
