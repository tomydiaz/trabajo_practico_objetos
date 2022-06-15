package modelo;

public class Resultado {
    private String _id;
    private Peticion peticion;
    private Practica practicaAsociada;
//    private TipoValor valor;
//    private TipoEstado estado;

    public Resultado(String _id, Peticion peticion, Practica practicaAsociada) {
        this._id = _id;
        this.peticion = peticion;
        this.practicaAsociada = practicaAsociada;
    }

    public String get_id() {
        return _id;
    }

    public Peticion getPeticion() {
        return peticion;
    }

    public Practica getPracticaAsociada() {
        return practicaAsociada;
    }
}
