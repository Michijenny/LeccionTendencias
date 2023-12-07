/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author enriq
 */
public class Rol_Competencia {
    
    private int id;
    private Rol id_rol;
    private Competencia id_competencia;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public Rol getId_rol() {
        return id_rol;
    }

    public void setId_rol(Rol id_rol) {
        this.id_rol = id_rol;
    }

    public Competencia getId_competencia() {
        return id_competencia;
    }

    public void setId_competencia(Competencia id_competencia) {
        this.id_competencia = id_competencia;
    }
    
    
    
}
