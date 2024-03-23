package factory;

import abstract_product.Accessories;
import abstract_product.Computer;
import abstract_product.Tablet;
import abstract_product.Watch;
import entity.*;

public class SamsungStoreFactory implements StoreFactory {

    /**
     * Instantiate Accessories item based on the given item name.
     * @param item: the name of the item
     * @return: the instantiated Accessories item object
     */
    @Override
    public Accessories orderAccessories(String item) {
        return switch (item) {
            case "Keyboard Cover" -> new KeyboardCover();
            case "Wireless Charger" -> new WirelessCharger();
            default -> null;
        };
    }

    /**
     * Instantiate Computer item based on the given item name.
     * @param item: the name of the item
     * @return: the instantiated Computer item object
     */
    @Override
    public Computer orderComputer(String item) {
        return item.equals("Notebook") ? new Notebook() : null;
    }

    /**
     * Instantiate Watch item based on the given item name.
     * @param item: the name of the item
     * @return: the instantiated Watch item object
     */
    @Override
    public Watch orderWatch(String item) {
        return switch (item) {
            case "Galaxy Watch XX" -> new GalaxyWatchXX();
            case "Galaxy Fit 2" -> new GalaxyFitTwo();
            default -> null;
        };
    }

    /**
     * Instantiate Tablet item based on the given item name.
     * @param item: the name of the item
     * @return: the instantiated Tablet item object
     */
    @Override
    public Tablet orderTablet(String item) {
        return switch (item) {
            case "Galaxy Tab S" -> new GalaxyTabS();
            case "Galaxy Book" -> new GalaxyBook();
            default -> null;
        };
    }

}
