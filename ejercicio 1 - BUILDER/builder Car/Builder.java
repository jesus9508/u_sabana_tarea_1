public interface Builder {
    Builder setMotor(String motor);
    Builder setColor(String color);
    Builder setLlantas(String llantas);
    Builder setGPS(boolean gps);
    Builder setTechoSolar(boolean techoSolar);
    Builder setTransmision(String transmision); // Nuevo campo
    Automovil build();
}