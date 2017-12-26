package item01.flyweightpattern;

/**
 * Instances of CoffeeFlavour will be the Flyweights.
 *
 * @author cesardiaz
 * @date 13/04/2015 11:20:36
 */
public class CoffeeFlavour {

    private final String name;

    CoffeeFlavour(final String newFlavor) {
        name = newFlavor;
    }

    @Override
    public String toString() {
        return name;
    }

}
