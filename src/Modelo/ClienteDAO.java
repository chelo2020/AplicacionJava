/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ClienteDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
     public List ListarCliente(){
       List<Cliente> ListaCl = new ArrayList();
       String sql = "SELECT * FROM cliente";
       try {
           con = cn.getConnection();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while (rs.next()) {               
               Cliente cl = new Cliente();
               cl.setId_cliente(rs.getInt("idCliente"));
               cl.setNombre_cliente(rs.getString("nombre_cliente"));
               cl.setApellido_cliente(rs.getString("apellido_cliente"));
               cl.setDni_cliente(rs.getInt("dni_cliente"));
               cl.setEdad_cliente(rs.getInt("edad_cliente"));
               cl.setCorreo_cliente(rs.getString("CorreoElectronico"));
               ListaCl.add(cl);
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return ListaCl;
   }
    public List Buscarcliente2(String Nombre){
       List<Cliente> ListaC2 = new ArrayList();
       String sql = "SELECT * FROM cliente WHERE nombre_cliente=?";
       try {
           con = cn.getConnection();
           ps = con.prepareStatement(sql);
           ps.setString(1,Nombre);
           rs=ps.executeQuery();
           while(rs.next()) {
               Cliente cl2 = new Cliente();
               cl2.setId_cliente(rs.getInt("idCliente"));
               cl2.setNombre_cliente(rs.getString("nombre_cliente"));
               cl2.setApellido_cliente(rs.getString("apellido_cliente"));
               cl2.setDni_cliente(rs.getInt("dni_cliente"));
               cl2.setEdad_cliente(rs.getInt("edad_cliente"));
               cl2.setCorreo_cliente(rs.getString("CorreoElectronico"));
               ListaC2.add(cl2);
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return ListaC2;
    }
   
}
