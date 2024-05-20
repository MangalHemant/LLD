import Pizza.BasePizza;
import Pizza.Farmhouse;
import Topping.Cheese;
import Topping.Mushroom;

public class App {
    public static void main(String[] args) throws Exception {
        
        BasePizza pizza = new Mushroom(new Cheese(new Farmhouse()));
        System.out.println(pizza.cost());
    }
}
