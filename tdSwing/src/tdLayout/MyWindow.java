package tdLayout;

import java.awt.*;
import javax.swing.*;

public class MyWindow extends JFrame {
	
	private JTextField champText;
	private JButton bt1, bt2;
	private JTextArea champDoc;
	private JList<String> listeChoix;
	

	public MyWindow(){
		super("ma super fenetre");
		setSize(600, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		
		JPanel panelHaut = new JPanel();
		add(panelHaut, BorderLayout.NORTH);
		
		BoxLayout bl = new BoxLayout(panelHaut, BoxLayout.X_AXIS);
		panelHaut.setLayout(bl);
		champText = new JTextField(30);
		panelHaut.add(champText);
		bt1 = new JButton("ajouter");
		panelHaut.add(bt1);
		bt2 = new JButton("enlever");
		panelHaut.add(bt2);
		
		
		listeChoix = new JList<String>(new String[]{"lundi", "mardi", "mercredi", "jeudi"});
		add(new JScrollPane(listeChoix), BorderLayout.WEST);
		
		champDoc = new JTextArea();
		add(new JScrollPane(champDoc), BorderLayout.CENTER);
	}
	
	
	
}
