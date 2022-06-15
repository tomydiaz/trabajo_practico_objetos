package controller;

import modelo.Sucursal;
import modelo.SucursalDAO;
import java.util.ArrayList;

public final class SucursalController {
    private static SucursalController instance;
    public String value;
    public ArrayList<Sucursal> listaSucursales = new ArrayList<Sucursal>();
    public SucursalDAO dao;

    {
        try {
            dao = new SucursalDAO();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static SucursalController getInstance() {
        if (instance == null) {
            instance = new SucursalController();
        }
        return instance;
    }
}