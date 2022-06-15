package modelo;

import utils.GenericDAO;

public class PeticionDAO extends GenericDAO {
    public PeticionDAO() throws Exception {
        super(Peticion.class, "src/txtData/peticiones.json");
    }
}
