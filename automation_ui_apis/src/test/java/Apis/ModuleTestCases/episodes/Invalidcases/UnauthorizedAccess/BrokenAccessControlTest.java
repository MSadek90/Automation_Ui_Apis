package Apis.ModuleTestCases.episodes.Invalidcases.UnauthorizedAccess;

import org.example.service.EpisodeService;
import org.example.utilities.ConfigReader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import Assertions.CoreAssertions;
import io.qameta.allure.Description;
import io.restassured.response.Response;

public class BrokenAccessControlTest {

    @Test
    @DisplayName("Test broken access control")
    @Description("This test checks for broken access control by attempting to access a restricted resource with unauthorized token")
    public void testBrokenAccessControl() {
        EpisodeService episodeService = new EpisodeService();
        Response response = episodeService.createEpisode(" ", ConfigReader.readValueFromConfigFile(".env", "UnauthorizedToken"));
        CoreAssertions.AssertStatuscode(403, response);
    }
}
