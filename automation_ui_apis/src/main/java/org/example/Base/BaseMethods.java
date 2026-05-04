package org.example.Base;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

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


    /* Notes: if you do not need Query Parameters, you can pass {{null}}
    */
    public Response getRequest(RequestSpecification requestSpecification, String endpoint, Map<String,Object>queryParam, Object... pathParam){
      return given()
        .filter(new AllureRestAssured())
        .spec(requestSpecification)
        .queryParams(queryParam !=null? queryParam : new HashMap<>())
        .when()
        .get(endpoint, pathParam)
        .then()
        .log().body()
        .extract().response();
    };

     /* Notes: if you do not need Query Parameters, you can pass {{null}}
    */
    public Response getRequest(RequestSpecification requestSpecification, String endpoint, Object... pathParam){
      return given()
        .filter(new AllureRestAssured())
        .spec(requestSpecification)
        .when()
        .get(endpoint, pathParam)
        .then()
        .log().body()
        .extract().response();
    };


    /* Notes: if you do not need Query Parameters, you can pass {{null}}
    */
    public Response patchRequest(RequestSpecification requestSpecification, String endpoint, Object body, Map<String, Object> queryParam, Object... pathParam){
       return
        given()
        .filter(new AllureRestAssured())
        .spec(requestSpecification)
        .body(body)
        .queryParams(queryParam !=null? queryParam : new HashMap<>())
        .when()
        .patch(endpoint, pathParam)
        .then()
        .log().body()
        .extract().response();
    };

     /* Notes: if you do not need Query Parameters, you can pass {{null}}
    */
    public Response patchRequest(RequestSpecification requestSpecification, String endpoint, Object body, Object... pathParam){
       return
        given()
        .filter(new AllureRestAssured())
        .spec(requestSpecification)
        .body(body)
        .when()
        .patch(endpoint, pathParam)
        .then()
        .log().body()
        .extract().response();
    };













    

    /* Notes: if you do not need Query Parameters, you can pass {{null}}
    */
    public Response deleteRequest(RequestSpecification requestSpecification, String endpoint, Map<String, Object> queryParam, Object... pathParam){
       return
        given()
        .filter(new AllureRestAssured())
        .spec(requestSpecification)
        .queryParams(queryParam !=null? queryParam : new HashMap<>())
        .when()
        .delete(endpoint, pathParam)
        .then()
        .log().body()
        .extract().response();
    };

    /* Notes: if you do not need Query Parameters, you can pass {{null}}
    */
    public Response deleteRequest(RequestSpecification requestSpecification, String endpoint, Object... pathParam){
       return
        given()
        .filter(new AllureRestAssured())
        .spec(requestSpecification)
        .when()
        .delete(endpoint, pathParam)
        .then()
        .log().body()
        .extract().response();
    };

    
}
