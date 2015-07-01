package principal;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MaFenetre extends JFrame implements ActionListener, DocumentListener{
	
	public static final String LOAD_COMMAND = "load";
	public static final String SAVE_COMMAND = "save";

	private JButton btLoad, btSave;
	private JTextField jtf;
	private JTextArea jta;
	private DefaultListModel<String> listeData;
	
	public MaFenetre() {
		super("ma fenetre document");
		setSize(600, 500);
		
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel panelHaut = new JPanel();
		add(panelHaut, BorderLayout.NORTH);
		
		BoxLayout bl = new BoxLayout(panelHaut, BoxLayout.X_AXIS);
		panelHaut.setLayout(bl);
		jtf = new JTextField(30);
		panelHaut.add(jtf);
		
		btLoad = new JButton("Load");
		panelHaut.add(btLoad);
		btLoad.setActionCommand(LOAD_COMMAND);
		btLoad.addActionListener(this);
		
		btSave = new JButton("Save");
		panelHaut.add(btSave);
		btSave.setActionCommand(SAVE_COMMAND);
		btSave.addActionListener(this);
		
		jta = new JTextArea();
		add(jta, BorderLayout.CENTER);

	}

	@Override
	public void changedUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case LOAD_COMMAND:
			String path = null;
			// charger le fichier
			File f = new File(path);
			if (f.exists() && f.isFile()) 
			{

				Scanner reader = null;
				try {
					reader = new Scanner(f);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				while (reader.hasNext()) {
					System.out.println(reader.nextLine());
				}
				reader.close();
			}
			else
			{
				//f.createNewFile();
				PrintWriter writer = null;
				try {
					writer = new PrintWriter(f);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				writer.println("bonjour depuis java");
				writer.close();
				
			}
			break;
		case SAVE_COMMAND:
			// sauvegarder le fichier
			break;
		}	
	}
	

}
