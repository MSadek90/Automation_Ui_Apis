package Apis.ModuleTestCases.episodes;

import org.example.payload.episodes.episodeWrapper;
import org.example.service.EpisodeService;
import org.example.utilities.ConfigReader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import Assertions.CoreAssertions;
import Assertions.DomainAssertions;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.restassured.response.Response;

public class ValidEpisodeTest {

    @ParameterizedTest(name = "{index} - {0}")
    @DisplayName("Create a new episode")
    @Description("This test creates a new episode")
    @Owner("mahmoud")
    @MethodSource("DataProviders.EpisodesDataProviders#getValidEpisodes")
    public void createNewEpisode(episodeWrapper testwrapper) {

        EpisodeService episodeService = new EpisodeService();
        Response response = episodeService.createEpisode(testwrapper.getPayload(), ConfigReader.readValueFromConfigFile(".env", "AdminToken"));
        CoreAssertions.AssertStatuscode(201, response);
        DomainAssertions.validateResponseBody(testwrapper.getPayload().getTitle().getEn(), response, "data.title");
    }
}
