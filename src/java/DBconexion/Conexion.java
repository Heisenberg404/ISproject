/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBconexion;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.exceptions.MySQLDataException;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Andres Montoya
 */
public class Conexion {
    public static Connection conexion()
    {
        Connection conexion = null;
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        String servidor="jdbc:mysql://localhost/easytickets";
        String usuario ="root";
        String contraseña = "";
        conexion=(Connection)DriverManager.getConnection(servidor, usuario, contraseña);
        }
        catch(ClassNotFoundException ex)
        {
            System.out.println(ex.getMessage());
        }
        catch(MySQLDataException ex)
        {
            System.out.println(ex.getMessage());
        }   
        catch(SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        finally
        {
            return conexion;
        }
    }
    
    
    
}
