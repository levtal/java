package my_swing;


//https://www.youtube.com/watch?v=h3Xeo14Kn_8&index=24&list=PLE7E8B7F4856C9B19

import javax.swing.*;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.*;

public class Combo_boxes extends JFrame{
	
 public static final int FONT_SIZE = 90;		
 Dimension d = new Dimension(FONT_SIZE*4 ,FONT_SIZE*1 );
 Font font = new Font("Arial", Font.BOLD, FONT_SIZE *2/4);		
	 
 JComboBox favoriteShows;
 JButton button1;
 String infoOnComponent = "";
	
 public static void main(String[] args){
  new Combo_boxes();
 }

 public void ChangeSize(Font fnt){
  //http://www.jguru.com/faq/view.jsp?EID=340519
	 
 UIManager.put("OptionPane.minimumSize",new Dimension(500,500));
 
  UIManager.put("Button.font", fnt);
  UIManager.put("OptionPane.messageFont", fnt);
  UIManager.put("OptionPane.buttonFont", fnt);
  UIManager.put("ComboBox.font",fnt); 
 }
 
 
 public Combo_boxes(){
  ChangeSize(font);
  this.setSize(20*FONT_SIZE,15*FONT_SIZE);		
  this.setLocationRelativeTo(null);
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  this.setTitle("My Fourth Frame");
  JPanel thePanel = new JPanel();
		
 // Create an array that will be added to the combo box
 String[] shows = {"Breaking Bad", "Life on Mars", "Doctor Who"};
		
 // Create a combo box and add the array of shows
  favoriteShows = new JComboBox(shows);
   		
 // Add an item to the combo box
 favoriteShows.addItem("Pushing Daisies");
 thePanel.add(favoriteShows);
		
 // Create a button
  button1 = new JButton("Get Answer");
  			
  ListenForButton lForButton = new ListenForButton();
  button1.addActionListener(lForButton);
  thePanel.add(button1);
  this.add(thePanel);
  this.setVisible(true);
		
 // Add an item to a combo box at index 1
 favoriteShows.insertItemAt("Dexter", 1);
 // Only show 3 items at a time
 favoriteShows.setMaximumRowCount(3);
		
 // Remove the item named Dexter
 //favoriteShows.removeItem("Dexter");
 // Remove the item at index 1
 //favoriteShows.removeItemAt(1);
 // Remove all items
 // favoriteShows.removeAllItems();
 }
	
 private class ListenForButton implements ActionListener{
  public void actionPerformed(ActionEvent e){
	 
	  
 if(e.getSource() == button1){
  favoriteShows.setEditable(true);
   // Get item at index 0
  infoOnComponent = "Item at 0: " + favoriteShows.getItemAt(0) + "\n";
   // Get the number of items in the combo box
  infoOnComponent += "Num of Shows: " + favoriteShows.getItemCount() + "\n";
					
  // Get the index for the selected item
  infoOnComponent += "Selected ID: " + favoriteShows.getSelectedIndex() + "\n";
  // Get the value for the selected item
  infoOnComponent += "Selected Show: " + favoriteShows.getSelectedItem() + "\n";
					
 // Find out if the values in the combo box are editable
  infoOnComponent += "Combo Box Editable: " + favoriteShows.isEditable() + "\n";
 System.out.println(infoOnComponent); 
 // infoOnComponent= "<html><span style='font-size:3em'> "+ infoOnComponent; 
  //infoOnComponent +="-----</<span></html>";
     
 JOptionPane o=new JOptionPane();
 
  o.showMessageDialog(Combo_boxes.this, infoOnComponent, "Information", JOptionPane.INFORMATION_MESSAGE);
  infoOnComponent = "";
 }//
 }
 }
	
}