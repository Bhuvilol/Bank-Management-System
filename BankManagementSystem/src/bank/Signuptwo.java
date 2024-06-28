package bank;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

public class Signuptwo extends JFrame implements ActionListener{
	
	static String formno;
	JTextField panTF,adhaarTF;
	JButton next;
	JRadioButton y,n,ys,no;
	JComboBox religion,category,income,eq,occupation;
//	String formno;
	
	Signuptwo(String formno){
		this.formno = formno;
		setLayout(null);
		setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2" );
		
		JLabel additionaldetails = new JLabel("Page 2 : Additional Details");
		additionaldetails.setFont(new Font("Raleway", Font.BOLD, 22));
		additionaldetails.setBounds(290,80,400,30);
		add(additionaldetails);
		
		JLabel rel = new JLabel("Religion : ");
		rel.setFont(new Font("Raleway", Font.BOLD, 20));
		rel.setBounds(100,140,100,30);
		add(rel);
		String valRel[] = {"Hindu","Muslim","Sikh","Christian","Other"};
		religion = new JComboBox(valRel);
		religion.setBounds(300, 140, 400, 30);
		religion.setBackground(Color.WHITE);
		add(religion);

		JLabel cat = new JLabel("Category : ");
		cat.setFont(new Font("Raleway", Font.BOLD, 20));
		cat.setBounds(100,190,200,30);
		add(cat);
		String valCat[] = {"UR","OBC","SC","ST","Other"};
		category = new JComboBox(valCat);
		category.setBounds(300, 190, 400, 30);
		category.setBackground(Color.WHITE);
		add(category);
		
		JLabel in = new JLabel("Income : ");
		in.setFont(new Font("Raleway", Font.BOLD, 20));
		in.setBounds(100,240,200,30);
		add(in);
		String valIn[] = {"Null","< 1 Lakh","< 3 Lakh","< 6 Lakh","upto 10 Lakh","> 10 Lakh"};
		income = new JComboBox(valIn);
		income.setBounds(300,240,400,30);
		income.setBackground(Color.WHITE);
		add(income);
		
		JLabel ed = new JLabel("Educational ");
		ed.setFont(new Font("Raleway", Font.BOLD, 20));
		ed.setBounds(100,290,200,30);
		add(ed);
		JLabel qua = new JLabel("Qualification : ");
		qua.setFont(new Font("Raleway", Font.BOLD, 20));
		qua.setBounds(100,315,200,30);
		add(qua);
		String valEQ[] = {"Non-Graduate","Graduate","Post Graduate","Doctrate","Others"};
		eq = new JComboBox(valEQ);
		eq.setBounds(300,310,400,30);
		eq.setBackground(Color.WHITE);
		add(eq);
		
		JLabel oc = new JLabel("Occupation : ");
		oc.setFont(new Font("Raleway", Font.BOLD, 20));
		oc.setBounds(100,390,200,30);
		add(oc);
		String valOc[] = {"Salaried","Self Employed","Business man","Student","Retired"};
		occupation = new JComboBox(valOc);
		occupation.setBounds(300,390,400,30);
		occupation.setBackground(Color.WHITE);
		add(occupation);
		
		JLabel pan = new JLabel("PAN : ");
		pan.setFont(new Font("Raleway", Font.BOLD, 20));
		pan.setBounds(100,490,200,30);
		add(pan);
		panTF = new JTextField();
		panTF.setFont(new Font("Raleway",Font.BOLD,14));
		panTF.setBounds(300, 490, 400, 30);
		add(panTF);
		
		JLabel adhaar = new JLabel("Adhaar Card No. : ");
		adhaar.setFont(new Font("Raleway", Font.BOLD, 20));
		adhaar.setBounds(100,540,200,30);
		add(adhaar);
		adhaarTF = new JTextField();
		adhaarTF.setFont(new Font("Raleway",Font.BOLD,14));
		adhaarTF.setBounds(300, 540, 400, 30);
		add(adhaarTF);
		
		JLabel sc = new JLabel("Are you a Senior citizen? ");
		sc.setFont(new Font("Raleway", Font.BOLD, 20));
		sc.setBounds(100,590,600,30);
		add(sc);
		y = new JRadioButton("Yes");
		y.setBounds(400,590,60,30);
		y.setBackground(Color.white);
		add(y);
		n = new JRadioButton("No");
		n.setBounds(500,590,120,30);
		n.setBackground(Color.white);
		add(n);
		ButtonGroup snrcit = new ButtonGroup();
		snrcit.add(y);
		snrcit.add(n);
		
		JLabel exist = new JLabel("Are you a existing user? ");
		exist.setFont(new Font("Raleway", Font.BOLD, 20));
		exist.setBounds(100,640,600,30);
		add(exist);
		ys = new JRadioButton("Yes");
		ys.setBounds(400,640,60,30);
		ys.setBackground(Color.white);
		add(ys);
		no = new JRadioButton("No");
		no.setBounds(500,640,120,30);
		no.setBackground(Color.white);
		add(no);
		ButtonGroup eu = new ButtonGroup();
		eu.add(ys);
		eu.add(no);
		
		JButton next = new JButton("Next");
		next.setBackground(Color.BLACK);
		next.setForeground(Color.WHITE);
		next.setFont(new Font("Raleway",Font.BOLD,14));
		next.setBounds(620,690,80,30);
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
		String formno = Signuptwo.formno;
		String rel = (String)religion.getSelectedItem();
		String cat = (String)category.getSelectedItem();
		String in = (String)income.getSelectedItem();
		String equal = (String)eq.getSelectedItem(); 
		String occ = (String)occupation.getSelectedItem();
		String panno = panTF.getText();
		String ad = adhaarTF.getText();
		String snrctr = null;
		if (y.isSelected()) {
			snrctr = "Yes";
		} else if(n.isSelected()){
			snrctr = "No";
		} 
		String exist = null;
		if (ys.isSelected()) {
			exist = "Yes";
		} else if(no.isSelected()){
			exist = "No";
		} 
		try {
			if (snrctr==null) {
				JOptionPane.showMessageDialog(null, "Please choose any one option");
			}else if (exist==null) {
				JOptionPane.showMessageDialog(null, "Please choose any one option");
			}
			else {
				Conn c = new Conn();
				String query = "insert into signuptwo values('"+formno+"','"+rel+"','"+cat+"','"+in+"','"+equal+"','"+occ+"','"+panno+"','"+ad+"','"+snrctr+"','"+exist+"')";
				c.s.executeUpdate(query);
				
				setVisible(false);
				new Signupthree(formno).setVisible(true);
				
			}
		} catch (Exception e2) {
			// TODO: handle exception
			System.out.println(e2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Signuptwo("");
	}

	

}
