package principal;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class maPremiereFenetre extends JFrame implements ActionListener {
	
	private JTextField champtexte;
	private JButton bouton1;
	private JLabel label1;

	public maPremiereFenetre(){
		super("ma deuxieme");
		// on peux ne pas mettre this c est implicite
		this.setLayout(new FlowLayout());
		
		setSize(400, 300);
		setLocationRelativeTo(null);
		
		champtexte = new JTextField(30);
		add(champtexte);
		
		bouton1 = new JButton("clique");
		add(bouton1);
		
		label1 = new JLabel("rien ...");
		add(label1);
		
		JButton bouton2 = new JButton("clique 2");
		add(bouton2);
		
		bouton1.addActionListener(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		String text = champtexte.getText();
		label1.setText(text);
	}

}
