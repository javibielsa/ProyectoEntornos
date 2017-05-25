package Ocho;

import java.awt.*;
import java.util.List;
import java.util.ArrayList;
import java.applet.*;

public class tablero extends Applet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	List<reinas> reina;
	int numCasillas = 2;
	Image imagen;
	boolean caca = false;
	Rectangle[][] paneles;
	Button b1;
	boolean win = false;
	boolean lose = false;

    public void init() {
    	
    	imagen = createImage(700, 700);
    	paneles=new Rectangle[8][8];
		for(int i=0; i<8;i++){
			for(int j=0;j<8;j++){
				paneles[i][j]=new Rectangle((i*50)+150, (j*50)+150, 50, 50);
			}
		}
		reina = new ArrayList<reinas>();
		b1 = new Button( "COMPROBAR" ); 
    	this.add( b1 ); 
		

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
    	for (int i = 0; i < reina.size(); i++) {
			reina.get(i).dibujar(g, this);
		}
    	if(win == true){
    		g.setColor(Color.black);
    		g.drawString("HAS GANADO", 350, 700);
    	}
    	if(lose == true){
    		g.drawString("HAS PERDIDO", 350, 700);
    	}
    		
    }
    
    public boolean mouseDown(Event ev, int x, int y){
    	for (int i = 0; i < paneles.length; i++) {
			for (int j = 0; j < paneles[i].length; j++) {
				if(paneles[i][j].contains(x,y)){
					if(reina.size()<=8){
						reina.add(new reinas(getImage(getCodeBase(),"reina.jpg"),paneles[i][j].x, paneles[i][j].y));
						repaint();
					}
				}
			}
			
		}
		return true;
	}
    
	public boolean action(Event ev,Object obj) { 

    	if(ev.target.equals(b1)){
    		/*if(metodosolucion == true){
    			win = true;
    		}else{
    			lose = true;
    		}
    		repaint();
    		*/
    		repaint();
    	}
    		
    	return true; 

    	}

}
