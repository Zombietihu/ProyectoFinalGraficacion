/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AcercaDe;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

/**
 *
 * @author Tonatihu
 */
public class AcercaDe extends JFrame{
    
    JTextArea acercaDe;
    
    public AcercaDe(){
        setSize(400,200);
        setTitle("Acerca de");
        init();
        setVisible(true);
        add(acercaDe);
      
    }
    public void init(){
        
        acercaDe = new JTextArea();
        acercaDe.append("Paint2015 Ver1.0"+"\r\n");
        acercaDe.append("\r\n"+"Elaborado por:"+"\t"+"Alvaro Tonatihu Fabian Silverio"+"\r\n");
        acercaDe.append("\r\n"+"Graficacion 2015B"+"\r\n");
        acercaDe.append("\r\n"+"Copyright 2015 Hammed Inc. Todos los derechos reservados."+"\r\n");
        acercaDe.setBounds(0,0,200,400);
        acercaDe.setEditable(false);
        acercaDe.setBackground(Color.black);
        acercaDe.setFont(new Font("Monospaced",Font.PLAIN,20));
        acercaDe.setForeground(Color.green);
        acercaDe.setFont(null);
        
    }
}
