package DAO;

/**
 *
 * @author Andres Montoya
 */

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import DBconexion.ClassConex;

public class DAO_IS_user extends ClassConex {
    
    private Connection conn = null;
    private Statement st = null;
    private ResultSet rs = null;

    public DAO_IS_user() {
        super();
    }
    
    public boolean validar(String email, String pass)
    {
        boolean encontrado = false;
        
        try 
        {
            conn = this.ObtenerConexion();
            st = conn.createStatement();
            rs = st.executeQuery("select * from usuario where email='"+email+"'and cedula="+pass+";");
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
