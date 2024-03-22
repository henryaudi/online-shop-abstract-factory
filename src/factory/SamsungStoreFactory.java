package factory;

import abstract_product.Accessories;
import abstract_product.Computer;
import abstract_product.Tablet;
import abstract_product.Watch;
import entity.*;

public class SamsungStoreFactory implements StoreFactory {

    @Override
    public Accessories orderAccessories(String item) {
        return switch (item) {
            case "Keyboard Cover" -> new KeyboardCover();
            case "Wireless Charger" -> new WirelessCharger();
            default -> null;
        };
    }

    @Override
    public Computer orderComputer(String item) {
        return item.equals("Notebook") ? new Notebook() : null;
    }

    @Override
    public Watch orderWatch(String item) {
        return switch (item) {
            case "Galaxy Watch XX" -> new GalaxyWatchXX();
            case "Galaxy Fit 2" -> new GalaxyFitTwo();
            default -> null;
        };
    }

    @Override
    public Tablet orderTablet(String item) {
        return switch (item) {
            case "Galaxy Tab S" -> new GalaxyTabS();
            case "Galaxy Book" -> new GalaxyBook();
            default -> null;
        };
    }
}
