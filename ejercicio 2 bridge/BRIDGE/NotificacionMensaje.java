public class NotificacionMensaje extends Notificacion {

    public NotificacionMensaje(Plataforma plataforma) {
        super(plataforma);
    }

    @Override
    public void enviar() {
        plataforma.mostrar("Mensaje enviado.");
    }
}
