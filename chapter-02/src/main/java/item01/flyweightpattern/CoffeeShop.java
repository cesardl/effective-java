package item01.flyweightpattern;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author cesardiaz
 * @date 13/04/2015 11:22:32
 */
public class CoffeeShop {

    private final List<Order> orders = new CopyOnWriteArrayList<Order>();

    private final Menu menu = new Menu();

    public static void main(final String[] args) {
        CoffeeShop shop = new CoffeeShop();

        shop.takeOrder("Cappuccino", 2);
        shop.takeOrder("Frappe", 1);
        shop.takeOrder("Espresso", 1);
        shop.takeOrder("Frappe", 897);
        shop.takeOrder("Cappuccino", 97);
        shop.takeOrder("Frappe", 3);
        shop.takeOrder("Espresso", 3);
        shop.takeOrder("Cappuccino", 3);
        shop.takeOrder("Espresso", 96);
        shop.takeOrder("Frappe", 552);
        shop.takeOrder("Cappuccino", 121);
        shop.takeOrder("Espresso", 121);

        shop.service();
        System.out.println(shop.report());
    }

    void takeOrder(final String flavourName, final int table) {
        CoffeeFlavour flavour = menu.lookup(flavourName);
        Order order = new Order(table, flavour);
        orders.add(order);
    }

    void service() {
        for (Order order : orders) {
            order.serve();
            orders.remove(order);
        }
    }

    String report() {
        return "\ntotal CoffeeFlavour objects made: " + menu.totalCoffeeFlavoursMade();
    }

}
