package qmp;

import static java.util.Objects.requireNonNull;

class Borrador {
  Tipo tipo;
  Material material;
  Trama trama;
  Integer temperaturaMaximaAdecuada;

  public void setTipo(Tipo tipo) {
    this.tipo = tipo;
  }

  public void setMaterial(Material material) {
    this.material = material;
  }

  public void setTrama(Trama trama) {
    this.trama = trama;
  }

  public void setTemperaturaMaximaAdecuada(Integer temperaturaMaximaAdecuada) {
    this.temperaturaMaximaAdecuada = temperaturaMaximaAdecuada;
  }

  private void validar()  {
    requireNonNull(tipo, "tipo no debe ser null");
    requireNonNull(material, "material no debe ser null");
    requireNonNull(temperaturaMaximaAdecuada, "la temperatura maxima no debe ser null");
  }

  public Prenda crearPrenda() {
    validar();
    if (this.trama == null) {
      this.trama = Trama.LISA;
    }
    return new Prenda(this.tipo, this.material, this.trama, this.temperaturaMaximaAdecuada);
  }
}


