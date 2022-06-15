package modelo;

import java.util.Date;

public class Usuario {
    private String username;
    private String email;
    private String contraseña;
    private String domicilio;
    private String DNI;
    private Date fechaNac;
    private String rol;

    public Usuario(String username, String email, String contraseña, String domicilio, String DNI, Date fechaNac, String rol) {
        this.username = username;
        this.email = email;
        this.contraseña = contraseña;
        this.domicilio = domicilio;
        this.DNI = DNI;
        this.fechaNac = fechaNac;
        this.rol = rol;
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
