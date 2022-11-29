
package Modelo;

public class Juego {
    
    private int idJuego;
    private String nombre_juego;
    private int Capacidad_Juego;

    public Juego() {
    }

    public Juego(int idJuego, String nombre_juego, int Capacidad_Juego) {
        this.idJuego = idJuego;
        this.nombre_juego = nombre_juego;
        this.Capacidad_Juego = Capacidad_Juego;
    }

    public int getIdJuego() {
        return idJuego;
    }

    public void setIdJuego(int idJuego) {
        this.idJuego = idJuego;
    }

    public String getNombre_juego() {
        return nombre_juego;
    }

    public void setNombre_juego(String nombre_juego) {
        this.nombre_juego = nombre_juego;
    }

    public int getCapacidad_Juego() {
        return Capacidad_Juego;
    }

    public void setCapacidad_Juego(int Capacidad_Juego) {
        this.Capacidad_Juego = Capacidad_Juego;
    }

    public Object getEmpleadoIdEmpleado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

