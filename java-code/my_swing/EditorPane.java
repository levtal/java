package my_swing;
//Lesson 39
//https://www.youtube.com/watch?v=iZcfMa2Fagg&index=42&list=PLE7E8B7F4856C9B19   
/*
 * JEditorPane Swing component. It allows you to both display 
 * rich text and HTML documents.

listen for events in JEditorPane, when users click on links 
for example. These events are handled by HyperlinkEvent and 
HyperlinkListener.

Because some people are having trouble with Eclipse,
I also show how you can get Eclipse to do some coding for you.
   */
  
  
  import java.awt.BorderLayout;
  import java.awt.event.ActionEvent;
  import java.awt.event.ActionListener;
  import java.io.IOException;

  // Thrown when a URL doesn't contain http://
  // and other rules like that

  import java.net.MalformedURLException;
  import java.net.URL;

  // A text component that allows for rich text
  // and basic html display

  import javax.swing.JEditorPane;
  import javax.swing.JFrame;
  import javax.swing.JOptionPane;
  import javax.swing.JPanel;
  import javax.swing.JScrollPane;
  import javax.swing.JTextField;

  // Provides information on events triggered
  // through interaction with links

  import javax.swing.event.HyperlinkEvent;

  // Monitors user activity with links

import javax.swing.event.HyperlinkListener;

public class EditorPane extends JFrame implements HyperlinkListener, ActionListener{

 public static void main(String[] args){
   //new EditorPane("file:///Volumes/My%20Book/Presentations/HTML%20Tutorial/htmlexample.html");
//C:\\Users\\normi\\d\\java\\workspace\\my_swing\\src\\my_swing\\
	 
	 new EditorPane("file:\\Users\\normi\\d\\java\\workspace\\my_swing\\src\\my_swing\\tmp.html");
  }//main
  	
 String defaultURL;
 JPanel toolPanel = new JPanel();
 JTextField theURL = new JTextField(25);
  	
 // Displays basic html pages
 // Doesn't understand JavaScript
 JEditorPane htmlPage;
  	
 public EditorPane(String defaultURL){
  JFrame frame = new JFrame("Java Browser");
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  this.defaultURL = defaultURL;
  
  	    
 theURL.addActionListener(this);
  		
 // Set default text in the JTextField
 theURL.setText(defaultURL);
  		
 // Add the text field to a panel
 toolPanel.add(theURL);
  		
  // Add the panel to the northern quadrant of a frame
  frame.add(toolPanel, BorderLayout.NORTH);
 try {
    htmlPage = new JEditorPane(defaultURL);
  			
   // If the user interacts with the JEditorPane
   // actions are triggered. Ex. Click on a link
   // change the JEditorPane page location
   htmlPage.addHyperlinkListener(this);
  			
   // You can leave this true for rich text 
   //documents but it will mess up web page 
   //display
   htmlPage.setEditable(false);
  			
  // Add the JEditorPane to a Scroll pane
   JScrollPane scroller = new JScrollPane(htmlPage);
  			
   // Add Scroll pane and JEditorPane to the frame
   frame.add(scroller, BorderLayout.CENTER);
  			
 }// try 
  		
 // If something goes wrong with locating  html page 
 catch (IOException e) {
  			e.printStackTrace();
  }
  		
 // Set size of the frame and display it
 frame.setSize(1000, 800);
 frame.setVisible(true);
 }//EditorPane

 public void hyperlinkUpdate(HyperlinkEvent e) {
  		
 // Checks if a link was clicked
 // EventType.ENTERED : Checks for hovering
 // EventType.EXITED : Checks for leaving link
 if(e.getEventType() == HyperlinkEvent.EventType.ACTIVATED){
  	 try {
        // Sets the URL to be displayed
        // getURL gets the URL for the link
        htmlPage.setPage(e.getURL());
  				
        // toExternalForm creates a String 
        //representation of the URL
        theURL.setText(e.getURL().toExternalForm());
     }//try
     catch(IOException e1){
      			e1.printStackTrace();
      }
  			
   }//if
 }//hyperlinkUpdate

 public void actionPerformed(ActionEvent e) {
  		
  String pageURL = "";
  // Gets the Object that had an event triggered
  if(e.getSource() == theURL){
  			
  	 // Get the text in the JTextField
     pageURL = theURL.getText();
  } else {
        pageURL = defaultURL;
       // Opens an alert box when an error is made
     JOptionPane.showMessageDialog(EditorPane.this, 
  					"Please Enter a Web Address", "Error", 
  					JOptionPane.ERROR_MESSAGE);
  			
  		}//else
  try{
  			
      // Sets the URL to be displayed
       htmlPage.setPage(new URL(pageURL));
        theURL.setText(pageURL);
    }
    catch(MalformedURLException e2){
  			JOptionPane.showMessageDialog(EditorPane.this, 
  					"Please use http://", "Error", 
  					JOptionPane.ERROR_MESSAGE);
  		}
  		
  		catch(IOException e1){
  			e1.printStackTrace();
  		}
  		
  	}
  	
  }

 
