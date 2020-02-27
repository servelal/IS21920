package pract3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.Font;

public class alarmaEventos {

	private JFrame frmSimuladorEventos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					alarmaEventos window = new alarmaEventos();
					window.frmSimuladorEventos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public alarmaEventos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSimuladorEventos = new JFrame();
		frmSimuladorEventos.setTitle("Simulador Eventos");
		frmSimuladorEventos.setBounds(100, 100, 450, 150);
		frmSimuladorEventos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frmSimuladorEventos.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton botonEventoOff = new JButton("Off");
		botonEventoOff.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		botonEventoOff.setFont(new Font("Tahoma", Font.PLAIN, 15));
		botonEventoOff.setBounds(58, 33, 129, 40);
		panel.add(botonEventoOff);
		
		JButton botonEventoIntruso = new JButton("Intruso");
		botonEventoIntruso.setFont(new Font("Tahoma", Font.PLAIN, 15));
		botonEventoIntruso.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		botonEventoIntruso.setBounds(235, 33, 129, 40);
		panel.add(botonEventoIntruso);
	}
}
