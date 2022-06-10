package qmp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuardarropasTest {

  @Test
  void usuariesPuedenCompartirElMismoGuardarropas() {

    Guardarropas guardarropas = new Guardarropas("ropa de viaje");

    Usuarie pepito = new Usuarie();
    Usuarie pepita = new Usuarie();
    pepito.agregarGuardarropas(guardarropas);
    pepita.agregarGuardarropas(guardarropas);

    Guardarropas guardarropasPepito = pepita.obtenerTodosLosGuardarropas().get(0);
    Guardarropas guardarropasPepita = pepito.obtenerTodosLosGuardarropas().get(0);
    assertEquals(guardarropasPepito, guardarropasPepita);
  }

}