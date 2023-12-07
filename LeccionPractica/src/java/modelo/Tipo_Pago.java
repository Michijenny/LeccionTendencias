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
public class Tipo_Pago {

    private int id_tipo_pago;
    private String tipo;
    private String descrip;
    
    //RELACION
    private List<Factura> listfactura;

    public Tipo_Pago() {
    }

    public Tipo_Pago(int id_tipo_pago, String tipo, String descrip, List<Factura> listfactura) {
        this.id_tipo_pago = id_tipo_pago;
        this.tipo = tipo;
        this.descrip = descrip;
        this.listfactura = listfactura;
    }

    public int getId_tipo_pago() {
        return id_tipo_pago;
    }

    public void setId_tipo_pago(int id_tipo_pago) {
        this.id_tipo_pago = id_tipo_pago;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public List<Factura> getListfactura() {
        return listfactura;
    }

    public void setListfactura(List<Factura> listfactura) {
        this.listfactura = listfactura;
    }

}
