
package Tienda;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;


public class Vendedor {
    PreparedStatement ps;
    ResultSet rs;
       
    Conexion con=  new Conexion ();
    Connection acceso;
    
    public Empleado Validar(String dni, String user){
        Empleado em = new Empleado();
        String sql = "select * from vendedor where Dni=? and User=?";
        try{
            acceso=con.getConnection();
            ps = acceso.prepareStatement(sql);
            ps.setString(1, dni);
            ps.setString(2,user);
            rs=ps.executeQuery();
            while (rs.next()){
                em.setId(rs.getInt(1));
                em.setDni(rs.getString(2));
                em.setNom(rs.getString(3));
                em.setTelefono(rs.getInt(4));
                em.setDireccion(rs.getString(5));
                em.setUser(rs.getString(6));
                
            }
        }catch (Exception e){
            
        }
        return em;
    }
}
