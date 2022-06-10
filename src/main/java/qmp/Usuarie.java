package qmp;

import java.util.ArrayList;
import java.util.List;

public class Usuarie {

  //puse este nombre para distinguir que es plural y no un solo guardarropas
  List<Guardarropas> losGuardarropas;

  public Usuarie() {
    this.losGuardarropas = new ArrayList<>();
  }

  void agregarGuardarropas(Guardarropas guardarropas) {
    this.losGuardarropas.add(guardarropas);
  }

  List<Guardarropas> obtenerTodosLosGuardarropas() {
    return this.losGuardarropas;
  }

}
