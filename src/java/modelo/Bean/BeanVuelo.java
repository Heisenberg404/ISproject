
package modelo.Bean;


/**
 *
 * @author Andres Montoya
 */
public class BeanVuelo {
    
    private String idvuelo;
    private String salida;
    private String llegada;
    private String origen;
    private String destino;
    private String aerolinea;
    private int precio;
    private int n_puestos;

    public BeanVuelo(String idvuelo, String salida, String llegada, String origen, String destino, String aerolinea, int precio, int n_puestos) {
        this.idvuelo = idvuelo;
        this.salida = salida;
        this.llegada = llegada;
        this.origen = origen;
        this.destino = destino;
        this.aerolinea = aerolinea;
        this.precio = precio;
        this.n_puestos = n_puestos;
    }

    public String getIdvuelo() {
        return idvuelo;
    }

    public void setIdvuelo(String idvuelo) {
        this.idvuelo = idvuelo;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public String getLlegada() {
        return llegada;
    }

    public void setLlegada(String llegada) {
        this.llegada = llegada;
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
