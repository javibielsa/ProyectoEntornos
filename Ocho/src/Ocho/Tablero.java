package Ocho;

import java.awt.*;
import java.applet.*;

public class Tablero extends Applet /*implements Runnable*/{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Nreinas[][] casillas;
	int numCasillas = 2;
	Image imagen;
	boolean caca = false;
	Rectangle[][] paneles;

    public void init() {
    	imagen = createImage(700, 700);
    	paneles=new Rectangle[8][8];
		for(int i=0; i<8;i++){
			for(int j=0;j<8;j++){
				paneles[i][j]=new Rectangle(i*50, j*50, 50, 50);
			}
		}
    }
    
    public void paint(Graphics g){
    	g.setColor(Color.green);
    	for(int i=0; i<8;i++){
			for(int j=0;j<8;j++){
				if(j%2==0 && i%2!=0){
					g.setColor(Color.black);
					g.fillRect(paneles[i][j].x, paneles[i][j].y, paneles[i][j].width, paneles[i][j].height);	
				}
				if(j%2!=0 && i%2==0){
					g.setColor(Color.black);
					g.fillRect(paneles[i][j].x, paneles[i][j].y, paneles[i][j].width, paneles[i][j].height);
				}
				g.setColor(Color.white);
			}
		}		
    }
}
