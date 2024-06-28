package bank;

import java.awt.Color;
import java.awt.Font;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.toedter.calendar.*;

import java.awt.event.*;

public class SignupOne extends JFrame implements ActionListener{
	Random ran = new Random();
	long random = Math.abs(ran.nextInt() % 9000L) + 1000L;
	JTextField nameTF,fnameTF,dobTF,emailTF,addTF,cityTF,stateTF,pinTF;
	JButton next;
	JRadioButton male,female,other,married,unmarried;
	JDateChooser datechooser;
	
	SignupOne(){
		
		setLayout(null);
		
//		Random ran = new Random();
//		long random = Math.abs(ran.nextInt() % 9000L) + 1000L;
		
		JLabel formno = new JLabel("APPLICATION FORM NO. "+random);
		formno.setFont(new Font("Raleway", Font.BOLD, 38));
		formno.setBounds(140,20,600,40);
		add(formno);
		
		JLabel personalDetails = new JLabel("Page 1 : Personal Details ");
		personalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
		personalDetails.setBounds(290,80,400,30);
		add(personalDetails);
		
		JLabel name = new JLabel("Name : ");
		name.setFont(new Font("Raleway", Font.BOLD, 20));
		name.setBounds(100,140,100,30);
		add(name);
		nameTF = new JTextField();
		nameTF.setFont(new Font("Raleway",Font.BOLD,14));
		nameTF.setBounds(300, 140, 400, 30);
		add(nameTF);
		
		JLabel fname = new JLabel("Father's Name : ");
		fname.setFont(new Font("Raleway", Font.BOLD, 20));
		fname.setBounds(100,190,200,30);
		add(fname);
		fnameTF = new JTextField();
		fnameTF.setFont(new Font("Raleway",Font.BOLD,14));
		fnameTF.setBounds(300, 190, 400, 30);
		add(fnameTF);
		
		JLabel dob = new JLabel("Date of birth : ");
		dob.setFont(new Font("Raleway", Font.BOLD, 20));
		dob.setBounds(100,240,200,30);
		add(dob);
		datechooser = new JDateChooser();
		datechooser.setBounds(300,240,400,30);
		datechooser.setForeground(new Color(105,105,105));
		add(datechooser);
		
		JLabel gender = new JLabel("Gender : ");
		gender.setFont(new Font("Raleway", Font.BOLD, 20));
		gender.setBounds(100,290,200,30);
		add(gender);
		male = new JRadioButton("Male");
		male.setBounds(300,290,60,30);
		male.setBackground(Color.white);
		add(male);
		female = new JRadioButton("Female");
		female.setBounds(450,290,120,30);
		female.setBackground(Color.white);
		add(female);
		ButtonGroup gendergr = new ButtonGroup();
		gendergr.add(male);
		gendergr.add(female);
		
		JLabel email = new JLabel("Email Address: ");
		email.setFont(new Font("Raleway", Font.BOLD, 20));
		email.setBounds(100,340,200,30);
		add(email);
		emailTF = new JTextField();
		emailTF.setFont(new Font("Raleway",Font.BOLD,14));
		emailTF.setBounds(300, 340, 400, 30);
		add(emailTF);
		
		JLabel ms = new JLabel("Marital Status : ");
		ms.setFont(new Font("Raleway", Font.BOLD, 20));
		ms.setBounds(100,390,200,30);
		add(ms);
		married = new JRadioButton("Married");
		married.setBounds(300,390,100,30);
		married.setBackground(Color.white);
		add(married);
		unmarried = new JRadioButton("Unmarried");
		unmarried.setBounds(450,390,100,30);
		unmarried.setBackground(Color.white);
		add(unmarried);
		other = new JRadioButton("Other");
		other.setBounds(630,390,100,30);
		other.setBackground(Color.white);
		add(other);
		ButtonGroup msGR = new ButtonGroup();
		msGR.add(married);
		msGR.add(unmarried);
		msGR.add(other);
		
		JLabel add = new JLabel("Address : ");
		add.setFont(new Font("Raleway", Font.BOLD, 20));
		add.setBounds(100,440,200,30);
		add(add);
		addTF = new JTextField();
		addTF.setFont(new Font("Raleway",Font.BOLD,14));
		addTF.setBounds(300, 440, 400, 30);
		add(addTF);
		
		JLabel city = new JLabel("City : ");
		city.setFont(new Font("Raleway", Font.BOLD, 20));
		city.setBounds(100,490,200,30);
		add(city);
		cityTF = new JTextField();
		cityTF.setFont(new Font("Raleway",Font.BOLD,14));
		cityTF.setBounds(300, 490, 400, 30);
		add(cityTF);
		
		JLabel state = new JLabel("State : ");
		state.setFont(new Font("Raleway", Font.BOLD, 20));
		state.setBounds(100,540,200,30);
		add(state);
		stateTF = new JTextField();
		stateTF.setFont(new Font("Raleway",Font.BOLD,14));
		stateTF.setBounds(300, 540, 400, 30);
		add(stateTF);
		
		JLabel pin = new JLabel("Pincode : ");
		pin.setFont(new Font("Raleway", Font.BOLD, 20));
		pin.setBounds(100,590,200,30);
		add(pin);
		pinTF = new JTextField();
		pinTF.setFont(new Font("Raleway",Font.BOLD,14));
		pinTF.setBounds(300, 590, 400, 30);
		add(pinTF);
		
		JButton next = new JButton("Next");
		next.setBackground(Color.BLACK);
		next.setForeground(Color.WHITE);
		next.setFont(new Font("Raleway",Font.BOLD,14));
		next.setBounds(620,660,80,30);
		next.addActionListener(this);
		add(next);
		
		getContentPane().setBackground(Color.WHITE);
		
		setSize(850,800);
		setLocation(350,10);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String formno = ""+random;
		String name = nameTF.getText();
		String fname = fnameTF.getText();
		String dob = ((JTextField)datechooser.getDateEditor().getUiComponent()).getText();
		String gender = null;
		if (male.isSelected()) {
			gender = "Male";
		} else if(female.isSelected()) {
			gender = "Female";
		}
		String email = emailTF.getText();
		String marital = null;
		if (married.isSelected()) {
			marital = "Married";
		} else if(unmarried.isSelected()){
			marital = "Unmarried";
		} else if (other.isSelected()) {
			marital = "other";
		}
		String address = addTF.getText();
		String city = cityTF.getText();
		String state = stateTF.getText();
		String pin = pinTF.getText();
		
		try {
			if (name.equals("")) {
				JOptionPane.showMessageDialog(null, "Name is required");
			}else if (fname.equals("")) {
				JOptionPane.showMessageDialog(null, "Father Name is required");
			}else if (dob.equals("")) {
				JOptionPane.showMessageDialog(null, "Date of Birth is required");
			}else if (name.equals("")) {
				JOptionPane.showMessageDialog(null, "Name is required");
			}else if (gender == null) {
				JOptionPane.showMessageDialog(null, "Gender is required");
			}else if (email.equals("")) {
				JOptionPane.showMessageDialog(null, "Email is required");
			}else if (marital == null) {
				JOptionPane.showMessageDialog(null, "Marital status is required");
			}else if (address.equals("")) {
				JOptionPane.showMessageDialog(null, "Address is required");
			}else if (city.equals("")) {
				JOptionPane.showMessageDialog(null, "City is required");
			}else if (state.equals("")) {
				JOptionPane.showMessageDialog(null, "State is required");
			}else if (pin.equals("")) {
				JOptionPane.showMessageDialog(null, "PIN is required");
			}
			else {
				Conn c = new Conn();
				String query = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+state+"','"+pin+"')";
				c.s.executeUpdate(query);
				
				setVisible(false);
				new Signuptwo(formno).setVisible(true);
			}
		} catch (Exception e2) {
			// TODO: handle exception
			System.out.println(e2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SignupOne();
	}

	

}
