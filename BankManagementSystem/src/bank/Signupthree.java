package bank;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Signupthree extends JFrame implements ActionListener{
	JRadioButton r1,r2,r3,r4;
	JCheckBox c1,c2,c3,c4,c5,c6,c7;
	JButton submit,cancel;
	static String formno;
	Signupthree(String formno){
		this.formno=formno;
		setLayout(null);
		
		JLabel l1 = new JLabel("Page 3 : Account Details");
		l1.setFont(new Font("Raleway",Font.BOLD,22));
		l1.setBounds(280, 40, 400, 40);
		add(l1);
		
		JLabel type = new JLabel("Account type");
		type.setFont(new Font("Raleway",Font.BOLD,22));
		type.setBounds(100, 140, 200, 30);
		add(type);
		
		r1 = new JRadioButton("Saving Account");
		r1.setFont(new Font("Raleway",Font.BOLD,16));
		r1.setBackground(Color.WHITE);
		r1.setBounds(100, 180, 150, 20);
		add(r1);
		
		r2 = new JRadioButton("Fixed Deposit Account");
		r2.setFont(new Font("Raleway",Font.BOLD,16));
		r2.setBackground(Color.WHITE);
		r2.setBounds(350, 180, 250, 20);
		add(r2);
		
		r3 = new JRadioButton("Current Account");
		r3.setFont(new Font("Raleway",Font.BOLD,16));
		r3.setBackground(Color.WHITE);
		r3.setBounds(100, 220, 170, 20);
		add(r3);
		
		r4 = new JRadioButton("Recurring Deposit Account");
		r4.setFont(new Font("Raleway",Font.BOLD,16));
		r4.setBackground(Color.WHITE);
		r4.setBounds(350, 220, 250, 20);
		add(r4);
		
		ButtonGroup gr = new ButtonGroup();
		gr.add(r1);
		gr.add(r2);
		gr.add(r3);
		gr.add(r4);
		
		JLabel card = new JLabel("Card Number");
		card.setFont(new Font("Raleway",Font.BOLD,22));
		card.setBounds(100, 300, 200, 30);
		add(card);
		
		JLabel number = new JLabel("XXXX-XXXX-XXXX-4184");
		number.setFont(new Font("Raleway",Font.BOLD,22));
		number.setBounds(330, 300, 300, 30);
		add(number);
		
		JLabel carddemo = new JLabel("Your 16 digit card number  :");
		carddemo.setFont(new Font("Raleway",Font.BOLD,12));
		carddemo.setBounds(100, 330, 300, 20);
		add(carddemo);
		
		JLabel pin = new JLabel("PIN : ");
		pin.setFont(new Font("Raleway",Font.BOLD,22));
		pin.setBounds(100, 370, 200, 30);
		add(pin);
		
		JLabel pnum = new JLabel("XXXX");
		pnum.setFont(new Font("Raleway",Font.BOLD,22));
		pnum.setBounds(330, 370, 300, 30);
		add(pnum);
		
		JLabel pdemo = new JLabel("Your 4 digit password :");
		pdemo.setFont(new Font("Raleway",Font.BOLD,12));
		pdemo.setBounds(100, 400, 300, 20);
		add(pdemo);
		
		JLabel ser = new JLabel("Services Required");
		ser.setFont(new Font("Raleway",Font.BOLD,22));
		ser.setBounds(100, 450, 400, 20);
		add(ser);
		
		c1 = new JCheckBox("ATM Card");
		c1.setBackground(Color.WHITE);
		c1.setFont(new Font("Raleway",Font.BOLD,16));
		c1.setBounds(100, 500, 200, 30);
		add(c1);
		
		c2 = new JCheckBox("Internet Banking");
		c2.setBackground(Color.WHITE);
		c2.setFont(new Font("Raleway",Font.BOLD,16));
		c2.setBounds(350, 500, 200, 30);
		add(c2);
		
		c3 = new JCheckBox("Mobile Banking");
		c3.setBackground(Color.WHITE);
		c3.setFont(new Font("Raleway",Font.BOLD,16));
		c3.setBounds(100, 550, 200, 30);
		add(c3);
		
		c4 = new JCheckBox("Email and SMS Alerts");
		c4.setBackground(Color.WHITE);
		c4.setFont(new Font("Raleway",Font.BOLD,16));
		c4.setBounds(350, 550, 200, 30);
		add(c4);
		
		c5 = new JCheckBox("Cheque Book");
		c5.setBackground(Color.WHITE);
		c5.setFont(new Font("Raleway",Font.BOLD,16));
		c5.setBounds(100, 600, 200, 30);
		add(c5);
		
		c6 = new JCheckBox("E-statement");
		c6.setBackground(Color.WHITE);
		c6.setFont(new Font("Raleway",Font.BOLD,16));
		c6.setBounds(350, 600, 200, 30);
		add(c6);
		
		c7 = new JCheckBox("I hereby declare that the above entered details are correcct are best of my knowledge.");
		c7.setBackground(Color.WHITE);
		c7.setFont(new Font("Raleway",Font.BOLD,12));
		c7.setBounds(100, 680, 600, 30);
		add(c7);
		
		submit = new JButton("Submit");
		submit.setBackground(Color.BLACK);
		submit.setForeground(Color.WHITE);
		submit.setFont(new Font("Raleway",Font.BOLD,14));
		submit.setBounds(250, 720, 100, 30);
		submit.addActionListener(this);
		add(submit);
		
		cancel = new JButton("Cancel");
		cancel.setBackground(Color.BLACK);
		cancel.setForeground(Color.WHITE);
		cancel.setFont(new Font("Raleway",Font.BOLD,14));
		cancel.setBounds(420, 720, 100, 30);
		cancel.addActionListener(this);
		add(cancel);
		
		getContentPane().setBackground(Color.WHITE);
		
		setSize(850,820);
		setLocation(350,0);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Signupthree("");
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == submit) {
			String accountType1 = null;
			if (r1.isSelected()) {
				accountType1 = "Saving Account";
			} else if(r2.isSelected()){
				accountType1 = "Fixed Deposit Account";
			} else if (r3.isSelected()) {
				accountType1 = "Current Account";
			} else if(r4.isSelected()){
				accountType1 = "Recurring Deposit Account";
			} 
			
			Random random =  new Random();
			String cardnum = ""+Math.abs((random.nextLong()%90000000L)+2341021000000000L);
			String pinnum = ""+Math.abs((random.nextLong()%9000L)+1000L);
			
			String facility = "";
			if (c1.isSelected() ) {
				facility = facility + " ATM card ";
			} else if (c2.isSelected()) {
				facility = facility + " Internet Banking ";
			}else if (c3.isSelected()) {
				facility = facility + " Mobile Banking ";
			}else if (c4.isSelected()) {
				facility = facility + " Email and SMS alerts ";
			}else if (c5.isSelected()) {
				facility = facility + " Cheque Book ";
			}else if (c6.isSelected()) {
				facility = facility + " E-Statement ";
			}
			try {
				if (accountType1.equals("")) {
					JOptionPane.showMessageDialog(null, "Account type is required");
				} else {
					Conn conn = new Conn();
					String query1 = "insert into Signupthree values('"+formno+"','"+accountType1+"','"+cardnum+"','"+pinnum+"','"+facility+"')";
					String query2 = "insert into login values('"+formno+"','"+cardnum+"','"+pinnum+"')";
					
					conn.s.executeUpdate(query1);
					conn.s.executeUpdate(query2);
					
					JOptionPane.showMessageDialog(null, "Card Number: "+cardnum+"\nPIN : "+pinnum);
					
				}
				setVisible(false);
				new deposit(pinnum).setVisible(false);;
			} catch (Exception e) {
				System.out.println(e);
			}
			
		} else if (ae.getSource() == cancel) {
			setVisible(false);
			new Login().setVisible(true);
		}
		
	}

}
