package pract3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;

public class alarmaInterfaz {

	private JFrame frmAlarma;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					alarmaInterfaz window = new alarmaInterfaz();
					window.frmAlarma.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public alarmaInterfaz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAlarma = new JFrame();
		frmAlarma.setTitle("Alarma");
		frmAlarma.setBounds(100, 100, 450, 300);
		frmAlarma.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frmAlarma.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton boton1 = new JButton("1");
		boton1.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		boton1.setForeground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		boton1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		boton1.setBounds(24, 60, 71, 36);
		panel.add(boton1);
		
		JButton boton2 = new JButton("2");
		boton2.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		boton2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		boton2.setBounds(107, 60, 71, 36);
		panel.add(boton2);
		
		JButton boton3 = new JButton("3");
		boton3.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		boton3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		boton3.setBounds(190, 60, 71, 36);
		panel.add(boton3);
		
		JButton boton4 = new JButton("4");
		boton4.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		boton4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		boton4.setBounds(24, 109, 71, 36);
		panel.add(boton4);
		
		JButton boton5 = new JButton("5");
		boton5.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		boton5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		boton5.setBounds(107, 109, 71, 36);
		panel.add(boton5);
		
		JButton boton6 = new JButton("6");
		boton6.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		boton6.setFont(new Font("Tahoma", Font.PLAIN, 25));
		boton6.setBounds(190, 109, 71, 36);
		panel.add(boton6);
		
		JButton boton7 = new JButton("7");
		boton7.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		boton7.setFont(new Font("Tahoma", Font.PLAIN, 25));
		boton7.setBounds(24, 158, 71, 36);
		panel.add(boton7);
		
		JButton boton8 = new JButton("8");
		boton8.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		boton8.setFont(new Font("Tahoma", Font.PLAIN, 25));
		boton8.setBounds(107, 158, 71, 36);
		panel.add(boton8);
		
		JButton boton9 = new JButton("9");
		boton9.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		boton9.setFont(new Font("Tahoma", Font.PLAIN, 25));
		boton9.setBounds(190, 158, 71, 36);
		panel.add(boton9);
		
		JButton botonOn = new JButton("Alarma On");
		botonOn.setForeground(new Color(0, 100, 0));
		botonOn.setBackground(UIManager.getColor("FormattedTextField.selectionBackground"));
		botonOn.setBounds(302, 109, 97, 25);
		panel.add(botonOn);
		
		JButton botonOff = new JButton("Alarma Off");
		botonOff.setForeground(Color.RED);
		botonOff.setBackground(UIManager.getColor("FormattedTextField.selectionBackground"));
		botonOff.setBounds(302, 158, 97, 25);
		panel.add(botonOff);
		
		JLabel imgPiloto = new JLabel("");
		imgPiloto.setIcon(new ImageIcon(alarmaInterfaz.class.getResource("/img/verde.JPG")));
		imgPiloto.setBounds(332, 60, 35, 25);
		
		panel.add(imgPiloto);
	}
}
