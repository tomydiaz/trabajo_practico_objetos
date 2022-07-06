package modelo;

import java.util.Date;
import java.util.UUID;

public class Usuario {
    private final UUID _id;
    private String username;
    private String email;
    private String contraseña;
    private String domicilio;
    private String DNI;
    private Date fechaNac;
    private String rol;  //TipoRol enum hacerlo!

    public Usuario(String username, String email, String contraseña, String domicilio, String DNI, Date fechaNac, String rol) {
        this._id = UUID.randomUUID();
        this.username = username;
        this.email = email;
        this.contraseña = contraseña;
        this.domicilio = domicilio;
        this.DNI = DNI;
        this.fechaNac = fechaNac;
        this.rol = rol;
    }

    public UUID get_id() {
        return _id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String getDNI() {
        return DNI;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public String getRol() {
        return rol;
    }
}
