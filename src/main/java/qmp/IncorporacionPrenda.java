package qmp;

public class IncorporacionPrenda implements Sugerencia {

  private Prenda prenda;

  public IncorporacionPrenda(Prenda prenda) {
    this.prenda = prenda;
  }

  @Override
  public void aplicarEn(Guardarropas guardarropas) {
    guardarropas.agregarPrenda(this.prenda);
  }

  @Override
  public void deshacer(Guardarropas guardarropas) {
    guardarropas.removerPrenda(this.prenda);
  }
}
