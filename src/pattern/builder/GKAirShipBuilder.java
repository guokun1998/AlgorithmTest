package pattern.builder;

public class GKAirShipBuilder implements AirShipBuilder {
    @Override
    public Engine buildEngine() {
        System.out.println("GK牌发动机");
        return new Engine("GK");
    }

    @Override
    public OrbitalModule buildOrbitalModule() {
        System.out.println("GK牌轨道舱");
        return new OrbitalModule("GK");
    }

    @Override
    public EscapeTower buildEscapeTower() {
        System.out.println("GK牌逃逸塔");
        return new EscapeTower("GK");
    }
}
