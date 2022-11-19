package bankmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.util.*;

public class MiniStatement extends JFrame {

	
	JButton back;
	String pinno;
	MiniStatement(String pinno){
		
		this.pinno = pinno;
		setLayout(null);
		
		setTitle("MINI STATEMENT");
		
		
		JLabel mini = new JLabel();
		mini.setBounds(20, 140, 400, 200);
		add(mini);
		
		JLabel bank = new JLabel("Indian Bank");
		bank.setFont(new Font ("System",Font.BOLD,16));
		bank.setBounds(150, 20, 100, 35);
		add(bank);
		
		JLabel card = new JLabel();
		card.setBounds(20, 80, 300, 35);
		add(card);
		
		JLabel balance = new JLabel();
		balance.setBounds(20, 400, 300, 35);
		add(balance);
	
		
		try {
			Conn conn= new Conn();
			ResultSet rs = conn.s.executeQuery("select * from login where pinno = '"+pinno+"'");
			while(rs.next())
    		{
    			card.setText("card number: " + rs.getString("cardno").substring(0, 4)+ "XXXXXXXX"+ rs.getString("cardno").substring(12));
    		}
			
		}catch (Exception e) {
			System.out.println(e);
		}
		
		try {
			Conn c= new Conn();
			int bal =0;
    		ResultSet rs = c.s.executeQuery("select * from bank where pinno = '"+pinno+"' ");
    		while(rs.next())
    		{
				mini.setText(mini.getText()+"<html>" + rs.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" +rs.getString("amount")+"<br><br><html>");
				if (rs.getString("type").equals("Deposit")){
    				bal = bal+ Integer.parseInt(rs.getString("amount"));
    			}else {
    				bal = bal - Integer.parseInt(rs.getString("amount"));
    			}
    		}
    		balance.setText("Your Current Account Balance is Rs "+ bal);
    		}catch (Exception e) {
    			 System.out.println(e);
    		}
		
		
		
		
		setSize(400, 600);
		setLocation(20, 20);
		getContentPane().setBackground(Color.WHITE);
		setVisible(true);
		
		
	}
	
	
	public static void main(String args[]) {
	    	new MiniStatement("");  
	    }

	

}
