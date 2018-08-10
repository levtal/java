  // Spinner.java
//https://www.youtube.com/watch?v=IMhiGyxF4as&index=26&list=PLE7E8B7F4856C9B19
package my_swing;
import javax.swing.*;
import javax.swing.JSpinner.DefaultEditor;
import javax.swing.JSpinner.ListEditor;
import javax.swing.JSpinner.NumberEditor;

import java.awt.event.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;  // Object that allows me to use height & width units
import java.util.Date;

// Editor for JSpinner that allows easy incrementing of dates

import javax.swing.SpinnerDateModel;
import javax.swing.plaf.basic.BasicArrowButton;

import java.util.Calendar;
import java.awt.Font;

public class Spinner extends JFrame{
 public static final int FONT_SIZE = 90;		
 Dimension d = new Dimension(FONT_SIZE*4 ,FONT_SIZE*1 );
 Font font = new Font("Arial", Font.BOLD, FONT_SIZE *2/3);
  
 JButton button1;
 JSpinner spinner1, spinner2, spinner3, spinner4;
 String outputString = "";
 
 
 public static void main(String[] args){
   new Spinner();
 }

 
 
 public void ChangeSize(Font fnt){
  //http://www.jguru.com/faq/view.jsp?EID=340519
	 
  UIManager.put("OptionPane.minimumSize",new Dimension(500,500));
  //UIManager.put("Spinner.arrowButtonSize" ,new Dimension(1 ,5 ));
  UIManager.getDefaults().put("controlDkShadow", Color.MAGENTA);
  
  UIManager.put("Button.font", fnt);
  UIManager.put("OptionPane.messageFont", fnt);
  UIManager.put("OptionPane.buttonFont", fnt);
  UIManager.put("ComboBox.font",fnt); 
 }


 public Spinner(){
  ChangeSize(font);
  this.setSize(20*FONT_SIZE,15*FONT_SIZE);
  this.setLocationRelativeTo(null);
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  this.setTitle("My Fifth Frame");
  JPanel thePanel = new JPanel();
		
 // Create a button
  button1 = new JButton("Get Answer");
  ListenForButton lForButton = new ListenForButton();
  button1.addActionListener(lForButton);
  thePanel.add(button1);
		
 // Create a basic 1-9 number spinner
 spinner1 = new JSpinner();
 Dimension d_spinner = spinner1.getPreferredSize();  
     
 d_spinner.width =2*FONT_SIZE;
 d_spinner.height = FONT_SIZE;
 spinner1.setPreferredSize(d_spinner);
 spinner1.setFont(font);
 thePanel.add(spinner1);
		
 // Create a spinner with initial number(3), min number (-3),
 // max number(100), increment with each click(2)
		
 spinner2 = new JSpinner(new SpinnerNumberModel(3, -3, 100, 2));
 spinner2.setPreferredSize(d_spinner);
 spinner2.setFont(font);		
 thePanel.add(spinner2);
		
 // Create a spinner using default values
 String[] weekDays = {"Mon", "Tues", "Weds", "Thurs", "Fri"};
 spinner3 = new JSpinner(new SpinnerListModel(weekDays));
 spinner3.setPreferredSize(d_spinner);
 spinner3.setFont(font);	
 
 // Set the size for the spinner so that everything fits
spinner3.setPreferredSize(d_spinner);
 spinner3.setFont(font);
 
 thePanel.add(spinner3);
		
 // Get todays date
 Date todaysDate = new Date();
		
 // Create a date spinner & set default to today, no minimum, or max
 // Increment the days on button presses
 // Can also increment YEAR, MONTH, or DAY_OF_MONTH
 spinner4 = new JSpinner(new SpinnerDateModel(todaysDate, null, null,
		        Calendar.DAY_OF_MONTH));
		
 // DateEditor is an editor that handles displaying & editing 
 //the dates
 JSpinner.DateEditor dateEditor = new JSpinner.DateEditor(spinner4, "dd/MM/yy");
 Dimension d4 = spinner4.getPreferredSize();
 d4.width =   4*FONT_SIZE;
 d4.height =  FONT_SIZE;

 //spinner4.getComponent(2).setPreferredSize(d4); 
 spinner4.setPreferredSize(d4);
 spinner4.setEditor(dateEditor);
 
 
 //spinner4.setPreferredSize(d_spinner);
 spinner4.setFont(font);		
 thePanel.add(spinner4);
		
 /* 
 You can add a change listener with Spinners as well:
 
 ListenForSpinner lForSpinner = new ListenForSpinner();
 
 Tell Java that you want to be alerted when an event
 occurs on the spinner:
 
 spinner4.addChangeListener(lForSpinner);
 */
 this.add(thePanel);
 this.setVisible(true);
		
 }
	
 private class ListenForButton implements ActionListener{
		
 public void actionPerformed(ActionEvent e){
  if(e.getSource() == button1){
   outputString += "Spinner 1 Value: " + spinner1.getValue()+ "\n";
    outputString += "Spinner 2 Value: " + spinner2.getValue() + "\n";
    outputString += "Spinner 3 Value: " + spinner3.getValue() + "\n";
    outputString += "Spinner 4 Value: " + spinner4.getValue() + "\n";
				
   JOptionPane.showMessageDialog(Spinner.this, outputString, "Information", JOptionPane.INFORMATION_MESSAGE);
   outputString = "";
  }
 }
 }
	
}