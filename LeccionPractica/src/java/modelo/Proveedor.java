/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author sandr
 */
public class Proveedor {
    private int id_proveedor;
    private String ruc;
    private String telefono;
    private String pais;
    private String correo;
    private String moneda;
    
    ArrayList<Productos> ListaProdcutos; //relacion

    public Proveedor(int id_proveedor, String ruc, String telefono, String pais, String correo, String moneda) {
        this.id_proveedor = id_proveedor;
        this.ruc = ruc;
        this.telefono = telefono;
        this.pais = pais;
        this.correo = correo;
        this.moneda = moneda;
    }

    public Proveedor() {
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }
}
