package modelo;

import java.util.ArrayList;
import java.util.Date;

public class Peticion {
    private String _id;
    private String obraSocial;
    private Date fechaCarga;
    private ArrayList<String> idPracticasAsociadas;
    private String estado;
    private ArrayList<String> idResultadosAsignados;

    public Peticion(String obraSocial, Date fechaCarga, String estado) {
        this.obraSocial = obraSocial;
        this.fechaCarga = fechaCarga;
        this.estado = estado;
    }

    public String get_id() {
        return _id;
    }

    public String getObraSocial() {
        return obraSocial;
    }

    public Date getFechaCarga() {
        return fechaCarga;
    }

    public String getEstado() {
        return estado;
    }

    public ArrayList<String> getIdResultadosAsignados() {
        return idResultadosAsignados;
    }

    public ArrayList<String> getIdPracticasAsociadas() {
        return idPracticasAsociadas;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}

