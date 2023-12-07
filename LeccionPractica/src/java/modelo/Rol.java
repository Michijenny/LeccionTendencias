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
public class Rol {
    private int id_rol;
    private String rol;
    private boolean estado;
    
     private List<Usuario_Roles> usuarios;
     private ArrayList<Rol_Competencia> Listarolcompetencia;

    public Rol(int id_rol, String rol, boolean estado) {
        this.id_rol = id_rol;
        this.rol = rol;
        this.estado = estado;
    }

    public Rol() {
    }

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
