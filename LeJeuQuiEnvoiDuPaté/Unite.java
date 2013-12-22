import java.awt.*;
import java.awt.event.*;
import javax.swing.JPanel;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;

public class Unite {
	
	/** Variables publiques qui comptent les instances */
	public static int nbreInstance = 0;
	
	/** Variable privée qui comptera aussi les instances */
	private static int nbreInstanceBis = 0;
	
	/** Tableau de coordonnées */
	int[] pos = new int[2];  
	
	/** Taille de l'unite */
	int length;
	
	/** Statut de l'unite */
	boolean isDead;
	
	//***********************************************************************************
	// CONSTRUCTEUR D'INITIALISATION
	//***********************************************************************************
	
	public Unite(int x, int y, int t){
		nbreInstance++;
		nbreInstanceBis++;
		pos[0]= x;
		pos[1]= y;
		length=t;
	}
	
	//***********************************************************************************
	// ACCESSEURS
	//***********************************************************************************
	
	public static int getNombreInstance(){
		return nbreInstance;
	}
	
	public static int getNombreInstanceBis(){
		return nbreInstanceBis;
	}
	
	public int getX(){
		return pos[0];
	}
	
	public int getY(){
		return pos[1];
	}
	
	public int getLength(){
		return length;
	}
	
	public boolean isDead() {
          return this.isDead;
    }
	
	//***********************************************************************************
	// MUTATEURS
	//***********************************************************************************
	
	public void setX(int x){
		pos[0]= x;
	}
	
	public void setY(int y){
		pos[1]= y;
	}
	
	public void setLength(int t){
		length= t;
	}
		
	//***********************************************************************************
	// METHOSES DE CLASSE
	//***********************************************************************************	
	public void doPrint(Print p){
		p.repaint();
	}
	//~ public void affichage(Graphics g){
		//~ Graphics2D g2 = (Graphics2D) g;
        //~ g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		//~ g.setColor(Color.black);
		//~ g.fillRoundRect(this.getX()-this.getT()/2,this.getY()-this.getT()/2,this.getT(),this.getT(),this.getT()/5,this.getT()/5);
		//~ 
	//~ }
		







}

