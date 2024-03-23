import client.AppleOrder;
import client.Order;
import client.SamsungOrder;

public class Main {
    public static void main(String[] args) {
        // Start ordering from apple.
        Order appleOrder = new AppleOrder();
        appleOrder.orderAccessories("Apple Pencil");
        appleOrder.printReceipt();

        // Start ordering from samsung.
        Order samsungOrder = new SamsungOrder();
        samsungOrder.orderTablet("Galaxy Tab S");
        samsungOrder.orderAccessories("Keyboard Cover");
        System.out.println("---------------------------------");
        System.out.println(samsungOrder);
        System.out.println("---------------------------------");
    }
}