/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import java.util.ArrayList;
import java.util.Random;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import modelo.Competencia;
import modelo.Persona;
import modelo.Rol;
import modelo.Usuario;
import modelo.Usuario_Roles;

/**
 *
 * @author sandr
 */
@WebService(serviceName = "Facturacion")
public class Facturacion {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    ArrayList<Persona> listapersonas = new ArrayList<>();
    ArrayList<Usuario> listausuarios = new ArrayList<>();
    ArrayList<Rol> ListaRoles = new ArrayList<>();
    private ArrayList<Competencia> ListaCompetencia = new ArrayList<>();

    /**
     * Web service operation
     */
    @WebMethod(operationName = "crearPersonita")
    public Persona crearPersonita(@WebParam(name = "id_persona") int id_persona, @WebParam(name = "nombre") String nombre, @WebParam(name = "apellido") String apellido, @WebParam(name = "dni") String dni, @WebParam(name = "celular") String celular, @WebParam(name = "correo") String correo) {
        Persona person = new Persona();
        person.setId_persona(id_persona);
        person.setNombre(nombre);
        person.setApellido(apellido);
        person.setDni(dni);
        person.setCelular(celular);
        person.setCorreo(correo);

        listapersonas.add(person);
        System.out.println("se genero correctamente " + person.getNombre());
        return person;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "crearUser")
    public Usuario crearUser(@WebParam(name = "dni") String dni, @WebParam(name = "id") int id, @WebParam(name = "id_persona") int id_persona, @WebParam(name = "user") String user, @WebParam(name = "pass") String pass) {
        Usuario usuario = new Usuario();
        if (buscarP(dni) == true) {

            usuario.setId_usuario(id_persona);
            usuario.setId_persona(id_persona);
            usuario.setUser(user);
            usuario.setPassword(pass);

            listausuarios.add(usuario);
            System.out.println("Usuario generado correctamente");

        } else {
            System.out.println("No se encontro el user");
        }
        return usuario;

    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "buscarP")
    public boolean buscarP(@WebParam(name = "dni") String dni) {
        boolean encontrado = false;
        for (int i = 0; i < listapersonas.size(); i++) {
            if (listapersonas.get(i).getDni().equals(dni)) {
                encontrado = true;

                i = listapersonas.size();
            }

            if (!encontrado) {
                System.out.println("No se encontro el dni");
            }
        }
        return encontrado;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "buscarUser")
    public boolean buscarUser(@WebParam(name = "usuario") String usuario) {

        boolean encontrado = false;
        for (int i = 0; i < listausuarios.size(); i++) {
            if (listausuarios.get(i).getUser().equals(usuario)) {
                encontrado = true;

                i = listausuarios.size();
            }

            if (!encontrado) {
                System.out.println("No se encontro el usuario");
            }
        }
        return encontrado;
    }

    @WebMethod(operationName = "InsertaRol")
    public Boolean InsertaRol(@WebParam(name = "idRol") int idRol, @WebParam(name = "nombre") String nombre, @WebParam(name = "estado") boolean estado) {
        for (Rol r : ListaRoles) {
            if (nombre.equals(r.getRol())) {
                return false;
            }
        }
        Rol rol = new Rol(idRol, nombre, estado);
        ListaRoles.add(rol);
        return true;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "asignarRolUsuario")
    public boolean asignarRolUsuario(@WebParam(name = "user") Usuario user, @WebParam(name = "rol") Rol rol) {

        if (user != null && rol != null) {
            if (user.getRoles() == null) {
                user.setRoles(new ArrayList<>());
            }

            Random random = new Random();
            int numeroAleatorioEnRango = random.nextInt(100) + 1;

            Usuario_Roles ur = new Usuario_Roles();
            ur.setId(numeroAleatorioEnRango);
            ur.setRol(rol);
            ur.setUsuario(user);
            ur.setEstado(true);

            return true;
        }

        return false;
    }

    
    @WebMethod(operationName = "BuscarRol")
    public boolean BuscarRol(@WebParam(name = "nombreRol") String nombreRol) {
        boolean encontrado = false;
        for (int i = 0; i < ListaRoles.size(); i++) {
            if (ListaRoles.get(i).getRol().equals(nombreRol)) {
                encontrado = true;

                i = ListaRoles.size();
            }

            if (!encontrado) {
                System.out.println("No se pudo encontrar el rol");
            }
        }
        return encontrado;
    }
    
    @WebMethod(operationName = "BuscarCompetencia")
    public String BuscarCompetencia(@WebParam(name = "nombre") String nombre) {
        boolean encontrado = false;
        for (int i = 0; i < ListaCompetencia.size(); i++) {
            if (ListaCompetencia.get(i).getNombre().equals(nombre)) {
                encontrado = true;

                i = ListaRoles.size();
            }

            if (!encontrado) {
                System.out.println("No se pudo encontrar el nombre de Comperencia");
            }
        }
        String sms = "Se encontro nombre de competencia ";
        return sms;
    }
    
    @WebMethod(operationName = "InsertaCompetencia")
    public Boolean InsertaCompetencia(@WebParam(name = "idRol") int id, @WebParam(name = "nombre") String nombre, @WebParam(name = "descripcion") String descripcion) {
        for (Competencia r : ListaCompetencia) {
            if (nombre.equals(r.getNombre())) {
                return false;
            }          
        }
        Competencia compe = new Competencia();
        ListaCompetencia.add(compe);
        return true;
    }

}
