package bankmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class PinChange extends JFrame implements  ActionListener{
      
	JPasswordField pin ,rpin;
	JButton change ,back;
	String pinno;
	PinChange(String pinno){
		this.pinno = pinno;
		setLayout(null);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		Image i2= i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
		ImageIcon i3= new ImageIcon(i2);
    	JLabel image= new JLabel(i3);
    	image.setBounds(0, 0, 900, 900);
    	add(image);
    	
    	JLabel text = new JLabel("CHANGE YOUR PIN");
    	text.setFont(new Font ("System",Font.BOLD,16));
    	text.setForeground(Color.WHITE);
    	text.setBounds(250, 290, 500, 35);
		image.add(text);
		
		JLabel pintext = new JLabel("New Pin:");
		pintext.setFont(new Font ("System",Font.BOLD,16));
		pintext.setForeground(Color.WHITE);
		pintext.setBounds(165, 330, 100, 25);
		image.add(pintext);
		
		 pin = new JPasswordField();
		pin.setFont(new Font ("Raleway",Font.BOLD,16));
		pin.setBounds(310, 330, 200, 25);
		image.add(pin);
		
		JLabel repintext = new JLabel("Re-Enter New Pin:");
		repintext.setFont(new Font ("System",Font.BOLD,16));
		repintext.setForeground(Color.WHITE);
		repintext.setBounds(165, 370, 200, 25);
		image.add(repintext);
		
		 rpin = new JPasswordField();
		rpin.setFont(new Font ("Raleway",Font.BOLD,16));
		rpin.setBounds(310, 370, 200, 25);
		image.add(rpin);

		 change = new JButton("CHANGE");
		change.setBounds(165, 435, 150, 30);
		change.addActionListener(this);
		image.add(change);
		
		 back = new JButton("BACK");
		back.setBounds(355, 435, 150, 30);
	    back.addActionListener(this);
		image.add(back);
		
    	setSize(900, 900);
		setLocation(300, 0);
		setUndecorated(true);
		setVisible(true);
	}
	
	
	public static void main(String args[]) {
	    	new PinChange("").setVisible(true);  
	    }


	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource()== change) {
		try {
			 String spin = pin.getText();
			 String rspin = rpin.getText();
			 
			 if(!spin.equals(rspin)) {
				 JOptionPane.showMessageDialog(null , "Entered PIN does not match");
				 return;
			 }
			 
			 if(spin.equals("")) {
				 JOptionPane.showMessageDialog(null , "Please enter New Pin");
				 return;
			 }
			 
			 if (rspin.equals("")) {
				 JOptionPane.showMessageDialog(null , "Please re-enter new Pin");
				 return;
			 }
			 
			 Conn c= new Conn();
			 String query1="update bank set pinno='"+rspin+"' where pinno ='"+pinno+"'";
			 String query2="update login set pinno='"+rspin+"' where pinno ='"+pinno+"'";
			 String query3="update signupthree set pinno='"+rspin+"' where pinno ='"+pinno+"'";
			 
			 c.s.executeUpdate(query1);
			 c.s.executeUpdate(query2);
			 c.s.executeUpdate(query3);
			 
			 JOptionPane.showMessageDialog(null , "Pin Changed Sucessfully");
			 
			 
			 setVisible(false);
	    	 new Transactions(rspin).setVisible(true);
			 
			 
		 }catch (Exception e) {
			 System.out.println(e);
		 }
		
	}else {
		setVisible(false);
		new Transactions(pinno).setVisible(true);
	}

}
}
