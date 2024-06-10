package cl.praxis.entity;
import cl.praxis.praxis.modelos.Persona;
import cl.praxis.praxis.modelos.servicios.ServicioPersona;
import org.junit.jupiter.api.*;

import java.util.Map;
import java.util.logging.Logger;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DisplayName("Test clase ServicioPersona")

public class ServicioPersonaTest {
    private static Logger logger =
            Logger.getLogger("cl.desafiolatam.servicios.ServicioPersonaTest");
    private final ServicioPersona servicioPersona=new ServicioPersona();

  @Test
    public void testCrearPersona(){
      logger.info("Info test crear persona");
      Persona juanito = new Persona("12345-2", "Juanito");
      String respuestaServicio = servicioPersona.crearPersona(juanito);
      assertEquals ("Creada", respuestaServicio);
  }

  @Test
    public void testActualizarPersona() {
      logger.info("Info actualizar persona");
      Persona pepe = new Persona("32423423-3", "Pepe");
      String respuestaServicio = servicioPersona.actualizarPersona(pepe);
      assertEquals("Actualizada", respuestaServicio);
  }

  @Test
  public void testListarPersona() {
    logger.info("info listar persona");
    Map<String, String> listaPersonas = servicioPersona.listarPersonas();
    assertNotNull(listaPersonas);
  }

  @Test
  public void  testEliminarPersona() {
    logger.info("info eliminar persona");
    Persona juanito =   new Persona("12321313-2", "Juanito");
    servicioPersona.crearPersona(juanito);
    String respuestaServicio = servicioPersona.eliminarPersona(juanito);
    assertEquals("Eliminada", respuestaServicio);

  }


}
