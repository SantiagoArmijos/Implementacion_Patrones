import adapter.ClimaService;
import adapter.WeatherAdapter;

public class TurismoCuencaFacade {
    private LugarDeInteresService lugarService;
    private PromocionService promoService;
    private EventoService eventoService;
    private NotificacionService notiService;
    private ClimaService climaService;

    public TurismoCuencaFacade() {
        this.lugarService = new LugarDeInteresService();
        this.promoService = new PromocionService();
        this.eventoService = new EventoService();
        this.notiService = new NotificacionService();
        this.climaService = new WeatherAdapter(); // usamos el Adapter
    }

    public void mostrarExperienciaCompleta(String lugarId) {
        lugarService.mostrarInformacionRA(lugarId);
        promoService.mostrarPromociones(lugarId);
        eventoService.mostrarEventosCercanos(lugarId);
        climaService.mostrarClima(lugarId); // Nueva funcionalidad Agregada
        notiService.enviarNotificacion("¡Estás cerca de " + lugarId + "! Descubre su historia y ofertas especiales.");
        
    }
}
