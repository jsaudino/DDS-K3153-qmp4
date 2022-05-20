package qmp;

import static java.util.Objects.requireNonNull;

class Tipo {
  String nombre;
  Categoria categoria;

  Tipo(String nombre, Categoria categoria) {
    requireNonNull(categoria, "categoria no debe ser null");
    this.nombre = nombre;
    this.categoria = categoria;
  }

  public String getNombre() {
    return nombre;
  }

  public Categoria getCategoria() {
    return categoria;
  }
}
