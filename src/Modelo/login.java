
package Modelo;

import java.util.List;

public class login {
   
    private int idEmpleado;
    private int Usuario;
    private String Password;
    private int parqueIdParque;
    private String nombre;
    private String apellido;
    private int dni;
    private int edad;
    private List<Juego> listJuegos;
    public login() {
    }

    public login(int idEmpleado, int Usuario, String Password) {
       
        this.Usuario = Usuario;
        this.Password = Password;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getUsuario() {
        return Usuario;
    }

    public void setUsuario(int Usuario) {
        this.Usuario = Usuario;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public int getParqueIdParque() {
        return parqueIdParque;
    }

    public void setParqueIdParque(int parqueIdParque) {
        this.parqueIdParque = parqueIdParque;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public List<Juego> getListJuegos() {
        return listJuegos;
    }

    public void setListJuegos(List<Juego> listJuegos) {
        this.listJuegos = listJuegos;
    }

        
}
