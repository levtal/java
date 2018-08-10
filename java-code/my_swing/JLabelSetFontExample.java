package my_swing;
//JLabel Set Font Example
 


import java.awt.Font;

import javax.swing.JApplet;
import javax.swing.JLabel;

/*
<applet code="JLabelSetFontExample" width=200 height=200>
</applet>
*/

public class JLabelSetFontExample extends JApplet{

public void init(){
       
/* Create  JLabel (String caption) constructor */
 JLabel label1 = new JLabel("JLabel Set Font Example.");
 // Set custom font for JLabel  
  Font font = new Font("Courier", Font.BOLD,40);
       
        //set font for JLabel
        label1.setFont(font);
       
        //add label to applet
        add(label1);
}
}
