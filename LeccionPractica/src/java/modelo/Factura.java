/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author sandr
 */
public class Factura {
    
    private int id_factura;
    private String ruc;
    private int id_persona;
    private Date fecha;
    private Tipo_Pago id_tipo_pago;
    private double descuento;
    private double total;
    
    ArrayList<Item_Factura>  listdoItemFactura;

    public Factura() {
    }

    public Factura(int id_factura, String ruc, int id_persona, Date fecha, Tipo_Pago id_tipo_pago, double descuento, double total) {
        this.id_factura = id_factura;
        this.ruc = ruc;
        this.id_persona = id_persona;
        this.fecha = fecha;
        this.id_tipo_pago = id_tipo_pago;
        this.descuento = descuento;
        this.total = total;
    }

   

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
    
}
