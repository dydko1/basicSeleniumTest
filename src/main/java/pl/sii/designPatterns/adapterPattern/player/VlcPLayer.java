package pl.sii.designPatterns.adapterPattern.player;

import pl.sii.designPatterns.adapterPattern.inter.AdvancedMediaPlayer;

public class VlcPLayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String name) {
        System.out.println("Vlc file is playing. File name is:\t" + name);
    }

    @Override
    public void playMP4(String name) {
        System.out.println("Do nothing");
    }
}
