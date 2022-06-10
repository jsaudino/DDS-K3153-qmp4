package servicios;

public interface ServicioMeteorologico {

  EstadoDelTiempo getCondicionesClimaticas(String ubicacion);

  Integer getTemperatura(String ubicacion);
}
