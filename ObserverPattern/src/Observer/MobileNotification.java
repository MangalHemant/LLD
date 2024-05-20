package Observer;

import Observable.StockInterface;

public class MobileNotification implements NotificationAlertObserver{

    String mobile;
    StockInterface observable;

    public MobileNotification(String mobile,StockInterface observable)
    {
        this.mobile=mobile;
        this.observable=observable;
    }



    @Override
    public void update() {
        sendMail(mobile);
    }

    public void sendMail(String mobile)
    {
        System.out.println("Message sent to : "+mobile+" : "+"Stock is back hurray");
    }

}
