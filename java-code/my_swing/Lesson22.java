package my_swing;
/* lesson 22 23
 *  https://www.youtube.com/watch?v=qVdRxODXBcU&index=22&list=PLE7E8B7F4856C9B19
 *  https://www.youtube.com/watch?v=wApG8SHBJ24&list=PLE7E8B7F4856C9B19&index=23
 *  GUI listener called the ChangeListener.  
 * check boxes, radio buttons, groups, borders and sliders.
 * 
 */
import javax.swing.*;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.*;

// New event listener that monitors changing values for components

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

// Allows me to format the numbers

import java.text.NumberFormat;

// Allows me to edit borders on panels

import javax.swing.border.*;


public class Lesson22 extends JFrame{
 
 public static final int FONT_SIZE = 80;		
 Dimension d = new Dimension(FONT_SIZE*3/2,FONT_SIZE*3/2);
 Font font = new Font("Arial", Font.BOLD, FONT_SIZE *2/3);		
 
 JButton button1;
	JLabel label1, label2, label3;
	JTextField textField1, textField2;
	JCheckBox dollarSign, commaSeparator;
	JRadioButton addNums, subtractNums, multNums, divideNums;
	JSlider howManyTimes;
	
	double number1, number2, totalCalc;
	
	public static void main(String[] args){
		
		new Lesson22();
		
	}
	
public Lesson22(){
		
 UIManager.put("OptionPane.minimumSize",new Dimension(300,200)); 
 this.setSize(20*FONT_SIZE,15*FONT_SIZE);				
 // Opens the frame in the middle of the screen
 this.setLocationRelativeTo(null);
		
 // Define how the frame exits (Click the Close Button)
 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
 // Define the title for the frame
 this.setTitle("My Third Frame");
				
		// The JPanel contains all of the components for your frame
				
		JPanel thePanel = new JPanel();
		
 // Create a button with Click Here on it
		
 button1 = new JButton("Calculate");
				
		// Create an instance of ListenForEvents to handle events
 button1.setPreferredSize(d);				
 ListenForButton lForButton = new ListenForButton();
				
		// Tell Java that you want to be alerted when an event
		// occurs on the button
 button1.addActionListener(lForButton);
 thePanel.add(button1);
		
 // How to add a label --------------------------
 label1 = new JLabel("Num1");
 label1.setFont(font);
 label1.setPreferredSize(new Dimension(3*FONT_SIZE, FONT_SIZE)); 
 label1.setBorder(new LineBorder(Color.BLUE)); 
 label1.setForeground(Color.red);
 
 thePanel.add(label1);
				
		// How to add a text field ----------------------
				
 textField1 = new JTextField("", 5);
 textField1.setFont(font);
 thePanel.add(textField1);
 		
 label2 = new JLabel("Num2");
 label2.setFont(font);
 label2.setPreferredSize(new Dimension(3*FONT_SIZE, FONT_SIZE)); 
 label2.setBorder(new LineBorder(Color.BLUE)); 
 label2.setForeground(Color.red);				
 thePanel.add(label2);
						
 // How to add a text field ----------------------
 textField2 = new JTextField("", 5);
 textField2.setFont(font);								
 thePanel.add(textField2);
		
//Checkboxes 
 dollarSign = new JCheckBox("Dollars"); 
 commaSeparator = new JCheckBox("Commas");
 dollarSign.setFont(font);
 dollarSign.setBackground(Color.cyan);		
 commaSeparator.setFont(font);
 commaSeparator.setBackground(Color.cyan);
 
 thePanel.add(dollarSign);
 // By putting true in here it is selected by default
 thePanel.add(commaSeparator, true);
 // Creates radio buttons with default labels
 addNums = new JRadioButton("Add");
 addNums.setFont(font);
 subtractNums = new JRadioButton("Subtract");
 subtractNums.setFont(font);
 multNums = new JRadioButton("Multiply");
 multNums.setFont(font);
 divideNums = new JRadioButton("Divide");
 divideNums.setFont(font);		
 // Creates a group that will contain radio buttons
 // You do this so that when 1 is selected the others
 // are deselected
 ButtonGroup operation = new ButtonGroup();
 
 // Add radio buttons to the group
 operation.add(addNums);
 operation.add(subtractNums);
 operation.add(multNums);
 operation.add(divideNums);
		
 // Create a new panel to hold radio buttons
 JPanel operPanel = new JPanel();
		
 // Surround radio button panel with a border
 // You can define different types of borders
 // createEtchedBorder, createLineBorder, createTitledBorder
 // createLoweredBevelBorder, createRaisedBevelBorder
		
 //Border operBorder = BorderFactory.createTitledBorder("Operation");
 Border operBorder = BorderFactory.createTitledBorder(null,
         "Operation",
          TitledBorder.DEFAULT_JUSTIFICATION,
          TitledBorder.DEFAULT_POSITION,
          font, Color.red);
		
 // Set the border for the panel
 operPanel.setBorder(operBorder);
		
 // Add the radio buttons to the panel
 operPanel.add(addNums);
 operPanel.add(subtractNums);
 operPanel.add(multNums);
 operPanel.add(divideNums);
		
 // Selects the add radio button by default
 addNums.setSelected(true);
		
 // Add the panel to the main panel
 // You don't add the group
		
 thePanel.add(operPanel);
		
		// How to create a slider ----------------
		
 label3 = new JLabel("Perform How Many Times?");
 thePanel.add(label3);
 label3.setFont(font);		
 label3.setBorder(new LineBorder(Color.BLUE)); 
 label3.setForeground(Color.red);
 
 // Creates a slider with a min value of 0 thru 99
 // and an initial value of 1
 howManyTimes = new JSlider(0, 99, 1);
 howManyTimes.setPreferredSize(new Dimension(20*FONT_SIZE, 3*FONT_SIZE));		
 howManyTimes.setFont(font);		

 // Defines the minimum space between ticks
 howManyTimes.setMinorTickSpacing(1);
		
 // Defines the minimum space between major ticks
 howManyTimes.setMajorTickSpacing(10);
		
 // Says to draw the ticks on the slider
 howManyTimes.setPaintTicks(true);
		
 // Says to draw the tick labels on the slider
 howManyTimes.setPaintLabels(true);
		
 // Create an instance of ListenForEvents to handle events
		
 ListenForSlider lForSlider = new ListenForSlider();
				
 // Tell Java that you want to be alerted when an event
 // occurs on the slider
				
 howManyTimes.addChangeListener(lForSlider);
		
		
 thePanel.add(howManyTimes);
 this.add(thePanel);
 this.setVisible(true);
		
 // Gives focus to the textfield
 textField1.requestFocus();
		
 }
	
 private class ListenForButton implements ActionListener{
		
 // This method is called when an event occurs
 public void actionPerformed(ActionEvent e){
	 
 JLabel msg = new JLabel("");
 msg.setFont(font);	  			
 // Check if the source of the event was the button
 if(e.getSource() == button1){
				
 // getText returns a String so you have to parse it
 // into a double in this situation
	 try{
	   number1 = Double.parseDouble(textField1.getText());
	   number2 = Double.parseDouble(textField2.getText());
       }
  	catch(NumberFormatException excep){
					
  // JOptionPane displays a popup on the screen
  // (parentComponent, message, title, error icon)
  // Error Icons: WARNING_MESSAGE, QUESTION_MESSAGE, PLAIN_MESSAGE
 
   //JLabel msg = new JLabel( "Please Enter the Right Info");
   msg.setText("Please Enter the Right Info");
   JOptionPane.showMessageDialog(Lesson22.this,
		  msg, 
		 "Error", 
		 JOptionPane.ERROR_MESSAGE);
   System.exit(0); // Closes the Java app
 }
 if(addNums.isSelected()) { 
	 totalCalc = addNumbers(
			 number1, number2,
			 howManyTimes.getValue()); 
 } else if(subtractNums.isSelected()) {
	 totalCalc = subtractNumbers(
			 number1, number2,
			 howManyTimes.getValue()); 
 } else if(multNums.isSelected()) { 
	 totalCalc = multiplyNumbers(
			 number1, number2, 
			 howManyTimes.getValue()); 
				
 } else { 
	 totalCalc = divideNumbers(
			 number1, number2,
			 howManyTimes.getValue());
  }
				
 // If the dollar is selected in the checkbox print the 
 // number as currency
 
  
  			
 if(dollarSign.isSelected()) {
 // Defines that you want to format a number with $ and commas
 NumberFormat numFormat = NumberFormat.getCurrencyInstance();
 msg.setText( numFormat.format(totalCalc));
 JOptionPane.showMessageDialog(
		   Lesson22.this,
		   msg, "Solution", 
		   JOptionPane.INFORMATION_MESSAGE);
					
 } 
 // If the comma is selected in the checkbox print the number with commas
  else if(commaSeparator.isSelected()) {
					
 // Defines that you want to format a number with commas
   NumberFormat numFormat = NumberFormat.getNumberInstance();
   msg.setText( numFormat.format(totalCalc));
	 JOptionPane.showMessageDialog(Lesson22.this, 
			 msg, "Solution",
			 JOptionPane.INFORMATION_MESSAGE);
	 } 
	 else {
		 msg.setText( String.valueOf( totalCalc));
		 JOptionPane.showMessageDialog(Lesson22.this, 
				 msg, "Solution", 
				 JOptionPane.INFORMATION_MESSAGE);
				
				}
					
			}
			
		}
		
	}
	
 // Implements ActionListener so it can react to events on components
 private class ListenForSlider implements ChangeListener{

 @Override
 public void stateChanged(ChangeEvent e) {
				
 // Check if the source of the event was the button
 if(e.getSource() == howManyTimes){
  label3.setText("Perform How Many Times? " + howManyTimes.getValue() );
  }
  }//stateChanged
		
 }//class ListenForSlider
		
 public static double addNumbers(double number1, double number2, int howMany){
  double total = 0;
   int i = 1;
  while(i <= howMany){
				total = total + (number1 + number2);
				i++;
			}
  return total;
			
 }
		
 public static double subtractNumbers(double number1, double number2, int howMany){
			
			double total = 0;
			
			int i = 1;
			
			while(i <= howMany){
				total = total + (number1 - number2);
				i++;
			}
			
			return total;
			
		}
		
 public static double multiplyNumbers(double number1, double number2, int howMany){
			
			double total = 0;
			
			int i = 1;
			
			while(i <= howMany){
				total = total + (number1 * number2);
				i++;
			}
			
			return total;
			
		}
		
 public static double divideNumbers(double number1, double number2, int howMany){
			
			double total = 0;
			
			int i = 1;
			
			while(i <= howMany){
				total = total + (number1 / number2);
				i++;
			}
			
			return total;
			
		}
	
}