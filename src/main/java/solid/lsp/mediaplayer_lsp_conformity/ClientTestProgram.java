package solid.lsp.mediaplayer_lsp_conformity;

import java.util.ArrayList;
import java.util.List;

public class ClientTestProgram {
    public static void main(String[] args) {

        //At the lecture, they did not tell which decision was correct.
        List<MediaPlayer> players = new ArrayList<>();
        players.add(new TorMediaPlayer());
        players.add(new VlcMediaPlayer());
        players.add(new FunMediaPlayer());
        players.add(new WinampMediaPlayer());
        players.add(new CutedMediaPlayer());
        playVideoAndAudio(players);

        //At the lecture, they did not tell which decision was correct.
        List<VideoMediaPlayer> videoPlayers = new ArrayList<>();
        videoPlayers.add(new TorMediaPlayer());
        videoPlayers.add(new VlcMediaPlayer());
        videoPlayers.add(new FunMediaPlayer());
        playVideo(videoPlayers);
        List<AudioMediaPlayer> audioPlayers = new ArrayList<>();
        audioPlayers.add(new WinampMediaPlayer());
        audioPlayers.add(new CutedMediaPlayer());
        playAudio(audioPlayers);


    }
    public static void playVideoAndAudio(List<MediaPlayer> allplayers) {
        for (var player : allplayers) {
            if(player instanceof VideoMediaPlayer) {
                ((VideoMediaPlayer) player).playVideo();
                player.playAudio();
                System.out.println("----------");
            } else {
                player.playAudio();
                System.out.println("----------");
            }
        }
    }

    public static void playVideo(List<VideoMediaPlayer> allplayers) {
        for (var player : allplayers) {
            player.playVideo();
        }
    }

    public static void playAudio(List<AudioMediaPlayer> allplayers) {
        for (var player : allplayers) {
            player.playAudio();
        }
    }
}
