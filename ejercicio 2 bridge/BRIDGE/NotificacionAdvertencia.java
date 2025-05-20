public class NotificacionAdvertencia extends Notificacion {

    public NotificacionAdvertencia(Plataforma plataforma) {
        super(plataforma);
    }

    @Override
    public void enviar() {
        plataforma.mostrar("Advertencia ome.");
    }
}