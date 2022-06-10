package qmp;

public class RemocionPrenda implements Sugerencia {

  private Prenda prenda;

  public RemocionPrenda(Prenda prenda) {
    this.prenda = prenda;
  }

  @Override
  public void aplicarEn(Guardarropas guardarropas) {
    guardarropas.removerPrenda(this.prenda);
  }

  @Override
  public void deshacer(Guardarropas guardarropas) {
    guardarropas.agregarPrenda(this.prenda);
  }
}
