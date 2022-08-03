package pl.sii.designPatterns.adapterPattern.player;

import pl.sii.designPatterns.adapterPattern.inter.AdvancedMediaPlayer;
import pl.sii.designPatterns.adapterPattern.inter.MediaPlayer;

public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc"))
            advancedMusicPlayer = new VlcPLayer();
        else if (audioType.equalsIgnoreCase("mp4"))
            advancedMusicPlayer = new MP4PLayer();
        else
            advancedMusicPlayer = null;
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc"))
            advancedMusicPlayer.playVlc(fileName);
        else if (audioType.equalsIgnoreCase("mp4"))
            advancedMusicPlayer.playMP4(fileName);
    }
}
