package lesson8.Assignment.A9;

public class MainMessage {
    public static void main(String[] args) {
        //Email
        EmailSender email = new EmailSender("Yumni@ritsumail.com", "Tya@ritsumail.com");
        String message = "Good morning";
        email.sendMessage(message);

        System.out.println();

        //Email
        SMSSender sms = new SMSSender("Yumni", "Tya");
        message = "Good morning";
        sms.sendMessage(message);
        
    }

}
