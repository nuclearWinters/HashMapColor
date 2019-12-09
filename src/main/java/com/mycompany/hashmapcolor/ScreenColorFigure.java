/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hashmapcolor;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Armando
 */
public class ScreenColorFigure extends JPanel {
    Color color; 
    ScreenColorFigure(Color color) 
    { 
        this.color = color; 
    } 
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.WHITE);
        g.setColor(color);
        g.fillRect(25, 25, 100, 30);
    }
}
