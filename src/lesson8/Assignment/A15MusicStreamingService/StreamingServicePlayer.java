package lesson8.Assignment.A15MusicStreamingService;

public class StreamingServicePlayer implements MusicPlayer{
    String[] showlist = { "Dr.House:EP1", "Dr.House:EP2", "Dr.House:EP3", "Dr.House:E4" };
    int currentepIndex = 0;

    @Override
    public void play() {
        System.out.println("Playing: " + showlist[currentepIndex]);
    }

    @Override
    public void pause() {
        System.out.println("Pausing: " + showlist[currentepIndex]);
    }

    @Override
    public void next() {
        currentepIndex++;
        if (currentepIndex > showlist.length - 1) {
            System.out.println("Show ended.");
        } else {
            System.out.println("Playing next show.");
            System.out.println("Playing: " + showlist[currentepIndex]);
        }
    }

    @Override
    public void previous() {
        currentepIndex--;
        if (currentepIndex < 0) {
            System.out.println("No previous episode.");
        } else {
            System.out.println("Playing previous show.");
            System.out.println("Playing: " + showlist[currentepIndex]);
        }
    }
    
}
