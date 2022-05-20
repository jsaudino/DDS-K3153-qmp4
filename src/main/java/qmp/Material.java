package qmp;

import static java.util.Objects.requireNonNull;

class Material {
  String nombre;
  Trama trama;
  Color colorPrincipal;
  Color colorSecundario;

  Material(String nombre, Trama trama, Color colorPrincipal, Color colorSecundario) {
    this.nombre = nombre;
    this.trama = trama;
    requireNonNull(colorPrincipal, "el color principal no debe ser null");
    this.colorPrincipal = colorPrincipal;
    this.colorSecundario = colorSecundario;
  }
}
