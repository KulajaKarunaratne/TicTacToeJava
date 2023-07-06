package mainPackage;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class TicTacToe implements ActionListener{
	
	Random random = new Random(); //creating the random object which determines whose turn it is first
	JFrame frame = new JFrame(); //creating the frame object of the JFrame which will create a graphical window
	JPanel title_panel = new JPanel(); //creating a panel object to hold the title
	JPanel button_panel = new JPanel(); //creating a panel object to hold all the buttons
	JLabel textfield = new JLabel(); //creating a label object to hold a message which will be displayed
	JButton[] buttons = new JButton[9]; //creating 9 buttons
	boolean player1_turn;
	boolean player2_turn;
			
	
	TicTacToe(){
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //when closing the window
		frame.setSize(800,800); //setting the frame size as 800 by 800 pixels
		frame.getContentPane().setBackground(new Color (50,50,50)); //setting the default background color
		frame.setLayout(new BorderLayout());
		frame.setVisible(true); //visibility of the frame
		
		textfield.setBackground(new Color(25,25,25)); //setting background color
		textfield.setForeground(new Color(25,255,0)); //setting foreground color
		textfield.setFont(new Font("Ink Free",Font.BOLD,75)); //setting the font style
		textfield.setHorizontalAlignment(JLabel.CENTER); //Horizontal alignment of the message displayed
		textfield.setText("Tic-Tac-Toe"); //setting the text of the Text Field
		textfield.setOpaque(true); //making sure that it is opaque
		
			
		title_panel.setLayout(new BorderLayout());
		title_panel.setBounds(0,0,800,100);
		
		button_panel.setLayout(new GridLayout(3,3)); //setting a 3 by 3 grid within the frame
		button_panel.setBackground(new Color(150,150,150)); //setting the color of the buttons
		
		for (int i = 0; i<9; i++) {
			buttons[i] = new JButton();
			button_panel.add(buttons[i]);
			buttons[i].setFont(new Font("MV Boli", Font.BOLD,120));
		}
		
		title_panel.add(textfield);
		frame.add(title_panel,BorderLayout.NORTH);//adding the title panel to the frame
		frame.add(button_panel);
		
		
		
		
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void firstTurn() {
		
	}
	
	public void check() {
		
	}
	
	public void xWins(int a, int b, int c) {
		
	}
	
	public void oWins(int a, int b, int c) {
		
	}
	

}
