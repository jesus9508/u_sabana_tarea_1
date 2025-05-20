public class AutomovilBuilder implements Builder {
    private String motor = "3 cilindros en linea";
    private String color = "Blanco";
    private String llantas = "michelin pilot";
    private boolean gps = false;
    private boolean techoSolar = false;
    private String transmision = "Manual";

    @Override
    public Builder setMotor(String motor) {
        this.motor = motor;
        return this;
    }

    @Override
    public Builder setColor(String color) {
        this.color = color;
        return this;
    }

    @Override
    public Builder setLlantas(String llantas) {
        this.llantas = llantas;
        return this;
    }

    @Override
    public Builder setGPS(boolean gps) {
        this.gps = gps;
        return this;
    }

    @Override
    public Builder setTechoSolar(boolean techoSolar) {
        this.techoSolar = techoSolar;
        return this;
    }

    @Override
    public Builder setTransmision(String transmision) {
        this.transmision = transmision;
        return this;
    }

    @Override
    public Automovil build() {
        return new Automovil(motor, color, llantas, gps, techoSolar, transmision);
    }
}