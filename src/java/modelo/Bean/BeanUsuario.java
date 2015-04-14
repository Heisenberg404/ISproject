/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.Bean;

/**
 *
 * @author Andres Montoya
 */
public class BeanUsuario {
    
    private String cedula;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private String nombre_tarjeta;
    private String numero_tarjeta;
    private String banco;
    
    public BeanUsuario(String cedula, String nombre, String apellido, String email, String telefono, String nombre_tarjeta, String numero_tarjeta, String banco)
    {
        this.cedula=cedula;
        this.nombre=nombre;
        this.apellido=apellido;
        this.email=email;
        this.telefono=telefono;
        this.nombre_tarjeta=nombre_tarjeta;
        this.numero_tarjeta=numero_tarjeta;
        this.banco=banco;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre_tarjeta() {
        return nombre_tarjeta;
    }

    public void setNombre_tarjeta(String nombre_tarjeta) {
        this.nombre_tarjeta = nombre_tarjeta;
    }

    public String getNumero_tarjeta() {
        return numero_tarjeta;
    }

    public void setNumero_tarjeta(String numero_tarjeta) {
        this.numero_tarjeta = numero_tarjeta;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }
    
    
    
}
