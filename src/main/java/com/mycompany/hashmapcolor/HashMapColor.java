/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hashmapcolor;
import java.util.HashMap;
import java.awt.Color;
import java.util.Scanner;
import javax.swing.*;

/**
 *
 * @author Armando
 */
public class HashMapColor {
    public static void main(String[] args) {
        HashMap<String, Color> Colors = new HashMap<String, Color>();
        Colors.put("rojo", Color.RED);
        Colors.put("naranja", Color.ORANGE);
        Colors.put("amarillo", Color.YELLOW);
        Colors.put("verde", Color.GREEN);
        Colors.put("cian", Color.CYAN);
        Colors.put("azul", Color.BLUE);
        Colors.put("magenta", Color.MAGENTA);
        Colors.put("rosa", Color.PINK);
        Colors.put("blanco", Color.WHITE);
        Colors.put("gris", Color.GRAY);
        Colors.put("negro", Color.BLACK);
        Colors.put("gris oscuro", Color.DARK_GRAY);
        Colors.put("gris claro", Color.LIGHT_GRAY);
        for (String key : Colors.keySet()) {
            System.out.println(key);
        }
        System.out.println("Escoge un color de los antes mencionados:");
        Scanner inputColor = new Scanner(System.in);
        String string = inputColor.next();
        Color colorSeleccionado = Colors.get(string);
        JFrame f = new JFrame("Figura del color seleccionado");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ScreenColorFigure p = new ScreenColorFigure(colorSeleccionado);
        f.add(p);
        f.setSize(400, 250);
        f.setVisible(true);
    }
}
