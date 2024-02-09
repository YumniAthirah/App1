package lesson4.Q4SingletonClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private static Logger instance = null;

    private Logger() {
        //Private constructor to prevent instantiation
    }

    public static Logger getInstance(){
        if(instance == null){
            instance = new Logger();
        }
        return instance;
    }

    public static void log(String message){
        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(("yyyy-MM-dd HH:mm:ss"));
        String formattedTime = currentTime.format(formatter);
        System.out.println("[" + formattedTime + "]" + message);
    }
}

