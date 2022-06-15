package modelo;

import utils.GenericDAO;

public class ResultadoDAO extends GenericDAO {
    public ResultadoDAO() throws Exception {
        super(Resultado.class, "src/txtData/resultados.json");
    }
}
