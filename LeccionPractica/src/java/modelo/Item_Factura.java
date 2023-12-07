/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;

/**
 *
 * @author sandr
 */
public class Item_Factura {

    private int id_item_factura;
    private Factura id_factura;
    private Productos id_producto; //relacion
    private int cantidad;
    private double precio;
    private double subtotal;
   

    public Item_Factura() {
    }

    public Item_Factura(int id_item_factura, Factura id_factura, int id_producto, int cantidad, double precio, double subtotal) {
        this.id_item_factura = id_item_factura;
        this.id_factura = id_factura;
        this.cantidad = cantidad;
        this.precio = precio;
        this.subtotal = subtotal;
    }

    

    public int getId_item_factura() {
        return id_item_factura;
    }

    public void setId_item_factura(int id_item_factura) {
        this.id_item_factura = id_item_factura;
    }

    public Factura getId_factura() {
        return id_factura;
    }

    public void setId_factura(Factura id_factura) {
        this.id_factura = id_factura;
    }

    public Productos getId_producto() {
        return id_producto;
    }

    public void setId_producto(Productos id_producto) {
        this.id_producto = id_producto;
    }

    

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

  

}
