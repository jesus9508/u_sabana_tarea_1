public class Main {
    public static void main(String[] args) {
        Plataforma web = new PlataformaWeb();
        Plataforma movil = new PlataformaMovil();
        Notificacion mensajeWeb = new NotificacionMensaje(web);
        Notificacion advertenciaMovil = new NotificacionAdvertencia(movil);
        mensajeWeb.enviar();
        advertenciaMovil.enviar();
    }
}