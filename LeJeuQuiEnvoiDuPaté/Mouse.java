/*
 * Animation.java
 * 
 * Copyright 2013 Ulysse BUONOMO <ulysse@matchka>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.JPanel;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;

public class Mouse extends JPanel implements MouseListener,MouseMotionListener{
	boolean leftClicked,rightClicked, leftPressed, rightPressed, rightReleased, leftReleased, dragged, moved;
	Structure structure = new Structure();
	int pos[] = new int[2];
	/*
	 * Accesseurs
	 */
	 
	//~ public int[] getPos(MouseEvent e){
		//~ int[] pos = new int[2];
		//~ pos[0] = e.getX();
		//~ pos[1] = e.getY();
		//~ return pos;
	//~ }
	 
	public boolean isClicked(char leftOrRight){
		if (leftOrRight == 'R') return rightClicked;
		else if (leftOrRight == 'L') return leftClicked;
		else return (rightClicked || leftClicked); 
	}
	public boolean isPressed(char leftOrRight){
		if (leftOrRight == 'R') return rightPressed;
		else if (leftOrRight == 'L') return leftPressed;
		else return (rightPressed || leftPressed); 
	}
	public boolean isReleased(char leftOrRight){
		if (leftOrRight == 'R') return rightReleased;
		else if (leftOrRight == 'L') return leftReleased;
		else return (rightReleased || leftReleased); 
	}
	public boolean isDragged(){
		return dragged;
	}
	public boolean isMoved(){
		return moved;
	}
	
	
	/*
	 * Mutateurs
	 */
	public void mouseClicked(MouseEvent event) {
		switch(event.getModifiers()) {
			case InputEvent.BUTTON1_MASK: {
				leftClicked = true;
				break;
			}
			/**
			 * Pour le bouton du milieu :
			case InputEvent.BUTTON2_MASK: {
				System.out.println("That's the MIDDLE button");     
				break;
			}
			 */
			case InputEvent.BUTTON3_MASK: {
				rightClicked = true;     
				break;
			}
		}
	}

	/**
	 * Méthode appelée lors du survol de la souris
	 */
	public void mouseEntered(MouseEvent event) {
	}
	
	/**
	 * Méthode appelée lorsque la souris sort de la zone du bouton
	 */
	public void mouseExited(MouseEvent event) {
	}
	
	/**
	 * Méthode appelée lorsque l'on presse le clic gauche de la souris
	 */
	public void mousePressed(MouseEvent event) {
		switch(event.getModifiers()) {
			case InputEvent.BUTTON1_MASK: {
				leftPressed = true;
				break;
			}
			/**
			 * Pour le bouton du milieu :
			case InputEvent.BUTTON2_MASK: {
				System.out.println("That's the MIDDLE button");     
				break;
			}
			 */
			case InputEvent.BUTTON3_MASK: {
				rightPressed = true;     
				break;
			}
		}
	}
	/**
	 * Méthode appelée lorsque l'on relâche le clic de souris
	 */
	public void mouseReleased(MouseEvent event){
		switch(event.getModifiers()) {
			case InputEvent.BUTTON1_MASK: {
				leftReleased = true;
				break;
			}
			/**
			 * Pour le bouton du milieu :
			case InputEvent.BUTTON2_MASK: {
				System.out.println("That's the MIDDLE button");     
				break;
			}
			 */
			case InputEvent.BUTTON3_MASK: {
				rightReleased = true;     
				break;
			}
		}
	}
	
	/**
	 * Méthode appelée si la souris est cliquée et est déplacée
	 */
	public void mouseDragged(MouseEvent event) {
		dragged = true;
	}
	
	/**
	 * Méthode appelée si la souris est en déplacement sur un objet
	 */
	public void mouseMoved(MouseEvent event) {
		moved = true;
		pos[0] = event.getX();
		pos[1] = event.getY();
	}
	public boolean[] isSelected(int minX,int maxX,int minY,int maxY){
			boolean[] s = new boolean[Unite.getNombreInstance()];
			for (int i=0;i<Unite.getNombreInstance();i++){
				if (minX<structure.u.getX() && structure.u.getX()<maxX && minY<structure.u.getY() && structure.u.getY()<maxY) s[i] = true;
			}
		return s;
	}
	public void clickAndDrag(){
		boolean dragging = false;
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		if (isClicked('L')){
			int posInit[] = pos;
		}
		if (isDragged()) {
			dragging = true;
			
			/*Mettre ici la comparaison pour obtenir les valeurs min et max et les renvoyer ensuite pour l'affichage*/
		}
		if (isReleased('W') && dragging){
			dragging = false;
			//~ select(minX,maxX,minY,maxY); voir méthode utiliser dans clickndrag avec la condition ternaire
			/*réinitialiser ici les variables*/
		}
	}
	//~ public void paintComponent(Graphics g){ 
		//~ this.addMouseListener(this);
		//~ this.addMouseMotionListener(this);
	//~ }
}

