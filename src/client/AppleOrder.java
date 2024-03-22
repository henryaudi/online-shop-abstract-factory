package client;

import factory.AppleStoreFactory;

public class AppleOrder extends Order {

    // Data Field
    private AppleStoreFactory appleStore;

    // Constructor
    public AppleOrder() {
        super();
        setAppleStore(new AppleStoreFactory());
    }

    // Getters and Setters

    public AppleStoreFactory getAppleStore() {
        return appleStore;
    }

    public void setAppleStore(AppleStoreFactory appleStore) {
        this.appleStore = appleStore;
    }

    // Methods
    @Override
    public void orderTablet(String item) {
        this.getTablets().add(
                this.getAppleStore().orderTablet(item)
        );
    }

    @Override
    public void orderWatch(String item) {
        this.getWatches().add(
                this.getAppleStore().orderWatch(item)
        );
    }

    @Override
    public void orderComputer(String item) {
        this.getComputers().add(
                this.getAppleStore().orderComputer(item)
        );
    }

    @Override
    public void orderAccessories(String item) {
        this.getAccessories().add(
                this.getAppleStore().orderAccessories(item)
        );
    }
}
