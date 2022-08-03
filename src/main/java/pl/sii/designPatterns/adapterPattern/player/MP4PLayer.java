package pl.sii.designPatterns.adapterPattern.player;

import pl.sii.designPatterns.adapterPattern.inter.AdvancedMediaPlayer;

public class MP4PLayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String name) {
        System.out.println("Do nothing");
    }

    @Override
    public void playMP4(String name) {
        System.out.println("MP4 file is playing. File name is:\t" + name);
    }
}
