/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

/**
 *
 * @author Andres Montoya
 */
public class BeanTiquete {
    
    private String id_tiquete;
    private String id_usuario;
    private int precio;
    private String in_factura;
    private String id_vuelo;

    public BeanTiquete(String id_tiquete, String id_usuario, int precio, String in_factura, String id_vuelo) {
        this.id_tiquete = id_tiquete;
        this.id_usuario = id_usuario;
        this.precio = precio;
        this.in_factura = in_factura;
        this.id_vuelo = id_vuelo;
    }

    public String getId_tiquete() {
        return id_tiquete;
    }

    public void setId_tiquete(String id_tiquete) {
        this.id_tiquete = id_tiquete;
    }
    
    public String getId_vuelo() {
        return id_vuelo;
    }

    public void setId_vuelo(String id_vuelo) {
        this.id_vuelo = id_vuelo;
    }

    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getIn_factura() {
        return in_factura;
    }

    public void setIn_factura(String in_factura) {
        this.in_factura = in_factura;
    }
    
    
    
}
