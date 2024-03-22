package factory;

import abstract_product.Accessories;
import abstract_product.Computer;
import abstract_product.Tablet;
import abstract_product.Watch;
import entity.*;

public class AppleStoreFactory implements StoreFactory {

    @Override
    public Accessories orderAccessories(String item) {
        return switch (item) {
            case "AirPods" -> new AirPods();
            case "Apple Pencil" -> new ApplePencil();
            default -> null;
        };
    }

    @Override
    public Computer orderComputer(String item) {
        return switch (item) {
            case "MacBook" -> new MacBook();
            default -> null;
        };
    }

    @Override
    public Watch orderWatch(String item) {
        return switch (item) {
            case "Apple Watch Series XX" -> new AppleWatchSeriesXX();
            case "Apple Watch Hermes" -> new AppleWatchHermes();
            default -> null;
        };
    }

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
