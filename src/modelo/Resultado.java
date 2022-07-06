package modelo;

import java.util.UUID;

public class Resultado {
    private final UUID _id;
    private Peticion peticion;
    private Practica practicaAsociada;
//    private TipoValor valor;
//    private TipoEstado estado;

    public Resultado(Peticion peticion, Practica practicaAsociada) {
        this._id = UUID.randomUUID();
        this.peticion = peticion;
        this.practicaAsociada = practicaAsociada;
    }

    public UUID get_id() {
        return _id;
    }

    public Peticion getPeticion() {
        return peticion;
    }

    public Practica getPracticaAsociada() {
        return practicaAsociada;
    }
}
