package qmp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import servicios.ServicioMeteorologico;

import static org.mockito.Mockito.mock;

class GeneradorAtuendoTest {
  private ServicioMeteorologico servicioMeteorologico;

  @BeforeEach
  void init() {
    servicioMeteorologico = mock(ServicioMeteorologico.class);
  }
  @Test
  void generarAtuendo() {
      //acá se probaría el generador con el servicio meteorologico mockeado
  }
}