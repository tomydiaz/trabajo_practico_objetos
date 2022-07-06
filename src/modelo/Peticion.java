package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class Peticion {
    private final UUID _id;
    private String codigo;
    private String obraSocial;
    private Date fechaCarga;
    private ArrayList<String> idPracticasAsociadas;
    private String estado;
    private ArrayList<String> idResultadosAsignados;

    public Peticion(String codigo, String obraSocial, Date fechaCarga, String estado) {
        this._id = UUID.randomUUID();
        this.codigo = codigo;
        this.obraSocial = obraSocial;
        this.fechaCarga = fechaCarga;
        this.estado = estado;
    }

    public UUID get_id() {
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

    public String getCodigo() {
        return codigo;
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

    public void setObraSocial(String obraSocial) {
        this.obraSocial = obraSocial;
    }

}

