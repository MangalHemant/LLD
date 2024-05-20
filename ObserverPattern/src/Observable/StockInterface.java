package Observable;



import Observer.NotificationAlertObserver;

public interface StockInterface {


    public void add(NotificationAlertObserver obj);
    public void remove(NotificationAlertObserver obj);
    public void modifyCount(int stock);
    public void notifyUser();


}
