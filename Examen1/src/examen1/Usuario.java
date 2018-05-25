/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class Usuario {
    private String nombre;
    private int edad;
    private String usuario;
    private String pass;
    private ArrayList<Clase> clases = new ArrayList();
    private String salida;

    public Usuario() {
    }

    public Usuario(String nombre, int edad, String usuario, String pass) {
        this.nombre = nombre;
        this.edad = edad;
        this.usuario = usuario;
        this.pass = pass;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public ArrayList<Clase> getClases() {
        return clases;
    }

    public void setClases(ArrayList<Clase> clases) {
        this.clases = clases;
    }

    @Override
    public String toString() {
        salida = "";
        for (Clase c : clases) {
            salida += c.toString();
            salida += "\n";
        }
        return salida;
    }
    
}
