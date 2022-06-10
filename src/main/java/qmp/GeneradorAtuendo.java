package qmp;

import servicios.ServicioMeteorologico;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class GeneradorAtuendo {

  Map<Categoria, List<Prenda>> prendasPorCategoria;
  ServicioMeteorologico servicioMeteorologico;

  public GeneradorAtuendo(Map<Categoria, List<Prenda>> prendasPorCategoria, ServicioMeteorologico servicioMeteorologico) {
    this.prendasPorCategoria = prendasPorCategoria;
    this.servicioMeteorologico = servicioMeteorologico;
  }

  public Atuendo generarAtuendo() {
    List<Prenda> prendasDeAtuendo = new ArrayList<>();

    Arrays.stream(Categoria.values()).forEach(categoria -> {
          prendasDeAtuendo.add(obtenerPrendaDeUnaCategoria(categoria, servicioMeteorologico.getTemperatura("Buenos Aires, Argentina")));
    });

    return new Atuendo(prendasDeAtuendo);
  }

  private Prenda obtenerPrendaDeUnaCategoria(Categoria categoria, Integer temperatura) {
    return prendasPorCategoria.get(categoria).stream()
        .filter(prenda -> prenda.esAdecuadoParaTemperatura(temperatura))
        .findAny().get();

  }
}
