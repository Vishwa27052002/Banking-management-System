package bankmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class Transactions extends JFrame  implements ActionListener {
	
	 JButton deposit,withdraw,fastcash,mini,pinchange,balanceenq,exit;
	 String pinno;
	 
	Transactions(String pinno){
	   
		this.pinno= pinno;
		setLayout(null);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		Image i2= i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
		ImageIcon i3= new ImageIcon(i2);
    	JLabel image= new JLabel(i3);
    	image.setBounds(0, 0, 900, 900);
    	add(image);
    	
    	JLabel text = new JLabel("Please Select your Transaction Type!!");
    	text.setFont(new Font ("System",Font.BOLD,16));
    	text.setForeground(Color.WHITE);
    	text.setBounds(190, 300, 700, 35);
		image.add(text);
		
		 deposit = new JButton("Deposit");
		deposit.setBounds(170,370,150,30);
		deposit.addActionListener(this);
		image.add(deposit);
		
		 withdraw = new JButton("Cash Withdrawal");
		withdraw.setBounds(350,370,150,30);
		withdraw.addActionListener(this);
		image.add(withdraw);
		
		 fastcash = new JButton("Fast Cash");
		fastcash.setBounds(170,420,150,30);
		fastcash.addActionListener(this);
		image.add(fastcash);
		
		 mini = new JButton("Mini Statement");
		mini.setBounds(350,420,150,30);
		mini.addActionListener(this);
		image.add(mini);
		
		 pinchange = new JButton("Pin Change");
		pinchange.setBounds(170,470,150,30);
		pinchange.addActionListener(this);
		image.add(pinchange);
		
		 balanceenq = new JButton("Balance");
		balanceenq.setBounds(350,470,150,30);
		balanceenq.addActionListener(this);
		image.add(balanceenq);
		
		 exit = new JButton("Exit");
		exit.setBounds(350,520,150,30);
		exit.addActionListener(this);
		image.add(exit);
		
		setSize(900, 900);
		setLocation(300, 0);
		setUndecorated(true);
		setVisible(true);
	}
	
	
	
	
	public static void main(String args[]) {
    	new Transactions("");  
    }




	
	public void actionPerformed(ActionEvent e) {
	    if ( e.getSource()== exit) {
	    	System.exit(0);
	    }else if ( e.getSource()== deposit) {
	    	setVisible(false);
	    	new Deposit(pinno).setVisible(true);
	    }else if ( e.getSource()== withdraw) {
	    	setVisible(false);
	    	new Withdrawal(pinno).setVisible(true);
	    }else if ( e.getSource()== fastcash) {
	    	setVisible(false);
	    	new FastCash(pinno).setVisible(true);
	    }else if ( e.getSource()== pinchange) {
	    	setVisible(false);
	    	new PinChange(pinno).setVisible(true);
	    }else if ( e.getSource()== balanceenq) {
	    	setVisible(false);
	    	new BalanceEnq(pinno).setVisible(true);
	    }else if ( e.getSource()== mini) {
	    	setVisible(false);
	    	new MiniStatement(pinno).setVisible(true);
	    }
	}
}
