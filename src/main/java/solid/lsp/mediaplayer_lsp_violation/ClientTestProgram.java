package solid.lsp.mediaplayer_lsp_violation;

import java.util.ArrayList;
import java.util.List;

public class ClientTestProgram {
    public static void main(String[] args) {
        List<MediaPlayer> allplayers = new ArrayList<>();
        allplayers.add(new TorMediaPlayer());
        allplayers.add(new VlcMediaPlayer());
        playVideoInAllMadiaPlayers(allplayers);
        System.out.println("------------------------");
        allplayers.add(new WinampMediaPlayer());
        playVideoInAllMadiaPlayers(allplayers);

    }

    public static void playVideoInAllMadiaPlayers(List<MediaPlayer> allplayers){
        for(var player: allplayers){
            player.playVideo();
        }
    }
}
