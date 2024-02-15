package lesson8.Assignment.A15MusicStreamingService;

public class Main {
    public static void main(String[] args) {
        //mp3Player
        System.out.println("[MP3Player]");
        MP3Player mp3Player = new MP3Player();
        mp3Player.play();
        mp3Player.pause();
        mp3Player.next();
        mp3Player.previous();
        mp3Player.previous();
        

        System.out.println();

        //StreamingServicePlayer
        System.out.println("[Netflix]");
        StreamingServicePlayer player = new StreamingServicePlayer();
        player.play();
        player.pause();
        player.next();
        player.previous();
        player.next();
        player.next();
        player.next();
        player.next();

    }
    
}
