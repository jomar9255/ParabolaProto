/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projectile;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 *
 * @author jomar9255
 */
public class GUI extends Canvas implements ActionListener, KeyListener {
    Timer timer;
    int xVelocity, yVelocity;
    
    public GUI(){
        
        timer = new Timer(60, this);
        timer.setInitialDelay(100);     //starts timer
        timer.start();
        
        Timer timer = new Timer(2000, new ActionListener() {
        

        @Override
        public void actionPerformed(ActionEvent e) {
        //this will run every 2 seconds

            }

        }); 
        addKeyListener(this);
    }
    
    
   @Override
    public void paint(Graphics g){
        cartPlane(g);
        drawParabola(g,2,530);
        
    }
    
    private void cartPlane(Graphics g){
        g.fillRect(20, 0, 10, 533);
        g.fillRect(20, 533, 600, 10);
    }

    private void drawParabola(Graphics g, int s, int i){
        for(int x = 0; x < 600; x++){
            int y = x * (s*s);
            g.fillRect(x, y, 1, 1);
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
      
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
       
    }
}
