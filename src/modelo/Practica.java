package modelo;

import java.util.UUID;

public class Practica {
    private final UUID _id;
    private String codigo;
    private String nombre;
    private String horasResultado;
    private boolean habilitada;
    private boolean usada;

    public Practica(String codigo, String nombre, String horasResultado, boolean habilitada, boolean usada) {
        this._id = UUID.randomUUID();
        this.codigo = codigo;
        this.nombre = nombre;
        this.horasResultado = horasResultado;
        this.habilitada = habilitada;
        this.usada = usada;
    }

    public UUID get_id() {
        return _id;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getHorasResultado() {
        return horasResultado;
    }

    public boolean isHabilitada() {
        return habilitada;
    }

    public boolean isUsada() {
        return usada;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    };

    public void setHorasResultado(String horasResultado) {
        this.horasResultado = horasResultado;
    };

    public void setHabilitada(boolean habilitada) {
        this.habilitada = habilitada;
    }



    public void setUsada(boolean usada) {
        this.usada = usada;
    }
}


