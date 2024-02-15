package lesson8.Assignment.A15;

public class MP3Player implements MusicPlayer {
    String[] playlist = { "Sunflower", "Perfect", "Flowers", "Left and Right" };
    int currentsongIndex = 0;

    @Override
    public void play() {
        System.out.println("Playing: " + playlist[currentsongIndex]);
    }

    @Override
    public void pause() {
        System.out.println("Pausing: " + playlist[currentsongIndex]);
    }

    @Override
    public void next() {
        currentsongIndex++;
        if (currentsongIndex > playlist.length) {
            System.out.println("Track ended.");
        } else {
            System.out.println("Playing next track on MP3 player.");
            System.out.println("Playing: " + playlist[currentsongIndex]);
        }

    }

    @Override
    public void previous() {
        currentsongIndex--;
        if (currentsongIndex < 0) {
            System.out.println("No previous song.");
        } else {
            System.out.println("Playing previous track on MP3 player.");
            System.out.println("Playing: " + playlist[currentsongIndex]);
        }
    }

}
