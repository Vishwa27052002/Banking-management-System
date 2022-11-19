package bankmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener { 
	
	JTextField pannoTextField,aadharnoTextField;
	JButton next;
	JRadioButton syes,sNo,eyes,eNo;
	JComboBox religion1,category,income,education1,occupation1;
	String formno;
	
	SignupTwo(String formno){
		this.formno=formno;
		setLayout(null);
		
		setTitle ("NEW ACCOUNT APPLICATION FORM - PAGE:2");
		
    	
		JLabel additionalDetails = new JLabel("page 2: Additional Details");
		additionalDetails.setFont(new Font ("Osward",Font.BOLD,22));
		additionalDetails.setBounds(290, 80, 400, 30);
    	add(additionalDetails);
    	
    	JLabel religion = new JLabel("Religion:");
    	religion.setFont(new Font ("Osward",Font.BOLD,20));
    	religion.setBounds(100, 140, 100, 30);
    	add(religion);
    	 
    	String valReligion[] = {"Hindu","Christian","Muslim","Others"};
    	  religion1 =  new JComboBox(valReligion);
    	 religion1.setBounds(300, 140, 400, 30);
    	 religion1.setBackground(Color.WHITE);
    	 add(religion1);
    	
    	 
    	JLabel Category = new JLabel("Category:");
    	Category.setFont(new Font ("Osward",Font.BOLD,20));
    	Category.setBounds(100, 190, 200, 30);
    	add(Category);
    	
    	 String vaCategory[] = {"Genral","OBC","MBC","SC","ST","Others"};
    	  category = new JComboBox(vaCategory);
    	 category.setBounds(300, 190, 400, 30);
    	 category.setBackground(Color.WHITE);
    	 add(category);
    	
    	JLabel Income = new JLabel("Income:");
    	Income.setFont(new Font ("Osward",Font.BOLD,20));
    	Income.setBounds(100, 240, 200, 30);
    	add(Income);
    	
    	 String incomeCategory[] = {"Null","< 1,50,000","< 2,50,000","< 5,00,000","upto 10,00,000"};
    	  income = new JComboBox(incomeCategory);
    	 income.setBounds(300, 240, 400, 30);
    	 income.setBackground(Color.WHITE);
    	 add(income);
    	
    	
        JLabel education = new JLabel("Educational");
        education.setFont(new Font ("Osward",Font.BOLD,20));
        education.setBounds(100, 290, 200, 30);
    	add(education);
 
    	JLabel qualification = new JLabel("Qualification:");
    	qualification.setFont(new Font ("Osward",Font.BOLD,20));
    	qualification.setBounds(100, 315, 200, 30);
    	add(qualification);
    	
    	String educationVal[] = {"Non-Graduate","Graduate","Post Graduate","Doctrate","Others"};
   	  education1 = new JComboBox(educationVal);
   	education1.setBounds(300, 305, 400, 30);
   	education1.setBackground(Color.WHITE);
   	 add(education1);
    	
    	JLabel occupation = new JLabel("Occupation:");
    	occupation.setFont(new Font ("Osward",Font.BOLD,20));
    	occupation.setBounds(100, 370, 200, 30);
    	add(occupation);
    	
    	String occupationVal[] = {"Employee","Self-Employeed","Bussiness","Student","Retired","Others"};
      	  occupation1 = new JComboBox(occupationVal);
      	occupation1.setBounds(300, 370, 400, 30);
      	occupation1.setBackground(Color.WHITE);
      	 add(occupation1);
    	
    	
    	JLabel panno = new JLabel("Pan no:");
    	panno.setFont(new Font ("Osward",Font.BOLD,20));
    	panno.setBounds(100, 430, 200, 30);
    	add(panno);
    	
    	pannoTextField = new JTextField();
    	pannoTextField.setBounds(300, 430, 400, 30);
    	pannoTextField.setFont(new Font("Arial",Font.BOLD,14));
    	add(pannoTextField);

    	JLabel aadharno = new JLabel("Aadhar no:");
    	aadharno.setFont(new Font ("Osward",Font.BOLD,20));
    	aadharno.setBounds(100, 490, 200, 30);
    	add(aadharno);
    	
    	aadharnoTextField = new JTextField();
    	aadharnoTextField.setBounds(300, 490, 400, 30);
    	aadharnoTextField.setFont(new Font("Arial",Font.BOLD,14));
    	add(aadharnoTextField);
    	
    	JLabel sc = new JLabel("Senior Citizen:");
    	sc.setFont(new Font ("Osward",Font.BOLD,20));
    	sc.setBounds(100, 540, 200, 30);
    	add(sc);
    	
    	syes = new JRadioButton("Yes");
    	syes.setBounds(300, 540, 100, 30);
    	syes.setBackground(Color.WHITE);
    	add(syes);
    	
    	sNo = new JRadioButton("No");
    	sNo.setBounds(450, 540, 100, 30);
    	sNo.setBackground(Color.WHITE);
    	add(sNo);
    	
    	ButtonGroup scgroup = new ButtonGroup();
    	scgroup.add(syes);
    	scgroup.add(sNo);
    	
    	JLabel pinc = new JLabel("Existing Account:");
    	pinc.setFont(new Font ("Osward",Font.BOLD,20));
    	pinc.setBounds(100, 590, 200, 30);
    	add(pinc);
    	
    	eyes = new JRadioButton("Yes");
    	eyes.setBounds(300, 590, 100, 30);
    	eyes.setBackground(Color.WHITE);
    	add(eyes);
    	
    	eNo = new JRadioButton("No");
    	eNo.setBounds(450, 590, 100, 30);
    	eNo.setBackground(Color.WHITE);
    	add(eNo);
    	
    	ButtonGroup exgroup = new ButtonGroup();
    	exgroup.add(eyes);
    	exgroup.add(eNo);
    	
    	 next = new JButton("NEXT");
    	next.setBackground(Color.BLACK);
    	next.setForeground(Color.WHITE);
    	next.setBounds(620, 660, 80, 30);
    	next.addActionListener(this);
    	add(next);
    	
    	
		getContentPane().setBackground(Color.white);
		
		setSize(850, 800);
		setLocation(350, 10);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		
		
		String sreligion = (String)religion1.getSelectedItem();
		String scategory = (String)category.getSelectedItem();
		String sincome = (String)income.getSelectedItem();
		String seducation = (String)education1.getSelectedItem();
		String soccupation = (String)occupation1.getSelectedItem();
		 String spanno = pannoTextField.getText();
		 String saadharno = aadharnoTextField.getText();
		
		 String sc= null;
		 if (syes.isSelected()) {
			 sc="yes";
		 }else if (sNo.isSelected()) {
			 sc="No";
		 }
		 String ex= null;
		 if (eyes.isSelected()) {
			 ex="yes";
		 }else if (eNo.isSelected()) {
			 ex="No";
		 }
		 
		   try {
		
				 Conn c = new Conn();
				String query = "insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+spanno+"','"+saadharno+"','"+sc+"','"+ex+"')";
			      c.s.executeUpdate(query);
		 
			       
			      setVisible(false);
			      new SignupThree(formno).setVisible(true);
		   
		   }catch(Exception e) {
			   System.out.println(e);
		   }
	}   
		   
		 
	
	
	
	  public static void main(String args[]) {
	    	new SignupTwo("");  
	    }


	
	}
	
	
	
	 


