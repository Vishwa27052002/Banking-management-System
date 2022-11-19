package bankmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.util.*;


public class BalanceEnq extends JFrame implements ActionListener{

	String pinno;
	JButton back;
	BalanceEnq(String pinno){
		
		this.pinno = pinno;
		setLayout(null);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		Image i2= i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
		ImageIcon i3= new ImageIcon(i2);
    	JLabel image= new JLabel(i3);
    	image.setBounds(0, 0, 900, 900);
    	add(image);
    	
		
    	back = new JButton("BACK");
		back.setBounds(355, 510, 150, 30);
	    back.addActionListener(this);
		image.add(back);
		
	//	Conn c = new Conn();
		int balance =0;
    	try {
    		Conn c = new Conn();
    		ResultSet rs = c.s.executeQuery("select * from bank where pinno = '"+pinno+"' ");
    		while(rs.next())
    		{
    			if (rs.getString("type").equals("Deposit"))
    			{
    				balance = balance+ Integer.parseInt(rs.getString("amount"));
    			}else 
    			{
    				balance = balance - Integer.parseInt(rs.getString("amount"));
    			}
    		}
    		}catch (Exception e) {
    			 System.out.println(e);
    		}
    	
    	JLabel text = new JLabel("Your Current Account Balance is Rs "+balance);
    	text.setFont(new Font ("System",Font.BOLD,16));
    	text.setForeground(Color.WHITE);
    	text.setBounds(170, 300, 400, 35);
		image.add(text);
		
		setSize(900, 900);
		setLocation(300, 0);
		setUndecorated(true);
		setVisible(true);
		
		
	}
	
	
	  public static void main(String args[]) {
	    	new BalanceEnq("");  
	    }


	
	public void actionPerformed(ActionEvent e) {
		setVisible(false);
		new Transactions(pinno).setVisible(true);
	}
	    
}
