/*
 * Print.java
 * 
 * Copyright 2013 Ulysse BUONOMO <ulysse@matchka>
 *  
 */
 
import java.awt.*;
import javax.swing.JPanel;

public class Print extends JPanel {
	Structure structure = new Structure();
	Mouse mouse = new Mouse();
	
	public void paintComponent(Graphics g){
		
		
		/**Efface ecran*/
		g.setColor(Color.white);
		g.fillRect(0,0, this.getWidth(), this.getHeight());
		
		g.setColor(Color.black);
		boolean s[] = mouse.isSelected(0,500,0,500);
		g.drawString("s[0] : "+s[0]+"    s[1] : "+s[1]+"    s[2] : "+s[2],100,100);
		
		/**Affichage de la boite de selection*/
		//~ g.setColor(Color.blue);
		//~ if (tX>0){
			//~ if (tY>=0) g.drawRect(posX, posY,tX,tY);
			//~ else g.drawRect(posX, posY+tY,tX,-tY);
		//~ }
		//~ else{
			//~ if (tY>=0) g.drawRect(posX+tX, posY,-tX,tY);
			//~ else g.drawRect(posX+tX, posY+tY,-tX,-tY);
		//~ }
		
		/**Affichage de la "selection" d'un point*/
		g.setColor(Color.lightGray);
		for (int i=0; i<structure.u.getLength();i++){
			if (s[i]) g.fillRoundRect(structure.u.getX()-(int)(((float)3/(float)4)*structure.u.getLength()),structure.u.getY()-(int)(((float)3/(float)4)*structure.u.getLength()),(int)(((float)3/(float)2)*structure.u.getLength()),(int)(((float)3/(float)2)*structure.u.getLength()),(int)(((float)3/(float)10)*structure.u.getLength()),(int)(((float)3/(float)10)*structure.u.getLength()));
		}
		
		/**Affichage d'un point*/
		g.setColor(Color.black);
		for (int i=0; i<structure.u.getLength();i++){
			g.fillRoundRect(structure.u.getX()-structure.u.getLength()/2,structure.u.getY()-structure.u.getLength()/2,structure.u.getLength(),structure.u.getLength(),structure.u.getLength()/5,structure.u.getLength()/5);
		}
	}
}
