/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.Dao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import util.ClassConex;
/**
 *
 * @author Andres Montoya
 */
public class DAO_IS_usuario extends ClassConex {
    
    private Connection conn = null;
    private Statement st = null;
    private ResultSet rs = null;
    
    public DAO_IS_usuario()
    {
        super();
    }
    
    public boolean validar(String mail, String cc)
    {
        boolean encontrado = false;
        
        try 
        {
            conn = this.ObtenerConexion();
            st = conn.createStatement();
            rs = st.executeQuery("select * from usuario where email='"+mail+"'and cedula="+cc+";");
            //preguntar si la encontro al menos un registro
            if (rs.next())
            {
                encontrado = true;
            }
        this.CerrarConexion();
        } 
        catch (Exception e) 
        {
            
        }
        
        return encontrado;
    }
    
}
