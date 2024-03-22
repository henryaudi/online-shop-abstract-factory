package client;

import abstract_product.Accessories;
import abstract_product.Computer;
import abstract_product.Tablet;
import abstract_product.Watch;
import factory.AppleStoreFactory;
import factory.SamsungStoreFactory;
import factory.StoreFactory;

import java.util.ArrayList;
import java.util.List;

public class Order {

    // Data Field
    StoreFactory store;
    List<Accessories> accessories;
    List<Computer> computers;
    List<Tablet> tablets;
    List<Watch> watches;

    // Constructor
    public Order(String producer) {
        if (producer.equals("Apple")) {
            this.store = new AppleStoreFactory();
        } else {
            this.store = new SamsungStoreFactory();
        }

        // Set the shopping cart.
        // Initially empty.
        this.setAccessories(new ArrayList<Accessories>());
        this.setComputers(new ArrayList<Computer>());
        this.setTablets(new ArrayList<Tablet>());
        this.setWatches(new ArrayList<Watch>());
    }

    // Getters and setters

    public StoreFactory getStore() {
        return store;
    }

    public void setStore(StoreFactory store) {
        this.store = store;
    }

    public List<Accessories> getAccessories() {
        return accessories;
    }

    public void setAccessories(List<Accessories> accessories) {
        this.accessories = accessories;
    }

    public List<Computer> getComputers() {
        return computers;
    }

    public void setComputers(List<Computer> computers) {
        this.computers = computers;
    }

    public List<Tablet> getTablets() {
        return tablets;
    }

    public void setTablets(List<Tablet> tablets) {
        this.tablets = tablets;
    }

    public List<Watch> getWatches() {
        return watches;
    }

    public void setWatches(List<Watch> watches) {
        this.watches = watches;
    }
}
