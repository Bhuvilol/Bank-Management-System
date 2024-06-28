package bank;

import java.util.Date;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class fastcash extends JFrame implements ActionListener{
	
	JButton deposit,withdrawal,fastcash,ministatement,pinc,balenq,exit;
	String pinnumber;
	public fastcash(String pinnumber) {
		this.pinnumber=pinnumber;
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		Image i2 = i1.getImage().getScaledInstance(800, 800, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0,0,800,800);
		add(image);
		
		JLabel text = new JLabel("Select withrawal amount");
		text.setBounds(145,250,700,35);
		text.setForeground(Color.WHITE);
		text.setFont(new Font("System",Font.BOLD,25));
		image.add(text);
		
		deposit = new JButton("RS-100");
		deposit.setBounds(130, 353, 130, 25);
		deposit.addActionListener(this);
		image.add(deposit);
		
		withdrawal = new JButton("Rs-500");
		withdrawal.setBounds(323, 353, 130, 25);
		withdrawal.addActionListener(this);
		image.add(withdrawal);
		
		fastcash = new JButton("Rs-1000");
		fastcash.setBounds(130, 383, 130, 25);
		fastcash.addActionListener(this);
		image.add(fastcash);
		
		ministatement = new JButton("Rs-2000");
		ministatement.setBounds(323, 383, 130, 25);
		ministatement.addActionListener(this);
		image.add(ministatement);
		
		pinc = new JButton("Rs-5000");
		pinc.setBounds(130, 413, 130, 25);
		pinc.addActionListener(this);
		image.add(pinc);
		
		balenq = new JButton("Rs-10000");
		balenq.setBounds(323, 413, 130, 25);
		balenq.addActionListener(this);
		image.add(balenq);
		
		exit = new JButton("Back");
		exit.setBounds(130, 443, 323, 25);
		exit.addActionListener(this);
		image.add(exit);
		
		
		setSize(800,800);
		setLocation(300,0);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new fastcash("");
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if (ae.getSource()==exit) {
			setVisible(false);
			new transaction(pinnumber).setVisible(true);
		} else {
			String amount = ((JButton)ae.getSource()).getText().substring(3);
			Conn c = new Conn();
			try {
				ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
				int balance = 0;
				while (rs.next()) {
					if (rs.getString("type").equals("Deposit")) {
						balance += Integer.parseInt(rs.getString("amount"));
					} else {
						balance -= Integer.parseInt(rs.getString("amount"));
					}
				}
				if (ae.getSource() != exit && balance < Integer.parseInt(amount)) {
					JOptionPane.showMessageDialog(null, "Insufficient Balance");
					return;
				}
				
				Date date = new Date();
				String query = "insert into bank values('"+pinnumber+"','"+date+"','Withdrawal','"+amount+"')";
				c.s.executeUpdate(query);
				JOptionPane.showMessageDialog(null, "Rs-"+amount+" debited successfully");
				
				setVisible(false);
				new transaction(pinnumber).setVisible(true);
				
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}

}
