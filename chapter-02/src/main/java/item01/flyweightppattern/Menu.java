package item01.flyweightppattern;

import java.util.HashMap;
import java.util.Map;

/**
 * Menu acts as a factory and cache for CoffeeFlavour flyweight objects.
 *
 * @author cesardiaz
 * @date 13/04/2015 11:21:10
 */
public class Menu {

    private final Map<String, CoffeeFlavour> flavours = new HashMap<String, CoffeeFlavour>();

    /**
     * Add flavour if doesn't exists.
     *
     * @param flavorName
     * @return
     */
    CoffeeFlavour lookup(final String flavorName) {
        if (!flavours.containsKey(flavorName)) {
            flavours.put(flavorName, new CoffeeFlavour(flavorName));
        }
        return flavours.get(flavorName);
    }

    int totalCoffeeFlavoursMade() {
        return flavours.size();
    }

}
