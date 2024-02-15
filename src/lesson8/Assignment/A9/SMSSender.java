package lesson8.Assignment.A9;

public class SMSSender implements MessageSender{
    private String senderContact;
    private String recepientContact;

    public SMSSender(String senderContact, String recepientContact){
        this.senderContact = senderContact;
        this.recepientContact = recepientContact;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(recepientContact);
        System.out.println(senderContact + "(me)" + ":" + message);
    }
    
}
