package lesson8.Assignment.A9;

public class EmailSender implements MessageSender{
    private String senderEmail;
    private String recepientEmail;

    public EmailSender(String senderEmail, String recepientEmail){
        this.senderEmail = senderEmail;
        this.recepientEmail = recepientEmail;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("To: " + recepientEmail);
        System.out.println("From: " + senderEmail);
        System.out.println(message);
    }
    
}
