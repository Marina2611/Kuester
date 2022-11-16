package uebung3.singleton;

public class ShipMarket {
    private static ShipMarket instance;

    private ShipMarket() {

    }

    public static ShipMarket getInstance() {
        if (instance == null)
            instance = new ShipMarket();
        return instance;
    }
}
