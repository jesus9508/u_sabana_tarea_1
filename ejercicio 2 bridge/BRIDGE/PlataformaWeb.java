public class PlataformaWeb implements Plataforma {
    @Override
    public void mostrar(String mensaje) {
        System.out.println("Mostrando en navegador: " + mensaje);
    }
}
