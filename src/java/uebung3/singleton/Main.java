package uebung3.singleton;

public class Main {
    public static void main(String[] args) {
        ShipMarket instance = ShipMarket.getInstance();
        ShipMarket instance1 = ShipMarket.getInstance();
        System.out.println(instance1 == instance);

    }
}
