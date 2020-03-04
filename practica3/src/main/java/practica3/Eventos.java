package practica3;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class Eventos extends JFrame{
	private AlarmaHogar alarma;
	
	public Eventos(AlarmaHogar a) {
		super();
		setTitle("generador de eventos");
		alarma=a;
		initialize();
	
	}
	
	public void initialize() {
		getContentPane().setLayout(null);
		JButton bOff = new JButton("Off");
		bOff.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				alarma.Off();
			}
		});
		bOff.setBounds(34, 42, 116, 45);
		getContentPane().add(bOff);
		
		JButton bIntruso = new JButton("Intruso");
		bIntruso.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				alarma.Intruso();
			}
		});
		bIntruso.setBounds(262, 42, 135, 45);
		getContentPane().add(bIntruso);
		
		JLabel lblGenerarIntruso = new JLabel("Generar intruso:");
		lblGenerarIntruso.setBounds(262, 17, 103, 14);
		getContentPane().add(lblGenerarIntruso);
		
		JLabel lblCentralita = new JLabel("Centralita:");
		lblCentralita.setBounds(34, 17, 83, 14);
		getContentPane().add(lblCentralita);
	}
}

