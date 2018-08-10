// Layout  28
//https://www.youtube.com/watch?v=mgnWYBaJuUk&index=28&list=PLE7E8B7F4856C9B19 
package my_swing;

 
import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

public class Layout extends JFrame{

 public static final int FONT_SIZE = 90;		
 Dimension d = new Dimension(FONT_SIZE*5 ,FONT_SIZE*6 );
 Font font = new Font("Arial", Font.BOLD, FONT_SIZE *2/3);
	
 JButton button1, button2, button3, button4, button5;
 String outputString = "";
	
 public static void main(String[] args){
  new Layout();
 }

 public void ChangeSize(Font fnt){
	  //http://www.jguru.com/faq/view.jsp?EID=340519
		 
  UIManager.put("OptionPane.minimumSize",new Dimension(500,500));
	  //UIManager.put("Spinner.arrowButtonSize" ,new Dimension(1 ,5 ));
 UIManager.getDefaults().put("controlDkShadow", Color.MAGENTA);
 UIManager.put("Tree.font",fnt);
 UIManager.put("Button.font", fnt);
 UIManager.put("OptionPane.messageFont", fnt);
 UIManager.put("OptionPane.buttonFont", fnt);
 UIManager.put("ComboBox.font",fnt); 
}
 
 public Layout(){
		
 ChangeSize(font);
 this.setSize(20*FONT_SIZE,15*FONT_SIZE);
 this.setLocationRelativeTo(null);
 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 this.setTitle("LAYOUT Frame");
		
 /* FLOW LAYOUT
 // Create a flow layout (Default)
 JPanel thePanel = new JPanel();
		
 // Define the flow layout alignment
 // FlowLayout.RIGHT, FlowLayout.CENTER
		
 thePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		
 // You can also define the pixels that separate the components
 //thePanel.setLayout(new  FlowLayout(alignment, horz gap, vertical gap)
   thePanel.setLayout(new  FlowLayout(FlowLayout.LEFT, 30, 20)		  
 button1 = new JButton("Button 1");
 thePanel.add(button1);
		 
  END FLOW LAYOUT*/ 
		
 /* BORDER LAYOUT */
		
 JPanel thePanel = new JPanel();
 thePanel.setLayout(new BorderLayout());
		
 // Create buttons
 button1 = new JButton("Button 1");
 button2 = new JButton("Button 2");
 button3 = new JButton("Button 3");
 button4 = new JButton("Button 4");
 button5 = new JButton("Button 5");
		
 // If you put components in the same space the
 // last one in stays and everything else goes
 // EX.
 // thePanel.add(button1, BorderLayout.NORTH);
 // thePanel.add(button2, BorderLayout.NORTH);
 // Only button2 shows
 /*
 thePanel.add(button1, BorderLayout.NORTH);
 thePanel.add(button2, BorderLayout.SOUTH);
 thePanel.add(button3, BorderLayout.EAST);
 thePanel.add(button4, BorderLayout.WEST);
 thePanel.add(button5, BorderLayout.CENTER);
 */
		
 /* If you want more than one component to show
 // up in the same part of a border layout put
 // them in a panel and then add the panel to
 // the border layout panel
 JPanel thePanel2 = new JPanel();
 thePanel2.add(button1);
 thePanel2.add(button2);
 thePanel.add(thePanel2, BorderLayout.NORTH);
 */
		
		/* BOX LAYOUT */
		
 Box theBox = Box.createHorizontalBox();
		
 // You can also use Box theBox = Box.createVerticalBox();
 /*
 theBox.add(button1);
 theBox.add(button2);
 theBox.add(button3);
 theBox.add(button4);
 */
		
 // You can also separate the components with struts
 /*
 theBox.add(button1);
 theBox.add(Box.createHorizontalStrut(4));
 theBox.add(button2);
 theBox.add(Box.createHorizontalStrut(4));
 theBox.add(button3);
 theBox.add(Box.createHorizontalStrut(4));
 theBox.add(button4);
 */
		
 // A rigid area gives you the option to space using
 // horizontal and vertical spacing
 theBox.add(button1);
 theBox.add(button2);
 // theBox.add(Box.createRigidArea(new Dimension(30, 20)));
		
 // When you use a glue you position the components as
 // far apart as possible while remaining on the screen
 // There is also a createVerticalGlue
 theBox.add(Box.createHorizontalGlue());
 theBox.add(button3);
 this.add(theBox);
		
 // this.add(thePanel); // Don't use for BOX LAYOUT
 this.setVisible(true);
	}
	
}