package bank;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class transaction extends JFrame implements ActionListener{
	
	JButton deposit,withdrawal,fastcash,ministatement,pinc,balenq,exit;
	String pinnumber;
	public transaction(String pinnumber) {
		this.pinnumber=pinnumber;
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		Image i2 = i1.getImage().getScaledInstance(800, 800, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0,0,800,800);
		add(image);
		
		JLabel text = new JLabel("Plaese select your transaction");
		text.setBounds(180,250,700,35);
		text.setForeground(Color.WHITE);
		text.setFont(new Font("System",Font.BOLD,16));
		image.add(text);
		
		deposit = new JButton("Deposit");
		deposit.setBounds(130, 353, 130, 25);
		deposit.addActionListener(this);
		image.add(deposit);
		
		withdrawal = new JButton("Withdrawal");
		withdrawal.setBounds(323, 353, 130, 25);
		withdrawal.addActionListener(this);
		image.add(withdrawal);
		
		fastcash = new JButton("Fast Cash");
		fastcash.setBounds(130, 383, 130, 25);
		fastcash.addActionListener(this);
		image.add(fastcash);
		
		ministatement = new JButton("Ministatement");
		ministatement.setBounds(323, 383, 130, 25);
		ministatement.addActionListener(this);
		image.add(ministatement);
		
		pinc = new JButton("PIN change");
		pinc.setBounds(130, 413, 130, 25);
		pinc.addActionListener(this);
		image.add(pinc);
		
		balenq = new JButton("Balance enquiry");
		balenq.setBounds(323, 413, 130, 25);
		balenq.addActionListener(this);
		image.add(balenq);
		
		exit = new JButton("Exit");
		exit.setBounds(130, 443, 323, 25);
		exit.addActionListener(this);
		image.add(exit);
		
		
		setSize(800,800);
		setLocation(300,0);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new transaction("");
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if (ae.getSource()==exit) {
			System.exit(0);
		} else if (ae.getSource()==deposit) {
			setVisible(false);
			new deposit(pinnumber).setVisible(true);;
		} else if (ae.getSource()==withdrawal) {
			setVisible(false);
			new withdrawal(pinnumber).setVisible(true);;
		} else if (ae.getSource()==fastcash) {
			setVisible(false);
			new fastcash(pinnumber).setVisible(true);;
		} else if (ae.getSource()==pinc) {
			setVisible(false);
			new pinchange(pinnumber).setVisible(true);
		} else if (ae.getSource()==balenq) {
			setVisible(false);
			new balanceenquiry(pinnumber).setVisible(true);
		} else if (ae.getSource()==ministatement) {
//			setVisible(false);
			new ministatement(pinnumber).setVisible(true);
		}
	}

}
