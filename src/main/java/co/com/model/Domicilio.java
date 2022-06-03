/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.model;

/**
 *
 * @author jpatarroyo
 */
public class Domicilio {
    
    private String calle;
    private int numero;
    private String pais;

    public Domicilio() {
    }

    public Domicilio(String calle, int numero, String pais) {
        this.calle = calle;
        this.numero = numero;
        this.pais = pais;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Domicilio{" + "calle=" + calle + ", numero=" + numero + ", pais=" + pais + '}';
    }
}
