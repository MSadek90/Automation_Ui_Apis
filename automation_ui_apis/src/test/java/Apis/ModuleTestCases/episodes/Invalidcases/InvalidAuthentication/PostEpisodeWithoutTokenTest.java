package Apis.ModuleTestCases.episodes.Invalidcases.InvalidAuthentication;

import org.example.service.EpisodeService;
import org.example.utilities.ConfigReader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import Assertions.CoreAssertions;
import io.qameta.allure.Description;
import io.restassured.response.Response;

public class PostEpisodeWithoutTokenTest {
    

    @Test
    @DisplayName("Test creation of episode without token")
    @Description("This test attempts to create a new episode without a token and expects a 401 status code")
    public void testInvalidEpisodeCreation() {
        EpisodeService episodeService = new EpisodeService();
        Response response = episodeService.createEpisode(" ", ConfigReader.readValueFromConfigFile(".env", "EmptyToken"));
        CoreAssertions.AssertStatuscode(401, response);
    }
}
