package adapter;
import java.util.HashMap;
import java.util.Map;

public class WeatherAdapter implements ClimaService {
    private WeatherAPI api;
    private Map<String, double[]> mapaCoordenadas;

    public WeatherAdapter() {
        this.api = new WeatherAPI();
        this.mapaCoordenadas = new HashMap<>();
        // Simulación: mapa de lugares con coordenadas
        mapaCoordenadas.put("Catedral de la Inmaculada", new double[]{-2.9006, -79.0045});
        mapaCoordenadas.put("Parque Calderón", new double[]{-2.8994, -79.0050});
    }

    @Override
    public void mostrarClima(String lugarId) {
        double[] coords = mapaCoordenadas.get(lugarId);
        if (coords != null) {
            String clima = api.obtenerClimaPorCoordenadas(coords[0], coords[1]);
            System.out.println("-------------------------------------------------------");
            System.out.println("Clima en " + lugarId + ": " + clima);
            System.out.println("-------------------------------------------------------");
        } else {
            System.out.println("⚠️ Coordenadas no disponibles para " + lugarId);
        }
    }
}
