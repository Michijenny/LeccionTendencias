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
public class Clasificacion {

    private int id_clasificacion;
    private String grupo;
    
    private ArrayList <Productos> listaProductos;

    public Clasificacion(int id_clasificacion, String grupo) {
        this.id_clasificacion = id_clasificacion;
        this.grupo = grupo;
    }

    public Clasificacion() {
    }

    public int getId_clasificacion() {
        return id_clasificacion;
    }

    public void setId_clasificacion(int id_clasificacion) {
        this.id_clasificacion = id_clasificacion;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

}
