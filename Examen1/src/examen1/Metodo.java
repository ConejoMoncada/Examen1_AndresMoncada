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
public class Metodo {
    private ArrayList<String[]> atributos = new ArrayList();
    private String nombre;
    private ArrayList<String> cuerpo = new ArrayList();
    private String salida;

    public Metodo() {
    }

    public Metodo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString(){
        salida = nombre + " (";
        for (int i = 0; i < atributos.size(); i++) {
            salida += atributos.get(i)[0]+ " " + atributos.get(i)[1];
            if (i != atributos.size() - 1)
                salida += ", ";
        }
        salida += ") {\n";
        for (String s : cuerpo) {
            salida += "    "  + s + "\n";
        }
        salida += "}";
        return salida;
    }

    public ArrayList<String[]> getAtributos() {
        return atributos;
    }

    public void setAtributos(ArrayList<String[]> atributos) {
        this.atributos = atributos;
    }

    public ArrayList<String> getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(ArrayList<String> cuerpo) {
        this.cuerpo = cuerpo;
    }
    
}
