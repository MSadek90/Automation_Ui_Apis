package org.example.payload.episodes;

import lombok.Data;

@Data
public class episodePayload {

        private String apple_podcast_url;
        private LanguageModel content;
        private String date;
        private LanguageModel description;
        private int duration;
        private int episode_number;
        private String image;
        private String soundcloud_url;
        private int status;
        private LanguageModel title;
        private String youtube_url;

        @Data
        public static class LanguageModel {
            private String en;
            private String ar;
        }

}