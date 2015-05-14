/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;


import java.util.List;
import javax.ejb.Stateless;
import Bean.BeanVuelo;
import DAO.DaoTVuelo;
import DBconexion.Conexion;
import com.mysql.jdbc.Connection;

/**
 *
 * @author Andres Montoya
 */
@Stateless
public class ejbVuelo {

    private BeanVuelo tVuelo;
    private List<BeanVuelo> listaVuelo;
    private Connection conexion;
    private final DaoTVuelo daoTVuelo;
    
    public ejbVuelo()
    {
        tVuelo = new BeanVuelo();
        daoTVuelo = new DaoTVuelo();
    }
    
    public boolean insert()
    {
    boolean valor_retorno; 
        try 
        {
            conexion = Conexion.conexion();
            valor_retorno=daoTVuelo.insert(tVuelo, conexion);
            conexion.close();
            
        } 
        catch (Exception e) 
        {
            valor_retorno=false;
        }
    
    return valor_retorno;
    }
    
     public boolean listarVuelos()
    {
        boolean valor_retorno; 
        try 
        {
            conexion = Conexion.conexion();
            listaVuelo=daoTVuelo.getAll(conexion);
            conexion.close();
            valor_retorno = true;
        } 
        catch (Exception e) 
        {
            valor_retorno=false;
        }
    
    return valor_retorno;
    }
     
    public boolean leerPorIdVuelo(String id_vuelo)
    {
        boolean valor_retorno; 
        try 
        {
            conexion = Conexion.conexion();
            tVuelo=daoTVuelo.getByCode(id_vuelo, conexion);
            conexion.close();
            valor_retorno = true;
        } 
        catch (Exception e) 
        {
            valor_retorno=false;
        }
    
    return valor_retorno;
    }

    public boolean actualizarVuelo()
    {
        boolean valor_retorno; 
        try 
        {
            conexion = Conexion.conexion();
            daoTVuelo.update(tVuelo, conexion);
            conexion.close();
            valor_retorno = true;
        } 
        catch (Exception e) 
        {
            valor_retorno=false;
        }
    
        return valor_retorno;
    }
    
    public BeanVuelo gettVuelo() {
        return tVuelo;
    }
    
    
    public void settVuelo(BeanVuelo tVuelo) {
        this.tVuelo = tVuelo;
    }

    public List<BeanVuelo> getListaVuelo() {
        return listaVuelo;
    }

    public void setListaVuelo(List<BeanVuelo> listaVuelo) {
        this.listaVuelo = listaVuelo;
    }
    
    
}
