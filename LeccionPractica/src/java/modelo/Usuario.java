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
public class Usuario {
     private int id_usuario;
    private int id_persona;
    private String user;
    private String password;
    
    private List<Usuario_Roles> roles;

    public Usuario() {
    }

    public Usuario(int id_usuario, int id_persona, String user, String password, List<Usuario_Roles> roles) {
        this.id_usuario = id_usuario;
        this.id_persona = id_persona;
        this.user = user;
        this.password = password;
        this.roles = roles;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Usuario_Roles> getRoles() {
        return roles;
    }

    public void setRoles(List<Usuario_Roles> roles) {
        this.roles = roles;
    }
    
    
}
