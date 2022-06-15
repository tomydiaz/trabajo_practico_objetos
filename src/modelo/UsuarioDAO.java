package modelo;

import utils.GenericDAO;

public class UsuarioDAO extends GenericDAO {
    public UsuarioDAO() throws Exception {
        super(Usuario.class, "src/txtData/usuarios.json");
    }
}
