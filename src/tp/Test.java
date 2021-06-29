package tp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Test extends JFrame {
	
	private JTextField tnomp;
	
	private JTextField temail;
	private JTextField ttel;
	private JButton valider;
	private PersonneModel model;
	private ComboBoxModel<String> positions;
	private JComboBox<String> cpos;










	public Test () {
		PersonneManager pm =new PersonneManager();
		model= new PersonneModel();
		
		
		
		
		this.setSize(new Dimension(550,300));
		this.setLayout(new BorderLayout());
		JLabel msg= new JLabel("Bienvenue cher membre, veuillez saisir vos coordonnées pour avoir votre carte membre");
		msg.setForeground(new Color(0xFF3d405b));
		this.add(msg,BorderLayout.NORTH);
		this.getContentPane().setBackground(new Color(0xFFf4f1de));
		
		
		
		JPanel champs = new JPanel();
		champs.setLayout(new GridLayout(4,2));
		JLabel lnomp= new JLabel("Nom et Prénom");
		lnomp.setForeground(new Color(0xFFe07a5f));
		tnomp=new JTextField(30);
		JLabel lpos= new JLabel("Position");
		lpos.setForeground(new Color(0xFFe07a5f));
		
		String [] positions = new String[] {"President","Vice President","Treasurer","Marketing Committee","Marketing Committee Team Leader","Organization Committee Team Leader","Technical Committee Team Leader","HR Committee Team Leader","Reporting Committee Team Leader","Marketing Committee","Organization Committee","Technical Committee","HR Committee","Reporting Committee"};
		cpos = new JComboBox<String>(positions);
		
		
		JLabel lemail= new JLabel("Email");
		lemail.setForeground(new Color(0xFFe07a5f));
		temail=new JTextField(30);
		JLabel ltel= new JLabel("Telephone");
		ltel.setForeground(new Color(0xFFe07a5f));
		ttel=new JTextField(30);
		
		champs.add(lnomp);
		champs.add(tnomp);
		champs.add(lpos);
		champs.add(cpos);
		champs.add(lemail);
		champs.add(temail);
		champs.add(ltel);
		champs.add(ttel);
		
		this.add(champs,BorderLayout.CENTER);
		champs.setBackground(new Color(0xFFf4f1de));
		
		valider=new JButton("Valider");
		this.add(valider,BorderLayout.SOUTH);
		valider.setBackground(new Color(0xFF81b29a));
		
		this.setVisible(true);
		
		
	valider.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String nomp=tnomp.getText();
				String pos=cpos.getSelectedItem().toString();
				String email=temail.getText();
				String tel=ttel.getText();
				model.ajouter(nomp,pos,email,tel);
				new Carte(nomp,pos,email,tel);
				
		
			}
		});
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		new Test();
	
	}

}
