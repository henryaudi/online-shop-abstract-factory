package factory;

import abstract_product.Accessories;
import abstract_product.Computer;
import abstract_product.Tablet;
import abstract_product.Watch;

public interface StoreFactory {

    // Methods
    public Accessories orderAccessories(String item);
    public Computer orderComputer(String item);
    public Watch orderWatch(String item);
    public Tablet orderTablet(String item);
}
