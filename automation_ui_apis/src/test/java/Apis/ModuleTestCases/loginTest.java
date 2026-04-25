package Apis.ModuleTestCases;

import org.example.payload.LoginPayload;
import org.example.service.AuthService;
import org.example.utilities.JsonReader;
import org.junit.jupiter.api.Test;

public class loginTest {

    @Test
    public void Login() {

        AuthService authService = new AuthService();
        LoginPayload loginPayload = JsonReader.deserializeJson("src/test/resources/TestData/Auth/Login.json",
                LoginPayload.class);
        authService.loginRequest(loginPayload);
    }
}
