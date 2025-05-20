public class Main {
    public static void main(String[] args) {
        Builder builder = new AutomovilBuilder();

        Automovil auto = builder
                .setMotor("V6 3.0 240cv 300nm")
                .setColor("Plata")
                .setLlantas("Dunloop")
                .setGPS(false)
                .setTechoSolar(true)
                .setTransmision("Automática 6 velocidades secuencial")
                .build();

        auto.showDetails();
    }
}