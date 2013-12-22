import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

 
public class Window extends JFrame{
	Window(String a,int h,int l){		
		this.setTitle(a);
		this.setSize(h,l);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}       
}



