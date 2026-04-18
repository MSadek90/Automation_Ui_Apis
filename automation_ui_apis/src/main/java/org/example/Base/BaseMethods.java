package org.example.Base;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public abstract class BaseMethods extends BaseRequest{

    public Response post(RequestSpecification requestSpecification, String endPoint, Object body){
        return 
         given()
        .spec(requestSpecification)
        .body(body)
        .when()
        .post(endPoint);
    };


    public Response get(RequestSpecification requestSpecification, String endpoint){
       return
        given()
        .spec(requestSpecification)
        .when()
        .get(endpoint);
    };


    public Response patch(RequestSpecification requestSpecification, String endpoint){
       return
        given()
        .spec(requestSpecification)
        .when()
        .patch(endpoint);
    };


    public Response delete(RequestSpecification requestSpecification, String endpoint){
       return
        given()
        .spec(requestSpecification)
        .when()
        .delete(endpoint);
    };

    
}
