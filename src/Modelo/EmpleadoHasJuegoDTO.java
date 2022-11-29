/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class EmpleadoHasJuegoDTO {
    
    private int EmpleadoIdEmpleado;
    private int JuegoIdJuego;

    public EmpleadoHasJuegoDTO() {
    }

    public EmpleadoHasJuegoDTO(int EmpleadoIdEmpleado, int JuegoIdJuego) {
        this.EmpleadoIdEmpleado = EmpleadoIdEmpleado;
        this.JuegoIdJuego = JuegoIdJuego;
    }

    public int getEmpleadoIdEmpleado() {
        return EmpleadoIdEmpleado;
    }

    public void setEmpleadoIdEmpleado(int EmpleadoIdEmpleado) {
        this.EmpleadoIdEmpleado = EmpleadoIdEmpleado;
    }

    public int getJuegoIdJuego() {
        return JuegoIdJuego;
    }

    public void setJuegoIdJuego(int JuegoIdJuego) {
        this.JuegoIdJuego = JuegoIdJuego;
    }
    
    
}
