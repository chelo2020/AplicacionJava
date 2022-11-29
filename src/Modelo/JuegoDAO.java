
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class JuegoDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    
     public List ListarJuego(){
       List<Juego> JuegoCl = new ArrayList();
       String sql = "SELECT * FROM juego";
       try {
           con = cn.getConnection();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while (rs.next()) {               
               Juego ju = new Juego();
               ju.setIdJuego(rs.getInt("idJuego"));
               ju.setNombre_juego(rs.getString("nombre_juego"));
               ju.setCapacidad_Juego(rs.getInt("Capacidad_Juego"));
               JuegoCl.add(ju);
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return JuegoCl;
     } 
     
     public List JuegosEmpleado(int idEmpledo){
         List<Juego> todosJuegos = ListarJuego();
         List<Juego> juegosAux = new ArrayList();
         
         String sql = "SELECT empleado_has_juego.Juego_idJuego "
                 + "from empleado_has_juego "
                 + "where Empleado_idEmpleado = ?";
        try {
           con = cn.getConnection();
           ps = con.prepareStatement(sql);
           ps.setString(1, String.valueOf(idEmpledo));
           rs = ps.executeQuery();
           while (rs.next()) {             
               EmpleadoHasJuegoDTO relacion = new EmpleadoHasJuegoDTO();
               relacion.setEmpleadoIdEmpleado(rs.getInt("Empleado_idEmpleado"));
               relacion.setJuegoIdJuego(rs.getInt("Juego_idJuego"));
               
               for (Juego todosJuego : todosJuegos) {
                   
                   if(todosJuego.getIdJuego() == relacion.getJuegoIdJuego()){
                       juegosAux.add(todosJuego);
                   }
               }
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
         
         return juegosAux;
     }
}
