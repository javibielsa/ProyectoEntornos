package Ocho;

import java.applet.Applet;
import java.awt.*;

public class Reina extends Rectangle{
	private Image reina;
	public final static int DIMENSION = 50;
	
	public Reina(Image re, int x, int y){
		super(x, y, DIMENSION, DIMENSION);
		reina = re;
	}
	
	public void dibujar(Graphics g, Applet a){
		g.drawImage(reina, 100, 200,a);
	}
}
