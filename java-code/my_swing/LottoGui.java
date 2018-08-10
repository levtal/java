package my_swing;

import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.*;
import java.util.*;
 
public class LottoGui
{
	public static final int FONT_SIZE = 30;	
	private Container c;
    private JFrame frame;
    public Font font;  
    public Font font2;
    public Graphics g;
 
    private JPanel panel1;
    private Vector LottoNumbers; 
 
    public  JLabel label1;
    private JLabel label2;
    private JLabel label3;
 
    public String LottoGuiText1;
    private String LottoGuiText2;
    private String LottoGuiText3;
    public String TestText;
 
    public void go()
    {
        //APPLICATIONS WINDOW TITLE
        JFrame frame = new JFrame("eXtreme Lotto");
        c = frame.getContentPane();
         
        //EXIT - SHUTDOWN APPLICATION WHEN PRESSING CLOSE BUTTON [X] 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
        //FRAME/WINDOW LAYOUT IS BORDERLAYOUT
        frame.setLayout(new BorderLayout());
         
        //TEXT FONT IS VERDANA-PLAIN-SIZE 28        
        font = new Font("Verdana", Font.PLAIN, FONT_SIZE); 
        font2 = new Font("Crystal", Font.PLAIN, FONT_SIZE);
         
        //APPLICATION GUI TEXT  
        LottoGuiText1 = new String("[Lotto Number]: ");
        LottoGuiText2 = new String("[Status]: ");
        LottoGuiText3 = new String("[Database]: ");
        TestText = new String("1 2 3 4 5 6 7 8");
     
         
        //APPLICATION JPANEL´S AND LAYOUT
        panel1 = new JPanel();
        panel1.setLayout(new GridLayout(3,1));      
        frame.add(panel1, "Center");
   
        //here is the font change prb. want to change the font 
        //to crystal = the numbers.  
          
        label1 = new JLabel(LottoGuiText1+TestText); 
        panel1.add(label1);
        label2 = new JLabel(LottoGuiText2);
        panel1.add(label2);
        label3 = new JLabel(LottoGuiText3);
        panel1.add(label3);
     
        //APPLICATION FONT AND COLOR            
        
        label1.setFont(new Font("Serif", Font.PLAIN, FONT_SIZE));
        label1.setForeground(Color.green);
        label2.setFont(new Font("Serif", Font.PLAIN, FONT_SIZE));
        label2.setForeground(Color.green);
        label3.setFont(font);
        label3.setForeground(Color.green);
         
        //APPLICATION BACKGROUND COLOR 
        panel1.setBackground(Color.black);
         
        //APPLICATION WINDOW ICON
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("Spider.png"));
 
        //APPLICATION SIZE-LOCATION
        frame.setSize(400,750);
       // frame.setResizable(false);
        frame.setLocation(55 , 70 );
        frame.setVisible(true);
    }
 
    public static void main(String args[])
    {
        LottoGui LG = new LottoGui();
        LG.go();
    }
}