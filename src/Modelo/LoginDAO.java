
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class LoginDAO {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();
    JuegoDAO juegos = new JuegoDAO();
    
    public login log(String Usuario, String Password){
        login l = new login();
        String sql = "SELECT * FROM empleado WHERE Usuario = ? AND Password = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, Usuario);
            ps.setString(2, Password);
            rs= ps.executeQuery();
            if (rs.next()) {
                l.setUsuario(rs.getInt("Usuario"));
                l.setPassword(rs.getString("Password"));
                l.setNombre(rs.getString("nombre_empleado"));
                l.setIdEmpleado(rs.getInt("idEmpleado"));
                //l.setListJuegos(juegos.JuegosEmpleado(l.getIdEmpleado()));
              
                
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return l;
    }
}
  /*  
    public boolean Registrar(login reg){
        String sql = "INSERT INTO usuarios (nombre, correo, pass, rol) VALUES (?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, reg.getUsuario());
            ps.setString(2, reg.getPassword());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }
    
    public List ListarUsuarios(){
       List<login> Lista = new ArrayList();
       String sql = "SELECT * FROM usuarios";
       try {
           con = cn.getConnection();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while (rs.next()) {               
               login lg = new login();
               lg.setId(rs.getInt("id"));
               lg.setNombre(rs.getString("nombre"));
               lg.setCorreo(rs.getString("correo"));
               lg.setRol(rs.getString("rol"));
               Lista.add(lg);
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return Lista;
   }
}
*/