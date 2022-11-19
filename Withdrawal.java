package bankmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Withdrawal extends JFrame  implements ActionListener{
	
	JTextField amount;
	JButton withdraw,back;
	String pinno;

	Withdrawal(String pinno){
		
		
		this.pinno = pinno;
		setLayout(null);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		Image i2= i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
		ImageIcon i3= new ImageIcon(i2);
    	JLabel image= new JLabel(i3);
    	image.setBounds(0, 0, 900, 900);
    	add(image);
    	
    	JLabel text = new JLabel("Enter the amount you want to withdraw");
    	text.setFont(new Font ("System",Font.BOLD,16));
    	text.setForeground(Color.WHITE);
    	text.setBounds(190, 300, 400, 35);
		image.add(text);
    	
		 amount = new JTextField();
		amount.setBounds(180, 350, 320, 25);
		amount.setFont(new Font("Raleway",Font.BOLD,22));
	   	image.add(amount);
    	
	   	withdraw = new JButton("Withdraw");
	   	withdraw.setBounds(355,485,150,30);
	   	withdraw.addActionListener(this);
		image.add(withdraw);
		
		  back = new JButton("Back");
		 back.setBounds(355,520,150,30);
	     back.addActionListener(this);
		 image.add(back);
	   	
    	setSize(900, 900);
		setLocation(300, 0);
		//setUndecorated(true);
		setVisible(true);
		
		
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		 if ( e.getSource()== withdraw) {
		    	String number = amount.getText();
		    	Date date = new Date();
			    if(number.equals("")) {
			    	JOptionPane.showMessageDialog(null, "Please enter the amount you want to withdraw!!");
			    }else {
			    	try {
			    	Conn c = new Conn();
			    	String query="insert into bank values('"+pinno+"','"+date+"','Withdrawl','"+number+"')";	
			    	 c.s.executeUpdate(query);
			    	 JOptionPane.showMessageDialog(null, "Rs "+number+" withdrawn successfully");
			    	setVisible(false);
			    	new Transactions(pinno).setVisible(true);
			    	}catch(Exception ae) {
			    		System.out.println(ae);
			    	}
			    }
		    }else if(e.getSource()== back) {
		    	setVisible(false);
		    	new Transactions(pinno).setVisible(true);
		    }
		
	}
	
	public static void main(String args[]) {
    	new Withdrawal("");  
    }

}
