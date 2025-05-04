public class TurismoCuencaFacade {
    private LugarDeInteresService lugarService;
    private PromocionService promoService;
    private EventoService eventoService;
    private NotificacionService notiService;

    public TurismoCuencaFacade() {
        this.lugarService = new LugarDeInteresService();
        this.promoService = new PromocionService();
        this.eventoService = new EventoService();
        this.notiService = new NotificacionService();
    }

    public void mostrarExperienciaCompleta(String lugarId) {
        lugarService.mostrarInformacionRA(lugarId);
        promoService.mostrarPromociones(lugarId);
        eventoService.mostrarEventosCercanos(lugarId);
        notiService.enviarNotificacion("¡Estás cerca de " + lugarId + "! Descubre su historia y ofertas especiales.");
    }
}
