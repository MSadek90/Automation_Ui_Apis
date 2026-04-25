package org.example.Base;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

import io.qameta.allure.restassured.AllureRestAssured;

public abstract class BaseMethods extends BaseRequest{

    public Response postRequest(RequestSpecification requestSpecification, String endPoint, Object body){
        return 
         given()
         .filter(new AllureRestAssured())
        .spec(requestSpecification)
        .body(body)
        .when()
        .post(endPoint)
        .then()
        .log().body()
        .extract().response();
    };


    public Response getRequest(RequestSpecification requestSpecification, String endpoint){
       return
        given()
        .filter(new AllureRestAssured())
        .spec(requestSpecification)
        .when()
        .get(endpoint)
        .then()
        .log().body()
        .extract().response();
    };


    public Response patchRequest(RequestSpecification requestSpecification, String endpoint){
       return
        given()
        .filter(new AllureRestAssured())
        .spec(requestSpecification)
        .when()
        .patch(endpoint)
        .then()
        .log().body()
        .extract().response();
    };


    public Response deleteRequest(RequestSpecification requestSpecification, String endpoint){
       return
        given()
        .filter(new AllureRestAssured())
        .spec(requestSpecification)
        .when()
        .delete(endpoint)
        .then()
        .log().body()
        .extract().response();
    };

    
}
