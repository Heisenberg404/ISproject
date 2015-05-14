/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Bean.BeanVuelo;
import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
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
        BeanVuelo Tvuelo = null;
        Statement statement;
        ResultSet resultSet;
        //el objeto statement es el encargado de enviar consultas a la base de datos
        // la clase Resulset es la encargada de atrapar y almacenar los datos de una consulta.
        String query = "select * from vuelo where id_vuelo='"+codigo_vuelo+"'";
        statement =(Statement) conexion.createStatement();
        resultSet = statement.executeQuery(query);
        if (resultSet.next())
        {
            Tvuelo = new BeanVuelo();
            Tvuelo.setIdvuelo(resultSet.getString("id_vuelo"));
            Tvuelo.setFechaSalida(resultSet.getDate("fechaSalida"));
            Tvuelo.setFechaLlegada(resultSet.getDate("fechaLlegada"));
            Tvuelo.setTiempo_vuelo(resultSet.getInt("tiempo"));
            Tvuelo.setOrigen(resultSet.getString("origen"));
            Tvuelo.setDestino(resultSet.getString("destino"));
            Tvuelo.setAerolinea(resultSet.getString("aerolinea"));
            Tvuelo.setPrecio(resultSet.getInt("precio"));
            Tvuelo.setN_puestos(resultSet.getInt("numero_puestos"));
            Tvuelo.setHoraSalida(resultSet.getString("horaSalida"));
            Tvuelo.setHoraLlegada(resultSet.getString("horaLlegada"));
            
        }
        resultSet.close();
        statement.close();
        return Tvuelo;
            
    }

    @Override
    public List<BeanVuelo> getAll(Connection conexion) throws Exception {
        List<BeanVuelo> listaTVuelos = new ArrayList<>();
        Statement statement;
        ResultSet resultSet;
        //el objeto statement es el encargado de enviar consultas a la base de datos
        // la clase Resulset es la encargada de atrapar y almacenar los datos de una consulta.
        String query = "select * from vuelo";
        statement =(Statement) conexion.createStatement();
        resultSet = statement.executeQuery(query);
        BeanVuelo beanVuelo;
        while (resultSet.next())
        {
            beanVuelo = new BeanVuelo();
            beanVuelo.setIdvuelo(resultSet.getString("id_vuelo"));
            beanVuelo.setFechaSalida(resultSet.getDate("fechaSalida"));
            beanVuelo.setFechaLlegada(resultSet.getDate("fechaLlegada"));
            beanVuelo.setTiempo_vuelo(resultSet.getInt("tiempo"));
            beanVuelo.setOrigen(resultSet.getString("origen"));
            beanVuelo.setDestino(resultSet.getString("destino"));
            beanVuelo.setAerolinea(resultSet.getString("aerolinea"));
            beanVuelo.setPrecio(resultSet.getInt("precio"));
            beanVuelo.setN_puestos(resultSet.getInt("numero_puestos"));
            beanVuelo.setHoraSalida(resultSet.getString("horaSalida"));
            beanVuelo.setHoraLlegada(resultSet.getString("horaLlegada"));
            
            listaTVuelos.add(beanVuelo);
            
        }
        resultSet.close();
        statement.close();
        return listaTVuelos;
        
    }

    @Override
    public boolean update(BeanVuelo tVuelo, Connection conexion) throws Exception {
        Statement statement;
        String query = "update vuelo set fechaSalida='"+tVuelo.getFechaSalida()+"', fechaLlegada='"+tVuelo.getFechaLlegada()+"', tiempo='"+
                        tVuelo.getTiempo_vuelo()+"', origen='"+tVuelo.getOrigen()+"', destino='"+tVuelo.getDestino()+"', aerolinea='"+tVuelo.getAerolinea()+
                        "',precio='"+tVuelo.getPrecio()+"', numero_puestos='"+tVuelo.getN_puestos()+"',horaSalida='"+tVuelo.getHoraSalida()+
                        "',horaLlegada='"+tVuelo.getHoraLlegada()+"where id_vuelo='"+tVuelo.getIdvuelo()+"'";
        
        statement = (Statement) conexion.createStatement();
        statement.execute(query);
        statement.close();
        return true;
    }
    
    
    

    @Override
    public boolean delete(String codigo_vuelo, Connection conexion) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
