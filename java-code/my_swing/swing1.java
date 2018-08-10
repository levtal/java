package my_swing;
//Tutorial 20
// https://www.youtube.com/watch?v=3XB3in9Xqy8&list=PLE7E8B7F4856C9B19&index=20
import java.awt.Color; 
import java.awt.Dimension;
 
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;

import javax.swing.*;

//You must extend the JFrame class to make a frame
public class Swing1  extends JFrame{
	public static final int FONT_SIZE = 60;	
	Dimension dimension = new Dimension(40, 40);
	   
 
public static void main(String[] args){
	 	new Swing1();
 }
	
public String tipStr(int size,String color,String msg){
 String tipstr =
	"<html><p> <font size='"+Integer.toString(size)+"' "+
                "color='"+color+"'>"
				 +msg+
	        	 "  </font></p></html>";
 return tipstr;
}

public Swing1(){
 // Define the size of the frame
 this.setSize(20*FONT_SIZE, 20*FONT_SIZE);
		
 // Opens the frame in the middle of the screen-
// You could also define position based on a 
 //component                   |
// this.setLocationRelativeTo(null);
		
// Toolkit is the super class for the Abstract
 //Window Toolkit
// It allows us to ask questions of the OS
		
 Toolkit tk = Toolkit.getDefaultToolkit();
		
 // A Dimension can hold the width and height of a component
 // getScreenSize returns the size of the screen
 Dimension dim = tk.getScreenSize();
		
 // dim.width returns the width of the screen
 // this.getWidth returns the width of the frame you are making
  int xPos = (dim.width / 2) - (this.getWidth() / 2);
  int yPos = (dim.height / 2) - (this.getHeight() / 2);
 // You could also define the x, y position of the frame
  this.setLocation(xPos, yPos);
  
  //Another way to do that   --->  this.setLocationRelativeTo(null);		
  
		
 // Define if the user can resize the frame (true by default)
  this.setResizable(true);
		
 // Define how the frame exits (Click the Close Button)
 // Without this Java will eventually close the app
		
 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
 // Define the title for the frame
 this.setTitle("My First Frame");

 
 // The JPanel contains all of the 
 // components for your frame
 JPanel thePanel = new JPanel();
 thePanel.setBackground(Color.GRAY);
 //thePanel.setPreferredSize(new Dimension(1640, 480)); 
 // How to create a label with its text  
 JLabel label1 = new JLabel("Tell me something");
 Font font = new Font("Courier", Font.BOLD,FONT_SIZE);		
 
 // How to change the text for the label
 label1.setFont(font);		
 label1.setText("New Text");
		
// How to create a tool tip for the label
 String tipstr =tipStr(12,"blue","Doesn't do anything");
 label1.setToolTipText( tipstr);
  
 // How to add the label to the panel
 thePanel.add(label1);
		
		// How to create a button -----------------------
		
 JButton button1 = new JButton("Send");
		//button1.setPreferredSize(new Dimension(100, 100));
 button1.setPreferredSize(dimension);
 
 // How to hide the button border (Default True)
 button1.setBorderPainted(true);
		
// How to hide the button background (Default True)
 button1.setContentAreaFilled(true);
		
 // How to change the text for the label
 button1.setText("New Button");
				
 // How to create a tool tip for the label
 tipstr =tipStr(14,"red","Button tip");
 button1.setToolTipText( tipstr);		
 thePanel.add(button1);
	  		
 
 JTextField textField1 = new JTextField("Type Here", 15);
 Font bigFont = textField1.getFont().deriveFont(Font.PLAIN, FONT_SIZE*3/4);
 textField1.setFont(bigFont);		

 // Change the size of the text field
textField1.setColumns(30);
		
 // Change the initial value of the text field
 textField1.setText("New Text Here");
		
 // Change the tool tip for the text field
 textField1.setToolTipText("More of nothing");
		
 thePanel.add(textField1);
		
 
 // How to add a text area ----------------------
JTextArea textArea1 = new JTextArea(FONT_SIZE/2, FONT_SIZE/2);
		 
		// Set the default text for the text area
 textArea1.setFont(new Font("Arial", Font.PLAIN, FONT_SIZE  ));
 textArea1.setText("Just a whole bunch  of text that is important\n");
		
 // If text doesn't fit on a line, jump to the next
 textArea1.setLineWrap(true);
		
 // Makes sure that words stay intact if a line wrap occurs
 textArea1.setWrapStyleWord(true);
		
 // Gets the number of newlines in the text
 int numOfLines = textArea1.getLineCount();
		
 // Appends text after the current text
 textArea1.append(" number of lines: " + numOfLines);
		
 // Adds scroll bars to the text area ----------
 JScrollPane scrollbar1 = new JScrollPane(textArea1, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
 // Other options: VERTICAL_SCROLLBAR_ALWAYS, VERTICAL_SCROLLBAR_NEVER
		
 thePanel.add(scrollbar1);
		
 //  add the panel to the frame
 this.add(thePanel);
		
 // Makes the frame show on the screen
 this.setVisible(true);
		
 // Gives focus to the textfield
 textField1.requestFocus();
		
 // You can also request focus for the text array
 // textArea1.requestFocus();
		
}
	
}