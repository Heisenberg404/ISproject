
package Bean;

import java.sql.Date;


/**
 *
 * @author Andres Montoya
 */
public class BeanVuelo {
    
    private String idvuelo;
    private Date fechaSalida;
    private Date fechaLlegada;
    private String origen;
    private String destino;
    private String aerolinea;
    private String horaSalida;
    private String horaLlegada;
    private int tiempo_vuelo;
    private int precio;
    private int n_puestos;

    public BeanVuelo(String idvuelo, Date fechaSalida, Date fechaLlegada, int tiempo_vuelo, String origen, String destino, String aerolinea, int precio, int n_puestos, String horaSalida, String horaLlegada) {
        this.idvuelo = idvuelo;
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLlegada;
        this.origen = origen;
        this.destino = destino;
        this.horaLlegada = horaLlegada;
        this.horaSalida = horaSalida;
        this.aerolinea = aerolinea;
        this.tiempo_vuelo = tiempo_vuelo;
        this.precio = precio;
        this.n_puestos = n_puestos;
        
    }
    
    public BeanVuelo()
    {
    }
    
    public BeanVuelo(String idVuelo)
    {
        this.idvuelo = idVuelo;
    }
    
    
    
    public int getTiempo_vuelo() {
        return tiempo_vuelo;
    }

    public void setTiempo_vuelo(int tiempo_vuelo) {
        this.tiempo_vuelo = tiempo_vuelo;
    }

        
    public String getIdvuelo() {
        return idvuelo;
    }

    public void setIdvuelo(String idvuelo) {
        this.idvuelo = idvuelo;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }
    
    
    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }
    
    
    
    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getN_puestos() {
        return n_puestos;
    }

    public void setN_puestos(int n_puestos) {
        this.n_puestos = n_puestos;
    }
    
    
    
    
    
}
