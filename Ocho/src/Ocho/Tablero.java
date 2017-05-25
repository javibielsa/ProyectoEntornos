package Ocho;

import java.awt.*;

public class Tablero extends Frame{
	
	public static void main(String args[]){
		Tablero oi=new Tablero();
	}

	public Tablero(){
		super("Objetos de tipo Input");
		cargar();
		pack();
		resize(400,400);
		show();	
	}
	
	public boolean handleEvent(Event ev){
		if(ev.id==Event.WINDOW_DESTROY){
			System.exit(0);
			return true;
		}
		return false;
	}

	public void cargar(){ //Este es el mismo método que el setup pero lo llamamos como queremos
		setLayout(new GridLayout(8, 8));
		Panel paneles[][]=new Panel[8][8];
		for(int i=0; i<8;i++){
			for(int j=0;j<8;j++){
				paneles[i][j]=new Panel();
				if(j%2==0 && i%2!=0){
				paneles[i][j].setBackground(Color.black);
				}
				if(j%2!=0 && i%2==0){
					paneles[i][j].setBackground(Color.black);
					}
			}
		}
			
		
			for(int i=0;i<8;i++)
				for(int j=0;j<8;j++)
					add(paneles[i][j]);
		
	}
	
}

