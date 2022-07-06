package modelo;

import java.util.UUID;

public class Sucursal {
    private final UUID _id;
    private String numero;
    private String direccion;

    public Sucursal(String _id, String numero, String direccion) {
        this._id = UUID.randomUUID();
        this.numero = numero;
        this.direccion = direccion;
    }

    public UUID get_id() {
        return _id;
    }

    public String getNumero() {
        return numero;
    }

    public String getDireccion() {
        return direccion;
    }
}
