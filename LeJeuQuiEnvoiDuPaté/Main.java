/*
 * 
 * Main.java
 * 
 * Copyright 2013 Ulysse BUONOMO <ulysse@matchka>
 * 
 */
import java.util.Scanner;

public class Main {
	
	public static void main (String args[]) {
		
		Window fenetre = new Window("Animation", 700, 800);
		fenetre.setContentPane(new Print());
		//~ fenetre.setVisible(Animation.test(true));
		//~ for (;;){
			//~ fenetre.repaint();
			//~ try {
				//~ Thread.sleep(10);
			//~ } catch (InterruptedException e) {
				//~ e.printStackTrace();
			//~ }
		//~ }
	}
}

