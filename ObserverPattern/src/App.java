import Observable.Iphone;
import Observable.StockInterface;
import Observer.EmailNotification;
import Observer.MobileNotification;
import Observer.NotificationAlertObserver;

public class App {
    public static void main(String[] args) throws Exception {
        StockInterface iphoneObserver=new Iphone();
        NotificationAlertObserver person1=new EmailNotification("abc@gmail.com",iphoneObserver);
        NotificationAlertObserver person2=new MobileNotification("9431174888", iphoneObserver);

        iphoneObserver.add(person1);
        iphoneObserver.add(person2);
        iphoneObserver.modifyCount(10);
}}
