package principal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Program {
	
	public static void main(String[] args) {
		JFrame fen1 = new JFrame("ma premiere fenetre");
		fen1.setLocationRelativeTo(null);
		fen1.setSize(400, 200);
		fen1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton bouton = new JButton("clicker moi!");
		
		fen1.add(bouton);
		
		bouton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "merci pour le click");				
			}
		});
		
		fen1.setVisible(false);
		
		maPremiereFenetre fen2 = new maPremiereFenetre();
		fen2.setVisible(true);
	}
}
