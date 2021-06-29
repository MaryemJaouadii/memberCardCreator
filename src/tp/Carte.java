package tp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.RootPaneContainer;

public class Carte extends JFrame{
	


	private JLabel tnom;
	private JLabel tpos;
	private JLabel temail;
	private JLabel ttel;



	public Carte(String nomp, String pos, String email, String tel) {
		this.setSize(new Dimension(500,300));
		this.getContentPane().setBackground(new Color(0xFFf4f1de));
		//this.setLayout(new BorderLayout());
		
		
	
		JLabel club = new JLabel("Cyber Trace IssatSo");
		club.setFont(new Font("OpenSans", Font.BOLD, 15));
		club.setForeground(new Color(0xFF81b29a));
		this.add(club,BorderLayout.NORTH);
		
		
		
		JPanel composants = new JPanel();
		composants.setLayout(new GridLayout(4,1));
		composants.setOpaque(true);
		composants.setBackground(new Color(0xFFf4f1de));
		this.add(composants,BorderLayout.CENTER);
		
		tnom=new JLabel();
		tnom.setText(nomp);
		tnom.setFont(new Font("Pacifico", Font.BOLD, 40));
		tnom.setForeground(new Color(0xFF3d405b));
		tnom.setHorizontalAlignment(JLabel.CENTER);
		
		
		tpos= new JLabel();
		tpos.setText(pos);
		tpos.setHorizontalAlignment(JLabel.CENTER);
		tpos.setFont(new Font("OpenSans", Font.BOLD, 20));
		tpos.setForeground(new Color(0xFFe07a5f));
		tpos.setHorizontalAlignment(JLabel.CENTER);
		
		
		
		temail= new JLabel();
		temail.setText(email);
		temail.setFont(new Font("OpenSans", Font.BOLD, 15));
		temail.setForeground(new Color(0xFF3d405b));
		ImageIcon icone_email= new ImageIcon("email.png");
		temail.setIcon(icone_email);
		
		
		ttel=new JLabel();
		ttel.setText(tel);
		ttel.setFont(new Font("OpenSans", Font.BOLD, 15));
		ttel.setForeground(new Color(0xFF3d405b));
		ImageIcon icone_phone= new ImageIcon("phone.png");
		ttel.setIcon(icone_phone);
		composants.add(tnom);
		composants.add(tpos);
		composants.add(temail);
		composants.add(ttel);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		this.setVisible(true);
		
	}
	
	
	
public static void main(String[] args) {
	//new Carte("Maryem Jaouadi","Marekting Committee","mariamjaouadi271@gmail.com","56144700");
}
}
