/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Bean.BeanVuelo;
import com.mysql.jdbc.Connection;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author Andres Montoya
 */
public class DaoTVuelo implements Interface.InterfaceDaoVuelo {

    @Override
    public boolean insert(BeanVuelo tVuelo, Connection conexion) throws Exception {
        Statement statement;
        statement =(Statement)conexion.createStatement();
        String query = "insert into vuelo values('"+tVuelo.getIdvuelo()+"','"+tVuelo.getFechaSalida()+"','"+tVuelo.getFechaLlegada()+"','"+tVuelo.getTiempo_vuelo()+"','"+tVuelo.getOrigen()+"','"+tVuelo.getDestino()+"','"+tVuelo.getAerolinea()+"','"+tVuelo.getPrecio()+"','"+tVuelo.getN_puestos()+"','"+tVuelo.getHoraSalida()+"','"+tVuelo.getHoraLlegada()+"');";
        statement.execute(query);
        statement.close();
        return true;
    }

    @Override
    public BeanVuelo getByCode(String codigo_vuelo, Connection conexion) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<BeanVuelo> getAll(Connection conexion) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(BeanVuelo tVuelo, Connection conexion) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean insert(String codigo_vuelo, Connection conexion) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
