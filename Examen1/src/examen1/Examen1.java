/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author alexycruz1
 */
public class Examen1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Los comandos del programa son iguales a los del ejemplo del\n" + "documento de word (incluyendo capitalizacion)\n"
        + "pero SIN PARENTESIS");
        Principal p = new Principal();
        p.setVisible(true);
        p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
