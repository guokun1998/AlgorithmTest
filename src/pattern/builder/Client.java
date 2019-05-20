package pattern.builder;

public class Client {
    public static void main(String[] args) {
        AirShipDiretor airShipDiretor = new GKAirShipDirctor(new GKAirShipBuilder());

        AirShip airShip = airShipDiretor.directAirShip();

        System.out.println(airShip.getEngine());

        airShip.launch();

    }
}
