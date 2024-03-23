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

public abstract class Order {

    // Data Field
    List<Accessories> accessories;
    List<Computer> computers;
    List<Tablet> tablets;
    List<Watch> watches;

    // Constructor
    public Order() {
        this.setAccessories(new ArrayList<Accessories>());
        this.setComputers(new ArrayList<Computer>());
        this.setTablets(new ArrayList<Tablet>());
        this.setWatches(new ArrayList<Watch>());
    }

    // Getters and setters

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

    // Methods

    public abstract void orderTablet(String item);
    public abstract void orderWatch(String item);
    public abstract void orderComputer(String item);
    public abstract void orderAccessories(String item);
    public abstract void printReceipt();
}
