
package face;

import java.awt.Color;
import java.awt.Graphics;


public class Face {
    private int xPos, yPos, diameter;
    private Color color;
    private Graphics g;
    
    public Face(Graphics g, int x, int y){
        xPos=x;
        yPos=y;
        //let the "g" property = the "g" param
        this.g = g;
        //defaultsize and color
        diameter=100;
        color=Color.red;
    }
    
    public void draw(){
        drawHead();
        drawEyes();
        drawMouth();
    }
    
    public void erase(){
        g.setColor(Color.white);
        g.fillRect(xPos-10,yPos-10,diameter + 20, diameter + 20);
    }
}
