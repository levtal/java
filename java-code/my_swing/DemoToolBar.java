package my_swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/** Program to demonstrate tool bars. (Includes tool tips).<p>
*
* @see <a href="DemoToolBar.java">source code</a>
* @author Scott MacKenzie, 2002
*/
public class DemoToolBar
{
   public static void main(String[] args)
   {
       DemoToolBarFrame frame = new DemoToolBarFrame();
       frame.pack();
       frame.setTitle("DemoToolBar");
       frame.pack();
       frame.setVisible(true);
   }
}

class DemoToolBarFrame extends JFrame implements ActionListener
{
    private JTextField message;
    private JToolBar toolBar;
    private JButton left;
    private JButton right;
    private JButton up;
    private JButton down;
    private JButton red;
    private JButton green;
    private JButton blue;
    private JButton italic;
    private JButton bold;
    private JButton underline;
    private JButton restore;

    final Font DEFAULT_FONT = new Font("Serif", Font.PLAIN, 18);
    final String DEFAULT_MESSAGE = "Hello Java World";
    final Color DEFAULT_COLOR = Color.blue;

    public DemoToolBarFrame()
    {
        final int HEIGHT = 150;

        // ----------------------------------
        // construct and configure components
        // ----------------------------------

        message = new JTextField(DEFAULT_MESSAGE);
        message.setFont(DEFAULT_FONT);
        message.setEditable(false);
        message.setForeground(DEFAULT_COLOR);
        message.setHorizontalAlignment(SwingConstants.CENTER);
        message.setBackground(Color.pink);

        toolBar = new JToolBar();
        left = new JButton(new ImageIcon("left.gif"));
        right = new JButton(new ImageIcon("right.gif"));
        up = new JButton(new ImageIcon("bigger.gif"));
        down = new JButton(new ImageIcon("smaller.gif"));
        red = new JButton(new ImageIcon("red.gif"));
        green = new JButton(new ImageIcon("green.gif"));
        blue = new JButton(new ImageIcon("blue.gif"));
        italic = new JButton(new ImageIcon("italic.gif"));
        bold = new JButton(new ImageIcon("bold.gif"));
        underline = new JButton(new ImageIcon("underline.gif"));
        restore = new JButton(new ImageIcon("restore.gif"));

        message.setToolTipText("Important message");
        left.setToolTipText("Move message left");
        right.setToolTipText("Move message right");
        up.setToolTipText("Increase font size");
        down.setToolTipText("Decrease font size");
        red.setToolTipText("Change text colour to red");
        green.setToolTipText("Change text colour to green");
        blue.setToolTipText("Change text colour to blue");
        italic.setToolTipText("Italic");
        bold.setToolTipText("Bold");
        underline.setToolTipText("Underline");
        restore.setToolTipText("Restore message to default settings");

        toolBar.add(left);
        toolBar.add(right);
        toolBar.addSeparator();
        toolBar.add(up);
        toolBar.add(down);
        toolBar.addSeparator();
        toolBar.add(red);
        toolBar.add(green);
        toolBar.add(blue);
        toolBar.addSeparator();
        toolBar.add(italic);
        toolBar.add(bold);
        toolBar.add(underline);
        toolBar.addSeparator();
        toolBar.add(restore);

        // -------------
        // add listeners
        // -------------

        addWindowListener(new WindowCloser());
        left.addActionListener(this);
        right.addActionListener(this);
        up.addActionListener(this);
        down.addActionListener(this);
        red.addActionListener(this);
        green.addActionListener(this);
        blue.addActionListener(this);
        italic.addActionListener(this);
        bold.addActionListener(this);
        restore.addActionListener(this);
        underline.addActionListener(this);

        // -----------------------------
        // arrange components in a panel
        // -----------------------------

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        Dimension d = toolBar.getPreferredSize();
        double w = d.getWidth();
        panel.setPreferredSize(new Dimension((int)w, HEIGHT));
        panel.add(toolBar, BorderLayout.NORTH);
        panel.add(message, BorderLayout.CENTER);

        Container contentPane = this.getContentPane();
        contentPane.add(panel);
    }

   // ------------------------------
   // implement ActionEvent listener
   // ------------------------------

   public void actionPerformed(ActionEvent ae)
   {
      Object source = ae.getSource();

      Font f = message.getFont();
      int style = f.getStyle();
      int size = f.getSize();

      if (source == left)
         message.setText(message.getText() + " ");
      else if (source == right)
         message.setText(" " + message.getText());
      else if (source == up)
         message.setFont(new Font(f.getName(), style, size + 1));
      else if (source == down)
      {
         size = size > 1 ? --size : size;  
         message.setFont(new Font(f.getName(), style, size));
      }
      else if (source == red)
         message.setForeground(Color.red);
      else if (source == green)
         message.setForeground(Color.green);
      else if (source == blue)
         message.setForeground(Color.blue);
      else if (source == italic)
         message.setFont(new Font(f.getName(), style ^ Font.ITALIC, size));
      else if (source == bold)
         message.setFont(new Font(f.getName(), style ^ Font.BOLD, size));
      else if (source == underline)
         JOptionPane.showMessageDialog(this,
            "Sorry, this option is not implemented!",
            "Underline",
            JOptionPane.INFORMATION_MESSAGE
         );
      else if (source == restore)
      {
         message.setText(DEFAULT_MESSAGE);
         message.setFont(DEFAULT_FONT);
         message.setForeground(DEFAULT_COLOR);
      }
   }

   private class WindowCloser extends WindowAdapter
   {
      public void windowClosing(WindowEvent event)
      {
         System.exit(0);
      }
   }
}
