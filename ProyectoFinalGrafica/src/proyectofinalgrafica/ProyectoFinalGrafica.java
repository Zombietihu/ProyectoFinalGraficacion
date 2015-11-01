/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalgrafica;

import javax.swing.JApplet;
import javax.swing.*;

/**
 *
 * @author Tonatihu
 */
public class ProyectoFinalGrafica extends JApplet{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame ventana = new JFrame();
        ventana.setTitle("Pait Cuatito");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JApplet applet = new ProyectoFinalGrafica();
        ventana.getContentPane().add(applet);
        ventana.pack();
        ventana.setVisible(true);
    }
    
    public ProyectoFinalGrafica(){}
}
