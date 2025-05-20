public class Automovil {
    private final String motor;
    private final String color;
    private final String llantas;
    private final boolean gps;
    private final boolean sunRoof;
    private final String transmision;

    public Automovil(String motor, String color, String llantas, boolean gps, boolean techoSolar, String transmision) {
        this.motor = motor;
        this.color = color;
        this.llantas = llantas;
        this.gps = gps;
        this.sunRoof = techoSolar;
        this.transmision = transmision;
    }

    public void showDetails() {
        System.out.println("Motor: " + motor);
        System.out.println("Color: " + color);
        System.out.println("Llantas: " + llantas);
        System.out.println("GPS: " + (gps ? "Sí" : "No"));
        System.out.println("quema cocos: " + (sunRoof ? "Sí" : "No"));
        System.out.println("Transmisión: " + transmision);
    }
}
