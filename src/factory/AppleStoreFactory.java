package factory;

import abstract_product.Accessories;
import abstract_product.Computer;
import abstract_product.Tablet;
import abstract_product.Watch;
import entity.*;

public class AppleStoreFactory implements StoreFactory {

    /**
     * Instantiate Accessories item based on the given item name.
     * @param item: the name of the item
     * @return: the instantiated Accessories item object
     */
    @Override
    public Accessories orderAccessories(String item) {
        return switch (item) {
            case "AirPods" -> new AirPods();
            case "Apple Pencil" -> new ApplePencil();
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
        return switch (item) {
            case "MacBook" -> new MacBook();
            default -> null;
        };
    }

    /**
     * Instantiate Watch item based on the given item name.
     * @param item: the name of the item
     * @return: the instantiated Watch item object
     */
    @Override
    public Watch orderWatch(String item) {
        return switch (item) {
            case "Apple Watch Series XX" -> new AppleWatchSeriesXX();
            case "Apple Watch Hermes" -> new AppleWatchHermes();
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
            case "iPad Pro" -> new IPadPro();
            case "iPad Air" -> new IPadAir();
            case "iPad mini" -> new IPadMini();
            default -> null;
        };
    }
}
