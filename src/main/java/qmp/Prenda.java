package qmp;

class Prenda {
  Tipo tipo;
  Material material;
  Trama trama;
  Integer temperaturaMaximaAdecuada;

  public Prenda(Tipo tipo, Material material, Trama trama, Integer temperaturaMaximaAdecuada) {
    this.tipo = tipo;
    this.material = material;
    this.trama = trama;
    this.temperaturaMaximaAdecuada = temperaturaMaximaAdecuada;
  }

  public Boolean esAdecuadoParaTemperatura(Integer temperatura) {
    return temperatura <= this.temperaturaMaximaAdecuada;
  }

  Categoria categoria() {
    return tipo.getCategoria();
  }
}