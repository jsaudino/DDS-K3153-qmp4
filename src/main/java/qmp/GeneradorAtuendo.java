package qmp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class GeneradorAtuendo {

  Map<Categoria, List<Prenda>> prendasPorCategoria;

  public GeneradorAtuendo(Map<Categoria, List<Prenda>> prendasPorCategoria) {
    this.prendasPorCategoria = prendasPorCategoria;
  }

  public Atuendo generarAtuendo() {
    List<Prenda> prendasDeAtuendo = new ArrayList<>();

    Integer temperatura = 10;
    //TODO: obtener del monitor climatico

    Arrays.stream(Categoria.values()).forEach( categoria -> {
          prendasDeAtuendo.add( obtenerPrendaDeUnaCategoria(categoria, temperatura));
        }
      );

    return new Atuendo(prendasDeAtuendo);
  }

  private Prenda obtenerPrendaDeUnaCategoria(Categoria categoria, Integer temperatura) {
    return prendasPorCategoria.get(categoria).stream()
        .filter( prenda -> prenda.esAdecuadoParaTemperatura(temperatura) )
        .findAny().get();

  }
}
