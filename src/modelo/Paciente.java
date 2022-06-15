package modelo;

public class Paciente {
    private String _id;
    private String DNI;
    private String nombre;
    private String domicilio;
    private String email;
    private String sexo;
    private String edad;

    public Paciente(String DNI, String nombre, String domicilio, String email, String sexo, String edad) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.email = email;
        this.sexo = sexo;
        this.edad = edad;
    }

    public String get_id() {
        return this._id;
    }
}