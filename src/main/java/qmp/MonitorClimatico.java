package qmp;
import accuweather.AccuWeatherAPI;
import java.util.List;
import java.util.Map;

public class MonitorClimatico {

  AccuWeatherAPI apiClima;
  private static final MonitorClimatico INSTANCE = new MonitorClimatico();

  public static MonitorClimatico instance() {
    return INSTANCE;
  }
  private MonitorClimatico() {
    AccuWeatherAPI apiClima = new AccuWeatherAPI();
  }

  public List<Map<String, Object>> getCondicionesClimaticasBuenosAires() {
    return apiClima.getWeather("Buenos Aires, Argentina");
  }

  public Integer getTemperaturaBuenosAires() {
    return getCondicionesClimaticasBuenosAires().get(0).get("Temperature").get("Value");
  }

}
