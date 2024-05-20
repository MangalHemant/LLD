package Observable;

import java.util.ArrayList;
import java.util.List;

import Observer.NotificationAlertObserver;

public class Iphone implements StockInterface {

    List<NotificationAlertObserver> observerList=new ArrayList<>();
    int stockCount=0;
   

    @Override
    public void add(NotificationAlertObserver obj2) {
        observerList.add(obj2);
    }

    @Override
    public void remove(NotificationAlertObserver obj) {
       observerList.remove(obj);
    }

    @Override
    public void modifyCount(int stock) {
       if(stockCount==0)
       {
        notifyUser();
       }
       stockCount+=stock;
     
    }

    @Override
    public void notifyUser() {

       for(NotificationAlertObserver observer:observerList)
       {
        observer.update();
       }
        
    }

}
