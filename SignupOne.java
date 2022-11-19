package bankmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupOne extends JFrame implements ActionListener {

	
	long random;
	JTextField nameTextField,fnameTextField,emailTextField,addressTextField,cityTextField,stateTextField,pincTextField;
	JButton next;
	JRadioButton male,female,Other,married,unmarried;
	JLabel Formno,personalDetails,name,fname,dob,gender,email,marital,address,city,state,pinc;
	JDateChooser dateChooser;
	SignupOne(){
		setLayout(null);
		
		Random ran = new Random();
		long random = Math.abs(ran.nextLong() %9000L +1000L);
		
		 Formno = new JLabel("APPLICATION FORM NO:" + random);
		Formno.setFont(new Font ("Osward",Font.BOLD,38));
		Formno.setBounds(140, 20, 600, 40);
    	add(Formno);
    	
    	 personalDetails = new JLabel("page 1: Personal Details");
    	personalDetails.setFont(new Font ("Osward",Font.BOLD,22));
    	personalDetails.setBounds(290, 80, 400, 30);
    	add(personalDetails);
    	
    	 name = new JLabel("Name:");
    	name.setFont(new Font ("Osward",Font.BOLD,20));
    	name.setBounds(100, 140, 100, 30);
    	add(name);
    	 
    	 nameTextField = new JTextField();
    	nameTextField.setBounds(300, 140, 400, 30);
    	nameTextField.setFont(new Font("Arial",Font.BOLD,14));
    	add(nameTextField);
    	
    	 fname = new JLabel("Father's Name:");
    	fname.setFont(new Font ("Osward",Font.BOLD,20));
    	fname.setBounds(100, 190, 200, 30);
    	add(fname);
    	
    	 fnameTextField = new JTextField();
    	fnameTextField.setBounds(300, 190, 400, 30);
    	fnameTextField.setFont(new Font("Arial",Font.BOLD,14));
    	add(fnameTextField);
    	
    	 dob = new JLabel("Date of Birth:");
    	dob.setFont(new Font ("Osward",Font.BOLD,20));
    	dob.setBounds(100, 240, 200, 30);
    	add(dob);
    	
         dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 240, 400, 30);
        dateChooser.setForeground(new Color(105, 105, 105));
        add(dateChooser);
    	
    	 gender = new JLabel("Gender:");
    	gender.setFont(new Font ("Osward",Font.BOLD,20));
    	gender.setBounds(100, 290, 200, 30);
    	add(gender);
    	
    	 male = new JRadioButton("Male");
    	male.setBounds(300, 290, 60, 30);
    	male.setBackground(Color.WHITE);
    	add(male);
    	
    	 female = new JRadioButton("Female");
    	female.setBounds(450, 290, 120, 30);
    	female.setBackground(Color.WHITE);
    	add(female);
    	
    	ButtonGroup gendergroup = new ButtonGroup();
    	gendergroup.add(male);
    	gendergroup.add(female);
    	
    	
    	 email = new JLabel("Email:");
    	email.setFont(new Font ("Osward",Font.BOLD,20));
    	email.setBounds(100, 340, 200, 30);
    	add(email);
    	
    	 emailTextField = new JTextField();
    	emailTextField.setBounds(300, 340, 400, 30);
    	emailTextField.setFont(new Font("Arial",Font.BOLD,14));
    	add(emailTextField);

    	
    	 marital = new JLabel("Marital status:");
    	marital.setFont(new Font ("Osward",Font.BOLD,20));
    	marital.setBounds(100, 390, 200, 30);
    	add(marital);
    	
    	 married = new JRadioButton("Married");
    	married.setBounds(300, 390, 100, 30);
    	married.setBackground(Color.WHITE);
    	add(married);
    	
    	 unmarried = new JRadioButton("Unmarried");
    	unmarried.setBounds(450, 390, 100, 30);
    	unmarried.setBackground(Color.WHITE);
    	add(unmarried);
    	
    	 Other = new JRadioButton("Other");
    	Other.setBounds(610, 390, 100, 30);
    	Other.setBackground(Color.WHITE);
    	add(Other);
    	
    	ButtonGroup maritalgroup = new ButtonGroup();
    	maritalgroup.add(married);
    	maritalgroup.add(unmarried);
    	maritalgroup.add(Other);

    	 address = new JLabel("Address:");
    	address.setFont(new Font ("Osward",Font.BOLD,20));
    	address.setBounds(100, 440, 200, 30);
    	add(address);
    	
    	 addressTextField = new JTextField();
    	addressTextField.setBounds(300, 440, 400, 30);
    	addressTextField.setFont(new Font("Arial",Font.BOLD,14));
    	add(addressTextField);

    	 city = new JLabel("City:");
    	city.setFont(new Font ("Osward",Font.BOLD,20));
    	city.setBounds(100, 490, 200, 30);
    	add(city);
    	
    	 cityTextField = new JTextField();
    	cityTextField.setBounds(300, 490, 400, 30);
    	cityTextField.setFont(new Font("Arial",Font.BOLD,14));
    	add(cityTextField);
    	
    	 state = new JLabel("State:");
    	state.setFont(new Font ("Osward",Font.BOLD,20));
    	state.setBounds(100, 540, 200, 30);
    	add(state);
    	
    	 stateTextField = new JTextField();
    	stateTextField.setBounds(300, 540, 400, 30);
    	stateTextField.setFont(new Font("Arial",Font.BOLD,14));
    	add(stateTextField);
    	
    	 pinc = new JLabel("Pincode:");
    	pinc.setFont(new Font ("Osward",Font.BOLD,20));
    	pinc.setBounds(100, 590, 200, 30);
    	add(pinc);
    	
    	 pincTextField = new JTextField();
    	pincTextField.setBounds(300, 590, 400, 30);
    	pincTextField.setFont(new Font("Arial",Font.BOLD,14));
    	add(pincTextField);
    	
    	 next = new JButton("NEXT");
    	next.setBackground(Color.BLACK);
    	next.setForeground(Color.WHITE);
    	next.setBounds(620, 660, 80, 30);
    	next.addActionListener(this);
    	add(next);
    	
    	Formno.setFont(new Font ("Osward",Font.BOLD,38));
		Formno.setBounds(140, 20, 600, 40);
    	add(Formno);
    	
		getContentPane().setBackground(Color.white);
		
		setSize(850, 800);
		setLocation(350, 10);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		 String formno = "" +random;
		 String name = nameTextField.getText();
		 String fname = fnameTextField.getText();
		 String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
		
		
		 String gender= null;
		 if (male.isSelected()) {
			 gender="Male";
		 }else if (female.isSelected()) {
			 gender="Female";
		 }
		
		 String email = emailTextField.getText();
		 String marital= null;
		 if(married.isSelected()) {
			 marital="married";
		 }else if (unmarried.isSelected()) {
			 marital="unmarried";
		 }else if (Other.isSelected()) {
			 marital="Other";
		 }
		 
		 String address = addressTextField.getText();
		 String city = cityTextField.getText();
		 String state = stateTextField.getText();
		 String pinc = pincTextField.getText();
		 
		 
		 try {
			 if(name.equals("")) {
				 JOptionPane.showMessageDialog(null, "Name is Requried");
			 }else {
				 Conn c = new Conn();
				 String query = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+state+"','"+city+"','"+pinc+"')";
			      c.s.executeUpdate(query);
			      
			      setVisible(false);
			      new SignupTwo(formno).setVisible(true);
			 }
		 }catch(Exception e) {
			 System.out.println(e);
		 }
	}
	
	
	
	  public static void main(String args[]) {
	    	new SignupOne();  
	    }
}
