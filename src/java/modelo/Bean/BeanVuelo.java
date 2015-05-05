
package modelo.Bean;


/**
 *
 * @author Andres Montoya
 */
public class BeanVuelo {
    
    private String idvuelo;
    private String fechaSalida;
    private String fechaLlegada;
    private String origen;
    private String destino;
    private String aerolinea;
    private String horaSalida;
    private String horaLlegada;
    private int tiempo_vuelo;
    private int precio;
    private int n_puestos;

    public BeanVuelo(String idvuelo, String fechaSalida, String fechaLlegada, String origen, String destino, String horaSalida, String horaLlegada, String aerolinea,int tiempo_vuelo, int precio, int n_puestos) {
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

    public String getfechaSalida() {
        return fechaSalida;
    }

    public void setfechaSalida(String salida) {
        this.fechaSalida = salida;
    }

    public String getfechaLlegada() {
        return fechaLlegada;
    }

    public void setfechaLlegada(String llegada) {
        this.fechaLlegada = llegada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(String fechaLlegada) {
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
