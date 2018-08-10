//package my_swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JScrollBar;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import java.awt.ScrollPane;
import javax.swing.JScrollPane;

public class Wbu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Wbu frame = new Wbu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Wbu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(25, 24, 89, 23);
		contentPane.add(btnNewButton);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(Color.LIGHT_GRAY);
		textArea.setBounds(26, 58, 165, 107);
		contentPane.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBackground(Color.LIGHT_GRAY);
		textArea_1.setBounds(234, 58, 165, 107);
		contentPane.add(textArea_1);
		
		JButton button = new JButton("New button");
		button.setBounds(159, 24, 89, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("New button");
		button_1.setBounds(282, 24, 89, 23);
		contentPane.add(button_1);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(159, 176, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setTabSize(16);
		textArea_2.setRows(11);
		textArea_2.setBounds(34, 210, 4, 15);
		contentPane.add(textArea_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(89, 199, 165, 107);
		contentPane.add(scrollPane);
		
		JTextArea textArea_3 = new JTextArea();
		scrollPane.setViewportView(textArea_3);
		textArea_3.setBackground(Color.LIGHT_GRAY);
	}
}
