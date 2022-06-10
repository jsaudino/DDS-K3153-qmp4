package servicios;
import accuweather.AccuWeatherAPI;
import servicios.EstadoDelTiempo;

import java.util.Map;

public class ServicioMeteorologicoAccuweather {

  AccuWeatherAPI apiClima;

  private ServicioMeteorologicoAccuweather() {
    AccuWeatherAPI apiClima = new AccuWeatherAPI();
  }

  private EstadoDelTiempo getCondicionesClimaticas(String ubicacion) {
    Map<String, Object> clima = apiClima.getWeather(ubicacion).get(0);
    Map<String, Object> temperatura = (Map<String, Object>) clima.get("Temperature");

    return new EstadoDelTiempo((Integer) temperatura.get("Value") );
  }

  public Integer getTemperatura(String ubicacion) {
    return getCondicionesClimaticas(ubicacion).getTemperatura();
  }

}
