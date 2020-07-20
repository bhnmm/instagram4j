package com.github.instagram4j.Instagram4J.responses.music;

import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.github.instagram4j.Instagram4J.models.music.IGMusicPlaylist.BeanToTrackConverter;
import com.github.instagram4j.Instagram4J.models.music.IGMusicTrack;
import com.github.instagram4j.Instagram4J.responses.IGResponse;

import lombok.Data;

@Data
public class IGMusicTrackResponse extends IGResponse {
    @JsonDeserialize(converter = BeanToTrackConverter.class)
    private List<IGMusicTrack> items;
    private IGMusicTrackPageInfo page_info;
    
    @Data
    public static class IGMusicTrackPageInfo {
        private String next_max_id;
        private boolean more_available;
    }
}