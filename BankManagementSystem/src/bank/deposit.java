package bank;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class deposit extends JFrame implements ActionListener{
	JTextField amount;
	JButton deposit,back;
	String pinnumber;
	public deposit(String pinnumber) {
		// TODO Auto-generated constructor stub
		this.pinnumber=pinnumber;
		setLayout(null);
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0,0,900,900);
		add(image);
		
		JLabel text = new JLabel("Enter the emaount you want to deposit");
		text.setForeground(Color.WHITE);
		text.setFont(new Font("System",Font.BOLD,16));
		text.setBounds(170, 300, 400, 20);
		image.add(text);
		
		amount = new JTextField();
		amount.setFont(new Font("Raleway",Font.BOLD,22));
		amount.setBounds(170, 350, 320, 25);
		image.add(amount);
		
		deposit = new JButton("Deposit");
		deposit.setBounds(355, 485, 150, 30);
		deposit.addActionListener(this);
		image.add(deposit);
		
		back = new JButton("Back");
		back.setBounds(355, 520, 150, 30);
		back.addActionListener(this);
		image.add(back);
		
		setSize(900,900);
		setLocation(300,0);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new deposit("");
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if (ae.getSource()==deposit) {
			String number = amount.getText();
			Date date = new Date();
			if (number.equals("")) {
				JOptionPane.showMessageDialog(null,"Please enter the amount you want tp deposit");
			} else {
				
				try {
					Conn conn = new Conn();
					String query = "insert into bank values('"+pinnumber+"','"+date+"','Deposit','"+number+"')";
					conn.s.executeUpdate(query);
					JOptionPane.showMessageDialog(null, "Rs "+number+" Deposited Successfully");
					setVisible(false);
					new transaction(pinnumber).setVisible(true);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e);
				}
				
			}
		} else if (ae.getSource()==back) {
			setVisible(false);
			new transaction(pinnumber).setVisible(true);
		} 
	}

}
