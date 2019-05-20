package pattern.builder;

public class GKAirShipDirctor implements AirShipDiretor{

    private AirShipBuilder airShipBuilder;

    public GKAirShipDirctor(AirShipBuilder airShipBuilder){
        this.airShipBuilder = airShipBuilder;
    }

    @Override
    public AirShip directAirShip() {

        Engine engine = airShipBuilder.buildEngine();
        EscapeTower escapeTower = airShipBuilder.buildEscapeTower();
        OrbitalModule orbitalModule = airShipBuilder.buildOrbitalModule();


        //组装
        AirShip airShip = new AirShip();
        airShip.setEngine(engine);
        airShip.setEscapeTower(escapeTower);
        airShip.setOrbitalModule(orbitalModule);

        return airShip;
    }
}
