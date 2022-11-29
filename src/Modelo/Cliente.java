
package Modelo;


public class Cliente {
    private int id_cliente;
    private String nombre_cliente;
    private String apellido_cliente;
    private int Dni_cliente;
    private int edad_cliente;
    private String correo_cliente;

    public Cliente() {
    }

    public Cliente(int id_cliente, String nombre_cliente, String apellido_cliente, int Dni_cliente, int edad_cliente, String correo_cliente) {
        this.id_cliente = id_cliente;
        this.nombre_cliente = nombre_cliente;
        this.apellido_cliente = apellido_cliente;
        this.Dni_cliente = Dni_cliente;
        this.edad_cliente = edad_cliente;
        this.correo_cliente = correo_cliente;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getApellido_cliente() {
        return apellido_cliente;
    }

    public void setApellido_cliente(String apellido_cliente) {
        this.apellido_cliente = apellido_cliente;
    }

    public int getDni_cliente() {
        return Dni_cliente;
    }

    public void setDni_cliente(int Dni_cliente) {
        this.Dni_cliente = Dni_cliente;
    }

    public int getEdad_cliente() {
        return edad_cliente;
    }

    public void setEdad_cliente(int edad_cliente) {
        this.edad_cliente = edad_cliente;
    }

    public String getCorreo_cliente() {
        return correo_cliente;
    }

    public void setCorreo_cliente(String correo_cliente) {
        this.correo_cliente = correo_cliente;
    }
    

}