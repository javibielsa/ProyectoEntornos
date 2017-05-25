package nreinas;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class reinas extends Rectangle{
	
	Image imagen;
	public final static int DIMENSION = 50;
	
	public reinas(Image img, int x, int y) {
    	super(x, y, DIMENSION, DIMENSION);
    	imagen = img;
    }

    public void dibujar(Graphics g, Applet a){
		g.drawImage(imagen, x, y, width, height, a);
    }
}
