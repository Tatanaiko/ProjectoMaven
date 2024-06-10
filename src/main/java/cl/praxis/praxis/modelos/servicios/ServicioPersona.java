package cl.praxis.praxis.modelos.servicios;

import cl.praxis.praxis.modelos.Persona;

import java.util.HashMap;
import java.util.Map;

public class ServicioPersona {


    private Map<String, String> personasDB = new HashMap<>();{}

        public String crearPersona(Persona persona1) {
            if (persona1 != null) {
                personasDB.put(persona1.getRut(), persona1.getNombre());
                return "Creada";
            } else {
                return "No creada";
            }
        }

        public String actualizarPersona(Persona persona1) {
            if (persona1 != null) {
                personasDB.put(persona1.getRut(), persona1.getNombre());
                return "Actualizada";
            } else {
                return "No actualizada";
            }
        }

        public Map<String, String> listarPersonas() {
            return personasDB;
        }

        public String eliminarPersona(Persona persona1) {
            if (persona1 != null) {
                personasDB.remove(persona1.getRut());
                return "Eliminada";
            } else {
                return "No eliminada";
            }
        }

}


