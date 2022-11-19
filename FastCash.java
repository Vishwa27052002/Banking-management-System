package bankmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.util.*;


public class FastCash extends JFrame  implements ActionListener {
	
	 JButton deposit,withdraw,fastcash,mini,pinchange,balanceenq,exit;
	 String pinno;
	 
	 FastCash(String pinno){
	   
		this.pinno= pinno;
		setLayout(null);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		Image i2= i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
		ImageIcon i3= new ImageIcon(i2);
    	JLabel image= new JLabel(i3);
    	image.setBounds(0, 0, 900, 900);
    	add(image);
    	
    	JLabel text = new JLabel("Select Withdrawl Amount");
    	text.setFont(new Font ("System",Font.BOLD,16));
    	text.setForeground(Color.WHITE);
    	text.setBounds(190, 300, 700, 35);
		image.add(text);
		
		 deposit = new JButton("Rs 100");
		deposit.setBounds(170,370,150,30);
		deposit.addActionListener(this);
		image.add(deposit);
		
		 withdraw = new JButton("Rs 500");
		withdraw.setBounds(350,370,150,30);
		withdraw.addActionListener(this);
		image.add(withdraw);
		
		 fastcash = new JButton("Rs 1000");
		fastcash.setBounds(170,420,150,30);
		fastcash.addActionListener(this);
		image.add(fastcash);
		
		 mini = new JButton("Rs 2000");
		mini.setBounds(350,420,150,30);
		mini.addActionListener(this);
		image.add(mini);
		
		 pinchange = new JButton("Rs 5000");
		pinchange.setBounds(170,470,150,30);
		pinchange.addActionListener(this);
		image.add(pinchange);
		
		 balanceenq = new JButton("Rs 10000");
		balanceenq.setBounds(350,470,150,30);
		balanceenq.addActionListener(this);
		image.add(balanceenq);
		
		 exit = new JButton("BACK");
		exit.setBounds(350,520,150,30);
		exit.addActionListener(this);
		image.add(exit);
		
		setSize(900, 900);
		setLocation(300, 0);
		setUndecorated(true);
		setVisible(true);
	}
	
	
	
	
	public static void main(String args[]) {
    	new FastCash("");  
    }




	
	public void actionPerformed(ActionEvent e) {
	    if ( e.getSource()== exit) {
	    	setVisible(false);
	    	new Transactions(pinno).setVisible(true);
	    	 }else  {
	    	String amount = ((JButton)e.getSource()).getText().substring(3);
	    	Conn c = new Conn();
	    	try {
	    		ResultSet rs = c.s.executeQuery("select * from bank where pinno = '"+pinno+"' ");
	    		int balance =0;
	    		while(rs.next()) {
	    			if (rs.getString("type").equals("Deposit")){
	    				balance = balance+ Integer.parseInt(rs.getString("amount"));
	    			}else {
	    				balance = balance - Integer.parseInt(rs.getString("amount"));
	    			}
	    		}
	    		
	    		if(e.getSource()!= exit && balance < Integer.parseInt(amount)) {
	    			JOptionPane.showMessageDialog(null , "Insufficient Balance");
	    			return;
	    		}
	    		
	    		Date date= new Date();
	    		String query ="insert into bank values('"+pinno+"','"+date+"','Withdrawl','"+amount+"')";
	    		c.s.executeUpdate(query);
	    		JOptionPane.showMessageDialog(null , "RS "+ amount+ " Debited Sucessfully");
	    		
	    		setVisible(false);
	    		new Transactions(pinno).setVisible(true);
	    		
	    	}catch(Exception ae) {
	    		System.out.println(ae);
	    	}
	    }
	}
}

