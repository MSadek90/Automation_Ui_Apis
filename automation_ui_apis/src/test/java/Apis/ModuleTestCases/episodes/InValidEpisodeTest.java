package Apis.ModuleTestCases.episodes;

import org.example.payload.episodes.episodeWrapper;
import org.example.service.EpisodeService;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import Assertions.CoreAssertions;
import io.restassured.response.Response;

public class InValidEpisodeTest {


    
    @ParameterizedTest
    @MethodSource("DataProviders.EpisodesDataProviders#getInvalidEpisodes")
    public void createNewEpisode(episodeWrapper testwrapper) {

        EpisodeService episodeService = new EpisodeService();
        Response response = episodeService.createEpisode(testwrapper.getPayload());
        CoreAssertions.AssertStatuscode(422, response);
    }
}
