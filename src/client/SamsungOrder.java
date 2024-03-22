package client;

import factory.SamsungStoreFactory;

public class SamsungOrder extends Order {

    // Data Field
    SamsungStoreFactory samsungStore;

    // Constructor
    public SamsungOrder() {
        super();
        setSamsungStore(new SamsungStoreFactory());
    }

    // Getters and Setters
    public SamsungStoreFactory getSamsungStore() {
        return samsungStore;
    }

    public void setSamsungStore(SamsungStoreFactory samsungStore) {
        this.samsungStore = samsungStore;
    }

    // Methods
    @Override
    public void orderTablet(String item) {
        this.getTablets().add(
                this.getSamsungStore().orderTablet(item)
        );
    }

    @Override
    public void orderWatch(String item) {
        this.getWatches().add(
                this.getSamsungStore().orderWatch(item)
        );
    }

    @Override
    public void orderComputer(String item) {
        this.getComputers().add(
                this.getSamsungStore().orderComputer(item)
        );
    }

    @Override
    public void orderAccessories(String item) {
        this.getAccessories().add(
                this.getSamsungStore().orderAccessories(item)
        );
    }
}
