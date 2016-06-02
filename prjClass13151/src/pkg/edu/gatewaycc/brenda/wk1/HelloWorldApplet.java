package pkg.edu.gatewaycc.brenda.wk1;

import java.awt.*;
import java.applet.*;

public class HelloWorldApplet extends Applet {

   // An applet that simply displays the string Hello World!
   
   public void paint(Graphics g) {
	   g.setColor(Color.blue);
	   Font f = new java.awt.Font("Arial",Font.BOLD,20);
	   g.setFont(f);
       g.drawString("Hello World!", 10, 30);

   }
   
}  // end of class HelloWorldApplet
		

	

