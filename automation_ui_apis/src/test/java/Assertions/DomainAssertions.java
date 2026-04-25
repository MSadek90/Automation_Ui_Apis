package Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.restassured.response.Response;

public class DomainAssertions {
    

    public static void validateResponseBody(String expectedString, Response response,String actualString ){

        String actualvalue = response.jsonPath().getString(actualString);
        
        assertEquals(expectedString, actualvalue);
    }
}
