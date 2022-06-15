package modelo;

import java.util.concurrent.atomic.AtomicInteger;

public class Sucursal {
    private static final AtomicInteger count = new AtomicInteger(0);
    private final int _id;
    private String numero;
    private String direccion;

    public Sucursal(String _id, String numero, String direccion) {
        this._id = count.incrementAndGet();
        this.numero = numero;
        this.direccion = direccion;
    }

    public int get_id() {
        return _id;
    }

    public String getNumero() {
        return numero;
    }

    public String getDireccion() {
        return direccion;
    }
}
