package modelo;

import utils.GenericDAO;

public class PacienteDAO extends GenericDAO {
    public PacienteDAO() throws Exception {
        super(Paciente.class, "src/txtData/pacientes.json");
    }
}
