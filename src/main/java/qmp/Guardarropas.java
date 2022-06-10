package qmp;

import java.util.ArrayList;
import java.util.List;

public class Guardarropas {

  List<Prenda> prendas;
  List<Sugerencia> sugerenciasDePrendas;
  List<Sugerencia> sugerenciasAceptadas;
  String criterio;

  public Guardarropas(String criterio) {
    this.criterio = criterio;
    this.prendas = new ArrayList<>();
  }

  void agregarPrenda(Prenda prenda) {
    prendas.add(prenda);
  }

  void removerPrenda(Prenda prenda) {
    prendas.remove(prenda);
  }

  void sugerirIncorporarPrenda(Prenda prenda) {
    this.sugerenciasDePrendas.add(new IncorporacionPrenda(prenda));
  }

  void sugerirRemoverPrenda(Prenda prenda) {
    this.sugerenciasDePrendas.add(new RemocionPrenda(prenda));
  }

  void aceptarSugerencia(Sugerencia sugerencia) {
    this.sugerenciasDePrendas.remove(sugerencia);
    this.sugerenciasAceptadas.add(sugerencia);
    sugerencia.aplicarEn(this);
  }

  void rechazarSugerencia(Sugerencia sugerencia) {
    this.sugerenciasDePrendas.remove(sugerencia);
  }

  List<Sugerencia> obetenerSugerenciasPendientes() {
    return this.sugerenciasDePrendas;
  }

  void deshacerSugerencia(Sugerencia sugerencia) {
    this.sugerenciasAceptadas.remove(sugerencia);
    sugerencia.deshacer(this);
  }

  List<Sugerencia> obetenerSugerenciasAceptadas() {
    return this.sugerenciasDePrendas;
  }
}
