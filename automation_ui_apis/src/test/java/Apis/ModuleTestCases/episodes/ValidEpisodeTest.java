package Apis.ModuleTestCases.episodes;

import org.example.payload.episodes.episodeWrapper;
import org.example.service.EpisodeService;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import Assertions.CoreAssertions;
import Assertions.DomainAssertions;
import io.restassured.response.Response;

public class ValidEpisodeTest {



    @ParameterizedTest
    @MethodSource("DataProviders.EpisodesDataProviders#getValidEpisodes")
    public void createNewEpisode(episodeWrapper testwrapper) {
        EpisodeService episodeService = new EpisodeService();
        Response response = episodeService.createEpisode(testwrapper.getPayload());
        CoreAssertions.AssertStatuscode(201, response);
        DomainAssertions.validateResponseBody(testwrapper.getPayload().getTitle().getEn(), response, "data.title");
    }
}
