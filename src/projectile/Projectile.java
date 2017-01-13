/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projectile;

import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author jomar9255
 */
public class Projectile extends Canvas{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Graphics g = null;
        JFrame myFrame = new JFrame();
        GUI myGUI = new GUI();
        myFrame.add(myGUI);
        
        myFrame.setBounds(0, 0, 600, 600);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
        
        try{
        myGUI.paint(g);
      
        }catch(NullPointerException e){
                System.err.println(e.getMessage());
                }
    }
    
    
        
    }


