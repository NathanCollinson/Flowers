/* Based on the VUW ecs100 template
 *
 */


import ecs100.*;
import java.util.*;
import java.io.*;
import java.awt.Color;

/** 
 * Write a description of class Flower here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Flower{
    //instance variables
    private double flowerX = -100;
    private double flowerY = -100;
    
    private int flowerSize;
    private int flowerHeight;
    
    private double left;
    private double top;
    private double bottom;
    
    private Color color;
    
    /**
     * Constructor for objects of class Flower 
     */
    public Flower(double x, double y, int size, int stem, Color col){
        this.flowerX = x;
        this.flowerY = y;
        this.flowerSize = size;
        this.flowerHeight = stem;
        this.color = col;
        
        this.setTop();
        this.setLeft();
        this.setBottom();
        
        UI.initialise();
        UI.addButton("Quit", UI::quit);    // Comment out to checkstyle
    }

    /**
     * Setting the top of flower
     */
    private void setTop(){
        this.top = flowerY-flowerSize/2.0;
    }
    
    /**
     * Setting the left of flower
     */
    private void setLeft(){
        this.left = flowerX - flowerSize/2.0;
    }
    
    /**
     * setting the bottom of flower
     */
    private void setBottom(){
        this.bottom = flowerY + flowerHeight;
    }
    
    /**
     * Main routine
     *
     */
    public static void main(String[] args){
        Flower obj = new Flower();
    }

}

