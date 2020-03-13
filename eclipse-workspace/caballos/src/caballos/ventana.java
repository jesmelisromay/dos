package caballos;

import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ventana extends JFrame {

	JLabel lblMeta;
	
	public ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(497, 365));
		getContentPane().setLayout(null);
		
		JLabel lblCaballo1 = new JLabel("Caballo1");
		lblCaballo1.setBounds(30, 60, 67, 14);
		getContentPane().add(lblCaballo1);
		
		JLabel lblCaballo2 = new JLabel("Caballo2 ");
		lblCaballo2.setBounds(30, 135, 77, 14);
		getContentPane().add(lblCaballo2);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				Point ahora = lblCaballo1.getLocation(); //seleciono la posicion de ahora 
				Point ahora2 = lblCaballo2.getLocation();
				
				int y = (int) Math.floor((Math.random() *20 ));
				int y2 = (int) Math.floor((Math.random() *20 ));
				
				Point despues= new Point(ahora.x + y, ahora.y);
				
				Point despues2= new Point(ahora2.x + y2, ahora2.y); //hago una nuevo objecto point le coloco la posicion de ahora + algo 
				
				lblCaballo1.setLocation(despues); //le a�ado a lbl el moviminto 
				lblCaballo2.setLocation(despues2);
				
				Point ganador =lblMeta.getLocation();
				Point gana = new Point(ganador.x, ganador.y);
				
				if (gana.x <= despues2.x ) {
					System.out.println("el ganador es caballo 2");
					lblCaballo1.setLocation(ahora);
				}
				if( gana.x <= despues.x ) {
					System.out.println("el ganador es caballo 1");
					lblCaballo2.setLocation(ahora2);
				}
				
			}
		});
		btnNewButton.setBounds(224, 225, 89, 23);
		getContentPane().add(btnNewButton);
		
		 lblMeta = new JLabel("meta");
		lblMeta.setBackground(Color.RED);
		lblMeta.setOpaque(true);
		lblMeta.setBounds(361, 40, 46, 155);
		getContentPane().add(lblMeta);
		
		
			
		
	}
}
