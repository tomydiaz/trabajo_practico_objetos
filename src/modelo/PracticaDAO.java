package modelo;

import utils.GenericDAO;

public class PracticaDAO extends GenericDAO {
    public PracticaDAO() throws Exception {
        super(Sucursal.class, "src/txtData/practicas.json");
    }
}
