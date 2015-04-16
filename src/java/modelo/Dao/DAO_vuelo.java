
package modelo.Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Bean.BeanVuelo;
import util.*;

public class DAO_vuelo extends ClassConex {
    
    public Connection conn=null;
    public Statement st=null;
    public ResultSet rs=null;
    public boolean encontrado=false;
    public boolean listo = false;
    public String id_vuelo;
    public String hora_fecha_llegada;
    public String hora_fecha_salida;
    public int tiempo;
    public String origen;
    public String destino;
    public String aerolinea;
    public int precio;
    public int asientos;
    
    public DAO_vuelo (BeanVuelo vuelo)
    {
        super();
        try 
            {
            conn = this.ObtenerConexion();
            st = conn.createStatement();
            
            id_vuelo = vuelo.getIdvuelo();
            hora_fecha_llegada = vuelo.getLlegada();
            hora_fecha_salida = vuelo.getSalida();
            tiempo = vuelo.getTiempo_vuelo();
            origen = vuelo.getOrigen();
            destino = vuelo.getDestino();
            aerolinea = vuelo.getAerolinea();
            precio = vuelo.getPrecio();
            asientos = vuelo.getN_puestos();
            
            }
        catch (SQLException ex)
            {
            Logger.getLogger(DAO_usuario.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    
    public boolean agregarVuelo() 
    {
        try 
        {
            st.executeUpdate("insert into vuelo values('"+id_vuelo+"','"+hora_fecha_salida+"','"+hora_fecha_llegada+"','"+tiempo+"','"+origen+"','"+destino+"','"+aerolinea+"','"+precio+"','"+asientos+"');");
            listo=true;
           
        }
        catch (SQLException ex) {
            Logger.getLogger(DAO_vuelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listo;
    }
    
    public boolean borrarVuelo() 
    {
          
        try 
        {
            st.executeUpdate("delete from vuelo where id_vuelo='"+id_vuelo+"';");
            listo=true;
           
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(DAO_vuelo.class.getName()).log(Level.SEVERE, null, ex);
      
        }
        return listo;
    }
    
    public boolean actualizarVuelo() 
    { //opcion 3.
        try 
        {
            st.executeUpdate("update  vuelo set horayfecha_salida='"+hora_fecha_salida+"',horayfecha_llegada='"+hora_fecha_llegada+"',tiempo='"+tiempo+"',origen='"+origen+"',destino='"+destino+"',aerolinea='"+aerolinea+"',precio='"+precio+"',asientos='"+asientos+"' where id_vuelo='"+id_vuelo+"';");
            listo=true;
           
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(DAO_vuelo.class.getName()).log(Level.SEVERE, null, ex);
      
        }
        return listo;
    }
    
    public ResultSet consultarRegistro() { //opcion 4.
         try {        
            rs = st.executeQuery("SELECT *  FROM vuelo where id_vuelo='';");
        } catch (SQLException ex) {
            Logger.getLogger(DAO_vuelo.class.getName()).log(Level.SEVERE, null, ex);
        }
         return rs;
    }

    public ResultSet listarTabla() { //opcion 5.
        try {        
            rs = st.executeQuery("SELECT id_cliente,nom_cliente,ape_cliente, genero_cliente  FROM cliente order by id_cliente;");
        } catch (SQLException ex) {
            Logger.getLogger(DAO_vuelo.class.getName()).log(Level.SEVERE, null, ex);
        }
         return rs;
        
    }
}