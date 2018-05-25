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
public class Clase {
    private ArrayList<Metodo> metodos = new ArrayList();
    private String nombre;
    private String salida;

    public Clase() {
    }

    public Clase(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Metodo> getMetodos() {
        return metodos;
    }

    public void setMetodos(ArrayList<Metodo> metodos) {
        this.metodos = metodos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        salida = nombre + "{\n";
        for (Metodo m : metodos) {
            salida += m.toString();
            salida += "\n";
        }
        salida += "}";
        return salida;
    }
    
}
