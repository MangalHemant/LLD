package Observer;

import Observable.StockInterface;

public class EmailNotification implements NotificationAlertObserver {

   String emailId;
    StockInterface observable;



public EmailNotification(String emailId,StockInterface observable)
    {
        this.emailId=emailId;
        this.observable=observable;
    }

    
    @Override
    public void update() {
        sendMail(emailId);
    }

    public void sendMail(String emailId)
    {
        System.out.println("Message sent to : "+emailId+":"+"Stock is back hurray");
    }
}
