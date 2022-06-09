package qmp;

import java.util.List;
import java.util.Map;

public interface ServicioMeteorologico {

  EstadoDelTiempo getCondicionesClimaticas(String ubicacion);

  Integer getTemperatura(String ubicacion);
}
