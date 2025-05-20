public class PlataformaMovil implements Plataforma {
    @Override
    public void mostrar(String mensaje) {
        System.out.println("Mostrando en app: " + mensaje);
    }
}
