package solid.lsp.mediaplayer_lsp_violation;

public class WinampMediaPlayer extends MediaPlayer {
    @Override
    public void playVideo() {
        try {
            throw new VideoUnsupportedException();
        } catch (VideoUnsupportedException e) {
            e.printStackTrace();
        }
    }
}
