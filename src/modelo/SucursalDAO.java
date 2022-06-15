package modelo;

import utils.GenericDAO;

public class SucursalDAO extends GenericDAO {
    public SucursalDAO() throws Exception {
        super(Sucursal.class, "src/txtData/sucursales.json");
    }
}
