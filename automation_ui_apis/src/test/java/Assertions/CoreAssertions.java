package Assertions;


import static org.junit.jupiter.api.Assertions.assertEquals;


import io.restassured.response.Response;

public class CoreAssertions {

    public static void AssertStatuscode(int statuscode,Response response){
        assertEquals(statuscode, response.getStatusCode(),"expected is: <" + statuscode + "> but actual is:<" + response.getStatusCode()+">");
    }
    
}
