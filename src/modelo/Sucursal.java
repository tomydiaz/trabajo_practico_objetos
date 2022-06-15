package modelo;

public class Sucursal {
    private String _id;
    private String numero;
    private String direccion;

    public Sucursal(String _id, String numero, String direccion) {
        this._id = _id;
        this.numero = numero;
        this.direccion = direccion;
    }

    public String get_id() {
        return _id;
    }

    public String getNumero() {
        return numero;
    }

    public String getDireccion() {
        return direccion;
    }
}
