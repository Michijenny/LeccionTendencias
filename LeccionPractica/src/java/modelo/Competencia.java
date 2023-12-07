/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sandr
 */
public class Competencia {
    private int id_competencias;
    private String nombre;
    private String descripcion;
    private ArrayList<Rol_Competencia> rolcompetencia;

    public int getId_competencias() {
        return id_competencias;
    }

    public void setId_competencias(int id_competencias) {
        this.id_competencias = id_competencias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Rol_Competencia> getRolcompetencia() {
        return rolcompetencia;
    }

    
}
