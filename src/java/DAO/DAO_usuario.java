
package DAO;

import DBconexion.ClassConex;
import Interface.interfaceCRUD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import Bean.BeanUsuario;

/**
 *
 * @author Andres Montoya
 */
public class DAO_usuario extends ClassConex implements interfaceCRUD  {
    
    public Connection conn=null;
    public Statement st=null;
    public ResultSet rs=null;
    public boolean encontrado=false;
    public boolean listo = false;
    public String cedula;
    public String nombre;
    public String apellido;
    public String email;
    public String telefono;
    public String nombre_tarjeta;
    public String numero_tarjeta;
    public String banco;
    
    /**
     *
     * @param USUARIO
     */
    
    public DAO_usuario (BeanUsuario usuario)
    {
        super();
        try 
            {
            conn = this.ObtenerConexion();
            st = conn.createStatement();
            
            cedula = usuario.getCedula();
            nombre = usuario.getNombre();
            apellido = usuario.getApellido();
            email = usuario.getEmail();
            telefono = usuario.getTelefono();
            nombre_tarjeta = usuario.getNombre_tarjeta();
            numero_tarjeta = usuario.getNumero_tarjeta();
            banco = usuario.getBanco();
            
            }
        catch (SQLException ex)
            {
            Logger.getLogger(DAO_usuario.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    @Override
    public boolean agregarRegistro() 
    {
        try 
        {
            st.executeUpdate("insert into usuario values('"+cedula+"','"+nombre+"','"+apellido+"','"+email+"','"+telefono+"','"+nombre_tarjeta+"','"+numero_tarjeta+"','"+banco+"');");
            listo=true;
           
        }
        catch (SQLException ex) {
            Logger.getLogger(DAO_usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listo;
    }
    
    
    
}
