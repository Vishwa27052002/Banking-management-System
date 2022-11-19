package bankmanagementsystem;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SignupThree extends JFrame implements ActionListener {
	
	JRadioButton r1,r2,r3,r4;
	JCheckBox c1,c2,c3,c4,c5,c6,c7;
	JButton submit ,cancel;
	String formno;
	
	SignupThree( String formno){
		this.formno= formno;
		setLayout(null);
		
		setTitle ("NEW ACCOUNT APPLICATION FORM - PAGE:3");
		
		JLabel l1 = new JLabel("Page 3: Account Details");
		l1.setFont(new Font ("Raleway",Font.BOLD,22));
		l1.setBounds(290, 70, 400, 30);
		add(l1);
		
		JLabel type = new JLabel("Account Type:");
		type.setFont(new Font ("Raleway",Font.BOLD,22));
		type.setBounds(100, 140, 400, 30);
		add(type);
		 
		r1 = new JRadioButton(" Saving Account ");
		r1.setFont(new Font ("Raleway",Font.BOLD,16));
		r1.setBounds(100, 180, 180, 30);
		r1.setBackground(Color.WHITE);
    	add(r1);
    	 
		r2 = new JRadioButton(" Fixed Deposit Account ");
		r2.setFont(new Font ("Raleway",Font.BOLD,16));
		r2.setBounds(350, 180, 220, 30);
		r2.setBackground(Color.WHITE);
    	add(r2);
    	 
		r3 = new JRadioButton(" Current Account ");
		r3.setFont(new Font ("Raleway",Font.BOLD,16));
		r3.setBounds(100, 220, 180, 30);
		r3.setBackground(Color.WHITE);
    	add(r3);
    	
		r4 = new JRadioButton(" Recurring Deposit Account ");
		r4.setFont(new Font ("Raleway",Font.BOLD,16));
		r4.setBounds(350, 220, 240, 30);
		r4.setBackground(Color.WHITE);
    	add(r4);
    	
    	ButtonGroup groupaccount = new ButtonGroup();
    	groupaccount.add(r1);
    	groupaccount.add(r2);
    	groupaccount.add(r3);
    	groupaccount.add(r4);
		
    	JLabel cardno = new JLabel("Card Number : ");
    	cardno.setFont(new Font ("Raleway",Font.BOLD,22));
    	cardno.setBounds(100, 300, 200, 30);
		add(cardno);
		
		JLabel number = new JLabel("XXXX-XXXX-XXXX-4842");
		number.setFont(new Font ("Raleway",Font.BOLD,22));
		number.setBounds(330, 300, 300, 30);
		add(number);
		
		JLabel carddetails = new JLabel("(Your 16 Digit Card no)");
		carddetails.setFont(new Font ("Raleway",Font.BOLD,16));
		carddetails.setBounds(100, 330, 300, 30);
		add(carddetails);
		
		JLabel pinno = new JLabel("Pin:");
		pinno.setFont(new Font ("Raleway",Font.BOLD,22));
		pinno.setBounds(100, 370, 200, 30);
		add(pinno);
		
		JLabel number2 = new JLabel("XXXX");
		number2.setFont(new Font ("Raleway",Font.BOLD,22));
		number2.setBounds(330, 370, 300, 30);
		add(number2);
		
		JLabel pindetails = new JLabel("(Your 16 Digit Pin no)");
		pindetails.setFont(new Font ("Raleway",Font.BOLD,16));
		pindetails.setBounds(100, 400, 300, 30);
		add(pindetails);
		
		JLabel service = new JLabel("Services Required:");
		service.setFont(new Font ("Raleway",Font.BOLD,22));
		service.setBounds(100, 450, 400, 30);
		add(service);
		
		c1 = new JCheckBox("ATM CARD");
		c1.setBackground(Color.WHITE);
		c1.setFont(new Font ("Raleway",Font.BOLD,16));
		c1.setBounds(100, 500, 200, 30);
		add(c1);
		
		c2 = new JCheckBox("Interent banking");
		c2.setBackground(Color.WHITE);
		c2.setFont(new Font ("Raleway",Font.BOLD,16));
		c2.setBounds(350, 500, 200, 30);
		add(c2);
		
		c3 = new JCheckBox("Mobile banking");
		c3.setBackground(Color.WHITE);
		c3.setFont(new Font ("Raleway",Font.BOLD,16));
		c3.setBounds(100, 550, 200, 30);
		add(c3);
		
		c4 = new JCheckBox("Email & SMS Alerts");
		c4.setBackground(Color.WHITE);
		c4.setFont(new Font ("Raleway",Font.BOLD,16));
		c4.setBounds(350, 550, 200, 30);
		add(c4);
		
		c5 = new JCheckBox("Cheque Book");
		c5.setBackground(Color.WHITE);
		c5.setFont(new Font ("Raleway",Font.BOLD,16));
		c5.setBounds(100, 600, 200, 30);
		add(c5);
		
		c6 = new JCheckBox("E-Statement");
		c6.setBackground(Color.WHITE);
		c6.setFont(new Font ("Raleway",Font.BOLD,16));
		c6.setBounds(350, 600, 200, 30);
		add(c6);
		
		c7 = new JCheckBox("I Hereby Declares that the above mentioned details are correct tp best of my knowlegde ");
		c7.setBackground(Color.WHITE);
		c7.setFont(new Font ("Raleway",Font.BOLD,14));
		c7.setBounds(100, 660, 650, 30);
		add(c7);
		
		submit = new JButton("SUBMIT");
		submit.setBackground(Color.BLACK);
		submit.setForeground(Color.WHITE);
		submit.setBounds(220, 720, 100, 30);
		submit.addActionListener(this);
    	add(submit);
    	
    	cancel = new JButton("CANCEL");
    	cancel.setBackground(Color.BLACK);
    	cancel.setForeground(Color.WHITE);
    	cancel.setBounds(440, 720, 100, 30);
    	cancel.addActionListener(this);
    	add(cancel);
		
		getContentPane().setBackground(Color.white);
		
		setSize(850, 800);
		setLocation(350, 10);
		setVisible(true);
		
		
	}
	
	
	
	
	
	 public static void main(String args[]) {
	    	new SignupThree("");  
	    }





	public void actionPerformed(ActionEvent e) {
		if ( e.getSource()== submit) {
			String accounttype = null;
			if(r1.isSelected()) {
				accounttype= "Saving Account";
			}else if (r2.isSelected()) {
				accounttype= "Fixed Deposit Account";
			}else if (r3.isSelected()) {
				accounttype= "Current Account";
			}else if (r4.isSelected()) {
				accounttype= "Recurring Deposit Account";
			}
			
			Random random = new Random();
			long cardno = Math.abs((random.nextLong() % 90000000L) + 5040936000000000L);
			
			String pinno = " "+Math.abs((random.nextLong() % 9000L) + 1000L);
			
			String facility = "";
			if (c1.isSelected()) {
				facility = facility + "Atm Card";
			}else if (c2.isSelected()) {
				facility = facility + "Interent banking";
			}else if (c3.isSelected()) {
				facility = facility + "Mobile banking";
			}else if (c4.isSelected()) {
				facility = facility + "Email & SMS Alerts";
			}else if (c5.isSelected()) {
				facility = facility + "Cheque Book";
			}else if (c6.isSelected()) {
				facility = facility + "E-Statement";
			}
			
			 try {
				 if(accounttype.equals("")) {
					 JOptionPane.showMessageDialog(null, "Account type is Requried");
				 }else {
				 Conn c = new Conn();
				String query1 = "insert into signupthree values('"+formno+"','"+accounttype+"','"+cardno+"','"+pinno+"','"+facility+"')";
				String query2 = "insert into login values('"+formno+"','"+cardno+"','"+pinno+"')";
			      c.s.executeUpdate(query1);
			      c.s.executeUpdate(query2);
			      
			      JOptionPane.showMessageDialog(null, "Card number:"+cardno+"\n Pin:"+pinno);
			      
			      setVisible(false);
			      new Deposit(pinno).setVisible(false);
				 }
		   
		   }catch(Exception ae) {
			   System.out.println(ae);
		   }
		}else if (e.getSource()== cancel) {
			setVisible(false);
			new Login().setVisible(true);
		}
	}


}
