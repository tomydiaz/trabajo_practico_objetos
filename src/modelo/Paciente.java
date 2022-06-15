package modelo;

import java.util.ArrayList;

public class  Paciente {
    private String _id;
    private String DNI;
    private String nombre;
    private String apellido;
    private String domicilio;
    private String email;
    private String sexo;
    private String edad;
    private ArrayList<String> idPeticionesAsignadas;

    public Paciente(String _id, String DNI, String nombre, String apellido, String domicilio, String email, String sexo) {
        this._id = _id;
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

    public String getDNI() {
        return this.DNI;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getDomicilio() {
        return this.domicilio;
    }

    public String getEmail() {
        return this.email;
    }

    public String getSexo() {
        return this.sexo;
    }

    public String getEdad() {
        return this.edad;
    }

    public ArrayList<String> getIdPeticionesAsignadas() {
        return idPeticionesAsignadas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }


}
