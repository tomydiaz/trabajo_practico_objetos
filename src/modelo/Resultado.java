package modelo;

import java.util.concurrent.atomic.AtomicInteger;

public class Resultado {
    private static final AtomicInteger count = new AtomicInteger(0);
    private final int _id;
    private Peticion peticion;
    private Practica practicaAsociada;
//    private TipoValor valor;
//    private TipoEstado estado;

    public Resultado(Peticion peticion, Practica practicaAsociada) {
        this._id = count.incrementAndGet();
        this.peticion = peticion;
        this.practicaAsociada = practicaAsociada;
    }

    public int get_id() {
        return _id;
    }

    public Peticion getPeticion() {
        return peticion;
    }

    public Practica getPracticaAsociada() {
        return practicaAsociada;
    }
}
