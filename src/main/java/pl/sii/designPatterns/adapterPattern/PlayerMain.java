package pl.sii.designPatterns.adapterPattern;

import pl.sii.designPatterns.adapterPattern.player.AudioPlayer;

public class PlayerMain {
    public static void main(String[] args) {
        AudioPlayer audioPlayer=new AudioPlayer();
        audioPlayer.play("mp3","song 1.mp3");
        audioPlayer.play("mp4","song 2.mp4");
        audioPlayer.play("vlc","ssososkosk.vlc");
        audioPlayer.play("avi","ddddddd.avi");
    }
}
