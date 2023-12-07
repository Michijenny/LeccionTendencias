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
public class Productos {
    private int id_producto;
    private int stock;
    private double precio_unitario;
    private String unidad;
    private Proveedor id_proveedor;//relacion
    private boolean iva;
    
    //RELACION DE UNO A MUCHOS DE PRODUCTO A ITEM_FACTURA
    private ArrayList <Item_Factura> Listaitems;

    public Productos(int id_producto, int stock, double precio_unitario, String unidad, Proveedor id_proveedor, boolean iva) {
        this.id_producto = id_producto;
        this.stock = stock;
        this.precio_unitario = precio_unitario;
        this.unidad = unidad;
        this.id_proveedor = id_proveedor;
        this.iva = iva;
    }

    public Productos() {
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public Proveedor getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(Proveedor id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public boolean isIva() {
        return iva;
    }

    public void setIva(boolean iva) {
        this.iva = iva;
    }

    
    
    
    
}
