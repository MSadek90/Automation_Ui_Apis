package DataProviders;

import java.util.stream.Stream;

import org.example.payload.episodes.episodeWrapper;
import org.example.utilities.JsonReader;

public class EpisodesDataProviders {



    private static final String ValidEpisodesPath = "src/test/resources/TestData/episodes/ValidScenarioes/Episode.json";
    private static final String InvalidEpisodesPath = "src/test/resources/TestData/episodes/InValidScenarioes/invalidInput.json";

    

    public static Stream<episodeWrapper> getInvalidEpisodes(){
        return JsonReader.deserializeJsonList(InvalidEpisodesPath,episodeWrapper.class);
    }


    public static Stream<episodeWrapper> getValidEpisodes(){
        return JsonReader.deserializeJsonList(ValidEpisodesPath,episodeWrapper.class);
    }
}
