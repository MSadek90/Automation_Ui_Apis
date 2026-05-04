package Apis.ModuleTestCases.episodes.Invalidcases.InvalidInputs;

import org.example.payload.episodes.episodeWrapper;
import org.example.service.EpisodeService;
import org.example.utilities.ConfigReader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import Assertions.CoreAssertions;
import io.qameta.allure.Description;
import io.restassured.response.Response;

public class PostEpisodeWithInvalidInputsTest {

    @ParameterizedTest(name = "{index} - {0}")
    @DisplayName("Create a new episode with invalid data")
    @Description("This test creates a new episode with invalid data and expects a 422 status code")
    @MethodSource("DataProviders.EpisodesDataProviders#getInvalidEpisodes")
    public void testInvalidEpisodeCreation(episodeWrapper testwrapper) {

        EpisodeService episodeService = new EpisodeService();
        Response response = episodeService.createEpisode(testwrapper.getPayload(),
                ConfigReader.readValueFromConfigFile(".env", "AdminToken"));
        CoreAssertions.AssertStatuscode(422, response);
    }
}
