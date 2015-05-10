
package DBconexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ClassConex {
    
public String driver,urlbd,usrbd,passbd;
public Connection conexion;

    public ClassConex(){
        driver="com.mysql.jdbc.Driver";
        usrbd ="root";
        passbd ="";
        urlbd="jdbc:mysql://localhost/easytickets";

        try
        { Class.forName(driver).newInstance();
        conexion=DriverManager.getConnection(urlbd,usrbd,passbd);
        System.out.println("Conexion a Base de Datos: status Ok!");
        }
        catch (Exception e){
            System.out.println("Error al tratar de abrir la base de Datos"+e);
        }
    }

    public Connection ObtenerConexion()
    { 
        return conexion;
    }

    public Connection CerrarConexion() throws SQLException
    { 
      conexion.close();
      conexion = null;
      return conexion;
    }

} //fin de la clase



