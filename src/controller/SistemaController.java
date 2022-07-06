package controller;

import modelo.Usuario;
import modelo.UsuarioDAO;
import java.util.ArrayList;

public final class SistemaController {
    private static SistemaController instance;
    public String value;
    public ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
    public UsuarioDAO dao;

    {
        try {
            dao = new UsuarioDAO();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static SistemaController getInstance() {
        if (instance == null) {
            instance = new SistemaController();
        }
        return instance;
    }
}