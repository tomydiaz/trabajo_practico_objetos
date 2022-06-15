package modelo;

import utils.GenericDAO;

public class PacienteDAO extends GenericDAO {
    public PacienteDAO() throws Exception {
        super(Paciente.class, "C:\\Users\\pinaalu\\Downloads\\git\\trabajo_practico_objetos\\src\\txtData\\pacientes.json");
    }
}
