/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalgrafica;

import AcercaDe.AcercaDe;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.*;

/**
 *
 * @author Tonatihu
 */
public class Paint2015 extends JApplet implements ActionListener {
    static JFrame ventana;
    public static void main(String[] args) {
        // TODO code application logic here
        ventana = new JFrame();
        ventana.setTitle("Pait Cuatito");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JApplet applet = new Paint2015();
        ventana.getContentPane().add(applet);
        ventana.pack();
        ventana.setVisible(true);
    }
    
    public Paint2015(){
        init();
    }
    
    public void init(){
        JMenuBar mb = new JMenuBar();
        setJMenuBar(mb);
        //Se  grega menu 2D
        JMenu g2D = new JMenu("Graficos 2D");
        mb.add(g2D);
        JMenuItem mi = new JMenuItem("Línea");
        mi.addActionListener(this);
        g2D.add(mi);
        mi = new JMenuItem("Rectangulo");
        mi.addActionListener(this);
        g2D.add(mi);
        mi = new JMenuItem("Eclipse");
        mi.addActionListener(this);
        g2D.add(mi);
        mi = new JMenuItem("Arco");
        mi.addActionListener(this);
        g2D.add(mi);
        //Se agrega menu 3D
        JMenu g3D = new JMenu("Graficos 3D");
        mb.add(g3D);
        mi = new JMenuItem("Esfera");
        mi.addActionListener(this);
        g3D.add(mi);
        mi = new JMenuItem("Cubo");
        mi.addActionListener(this);
        g3D.add(mi);
        mi = new JMenuItem("Piramide");
        mi.addActionListener(this);
        g3D.add(mi);
        mi = new JMenuItem("Cilindro");
        mi.addActionListener(this);
        g3D.add(mi);
        //Se agrega acerca de
        JMenu acercaDe = new JMenu("Acerca de");
        mb.add(acercaDe);
        mi = new JMenuItem("Acerca_de");
        mi.addActionListener(this);
        acercaDe.add(mi);
        //Salir
        JMenu salir = new JMenu("Salir");
        mb.add(salir);
        mi = new JMenuItem("Exit");
        mi.addActionListener(this);
        salir.add(mi);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         String seleccion = e.getActionCommand();
         
         if(seleccion !=null ) switch(seleccion){
            case "Exit":
                ventana.dispose();
                break;
            case "Acerca_de":
                AcercaDe a = new AcercaDe(); 
                break;
            case "Línea":
                System.out.println("Hola");
                break;
         }
    }
}
