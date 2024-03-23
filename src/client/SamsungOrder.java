package client;

import abstract_product.Accessories;
import abstract_product.Computer;
import abstract_product.Tablet;
import abstract_product.Watch;
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

    /**
     * Order the tablet with given name, add it to the shopping cart.
     * @param item: the name of the tablet item to be added
     */
    @Override
    public void orderTablet(String item) {
        this.getTablets().add(
                this.getSamsungStore().orderTablet(item)
        );
        System.out.println("[UPDATE]" + item + " has been added to shopping cart at Samsung store.");
    }

    /**
     * Order the watch with given name, add it to the shopping cart.
     * @param item: the name of the watch item to be added
     */
    @Override
    public void orderWatch(String item) {
        this.getWatches().add(
                this.getSamsungStore().orderWatch(item)
        );
        System.out.println("[UPDATE]" + item + " has been added to shopping cart at Samsung store.");
    }

    /**
     * Order the computer with given name, add it to the shopping cart.
     * @param item: the name of the computer item to be added
     */
    @Override
    public void orderComputer(String item) {
        this.getComputers().add(
                this.getSamsungStore().orderComputer(item)
        );
        System.out.println("[UPDATE]" + item + " has been added to shopping cart at Samsung store.");
    }

    /**
     * Order the accessories with given name, add it to the shopping cart.
     * @param item: the name of the accessory item to be added
     */
    @Override
    public void orderAccessories(String item) {
        this.getAccessories().add(
                this.getSamsungStore().orderAccessories(item)
        );
        System.out.println("[UPDATE]" + item + " has been added to shopping cart at Samsung store.");
    }

    @Override
    public void printReceipt() {
        System.out.println("---------------------------------");
        System.out.println(this);
        System.out.println("---------------------------------");
    }

    @Override
    public String toString() {
        String res = "";

        if (!this.getAccessories().isEmpty()) {
            res += "[SAMSUNG RECEIPT] Accessories cart: ";
            for (Accessories obj : this.getAccessories()) {
                res += obj + ", ";
            }
            // Chop off the last ',' and empty space.
            res = res.substring(0, res.length() - 2);
            res += '\n';
        }

        if (!this.getComputers().isEmpty()) {
            res += "[SAMSUNG RECEIPT] Computers cart: ";
            for (Computer obj : this.getComputers()) {
                res += obj + ", ";
            }
            res = res.substring(0, res.length() - 2);
            res += '\n';
        }

        if (!this.getWatches().isEmpty()) {
            res += "[SAMSUNG RECEIPT] Watches cart: ";
            for (Watch obj : this.getWatches()) {
                res += obj + ", ";
            }
            res = res.substring(0, res.length() - 2);
            res += '\n';
        }

        if (!this.getTablets().isEmpty()) {
            res += "[SAMSUNG RECEIPT] Tablets cart: ";
            for (Tablet obj : this.getTablets()) {
                res += obj + ", ";
            }
            res = res.substring(0, res.length() - 2);
            res += '\n';
        }

        return res.substring(0, res.length() - 1) + '.';
    }
}
