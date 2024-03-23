package client;

import abstract_product.Accessories;
import abstract_product.Computer;
import abstract_product.Tablet;
import abstract_product.Watch;
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

    /**
     * Order the tablet with given name, add it to the shopping cart.
     * @param item: the name of the tablet item to be added
     */
    @Override
    public void orderTablet(String item) {
        this.getTablets().add(
                this.getAppleStore().orderTablet(item)
        );
        System.out.println("[UPDATE]" + item + " has been added to shopping cart at Apple store.");
    }

    /**
     * Order the watch with given name, add it to the shopping cart.
     * @param item: the name of the watch item to be added
     */
    @Override
    public void orderWatch(String item) {
        this.getWatches().add(
                this.getAppleStore().orderWatch(item)
        );
        System.out.println("[UPDATE]" + item + " has been added to shopping cart at Apple store.");
    }

    /**
     * Order the computer with given name, add it to the shopping cart.
     * @param item: the name of the computer item to be added
     */
    @Override
    public void orderComputer(String item) {
        this.getComputers().add(
                this.getAppleStore().orderComputer(item)
        );
        System.out.println("[UPDATE]" + item + " has been added to shopping cart at Apple store.");
    }

    /**
     * Order the accessories with given name, add it to the shopping cart.
     * @param item: the name of the accessory item to be added
     */
    @Override
    public void orderAccessories(String item) {
        this.getAccessories().add(
                this.getAppleStore().orderAccessories(item)
        );
        System.out.println("[UPDATE]" + item + " has been added to shopping cart at Apple store.");
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
            res += "[APPLE RECEIPT] Accessories cart: ";
            for (Accessories obj : this.getAccessories()) {
                res += obj + ", ";
            }
            // Chop off the last ',' and empty space.
            res = res.substring(0, res.length() - 2);
            res += '\n';
        }

        if (!this.getComputers().isEmpty()) {
            res += "[APPLE RECEIPT] Computers cart: ";
            for (Computer obj : this.getComputers()) {
                res += obj + ", ";
            }
            res = res.substring(0, res.length() - 2);
            res += '\n';
        }

        if (!this.getWatches().isEmpty()) {
            res += "[APPLE RECEIPT] Watches cart: ";
            for (Watch obj : this.getWatches()) {
                res += obj + ", ";
            }
            res = res.substring(0, res.length() - 2);
            res += '\n';
        }

        if (!this.getTablets().isEmpty()) {
            res += "[APPLE RECEIPT] Tablets cart: ";
            for (Tablet obj : this.getTablets()) {
                res += obj + ", ";
            }
            res = res.substring(0, res.length() - 2);
            res += '\n';
        }

        return res.substring(0, res.length() - 1) + '.';
    }
}
