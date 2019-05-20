package pattern.builder;

public interface AirShipBuilder {
    Engine buildEngine();
    OrbitalModule buildOrbitalModule();
    EscapeTower buildEscapeTower();
}
