/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Bean.BeanVuelo;
import com.mysql.jdbc.Connection;
import java.util.List;

/**
 *
 * @author Andres Montoya
 */
public interface InterfaceDaoVuelo {
    
    public boolean insert(BeanVuelo tVuelo, Connection conexion)throws Exception;
    public BeanVuelo getByCode(String codigo_vuelo, Connection conexion)throws Exception;
    public List<BeanVuelo> getAll(Connection conexion)throws Exception;
    public boolean update(BeanVuelo tVuelo, Connection conexion)throws Exception;
    public boolean insert(String codigo_vuelo, Connection conexion)throws Exception;
}
