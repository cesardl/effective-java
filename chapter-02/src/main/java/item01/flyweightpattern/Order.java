package item01.flyweightpattern;

/**
 * @author cesardiaz
 * @date 13/04/2015 11:21:55
 */
public class Order {

    private final int tableNumber;

    private final CoffeeFlavour flavour;

    Order(final int tableNumber, final CoffeeFlavour flavour) {
        this.tableNumber = tableNumber;
        this.flavour = flavour;
    }

    void serve() {
        System.out.println("Serving " + flavour + " to table " + tableNumber);
    }

}
