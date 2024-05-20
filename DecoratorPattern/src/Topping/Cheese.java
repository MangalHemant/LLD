package Topping;

import Pizza.BasePizza;

public class Cheese extends ToppingDecorator {

    BasePizza basepizza;

    public Cheese(BasePizza basepizza)
    {
        this.basepizza=basepizza;
    }

    @Override
    public int cost() {
        return basepizza.cost() +20;
       
    }



}
