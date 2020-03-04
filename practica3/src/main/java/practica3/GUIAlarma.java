package practica3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class GUIAlarma extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2710360868562705828L;
	private JPanel contentPane;
	public JButton AlarmaOn;
	public JButton AlarmaOff;

	public JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;
	public Eventos generador;
	public JPanel luz;
	
	public AlarmaHogar alarma;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIAlarma frame = new GUIAlarma();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUIAlarma() {
		setTitle("SECURITAS DIRECT");
		setBackground(Color.RED);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 539, 340);
		contentPane = new JPanel();
////		contentPane.setBackground(Color.WHITE);
////		contentPane.setForeground(Color.RED);
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		/*Botones de las alarmas*/
		AlarmaOn = new JButton("Alarma On");
		AlarmaOn.setForeground(new Color(34, 139, 34));
		AlarmaOn.addActionListener(this);
		AlarmaOn.setBounds(311, 121, 153, 41);
		contentPane.add(AlarmaOn);

		AlarmaOff = new JButton("Alarma Off");
		AlarmaOff.setForeground(new Color(255, 0, 0));
		AlarmaOff.addActionListener(this);
		AlarmaOff.setBounds(311, 175, 153, 41);
		contentPane.add(AlarmaOff);
		
		
		/*Botones de los digitos*/
		b1 = new JButton("1");
		b1.setBackground(UIManager.getColor("InternalFrame.inactiveTitleGradient"));
		b1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b1.addActionListener(this);
		b1.setBounds(22, 59, 73, 41);
		contentPane.add(b1);
		
		b2 = new JButton("2");
		b2.setBackground(UIManager.getColor("InternalFrame.inactiveTitleGradient"));
		b2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b2.addActionListener(this);
		b2.setBounds(115, 59, 75, 41);
		contentPane.add(b2);

		b3 = new JButton("3");
		b3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b3.setBackground(UIManager.getColor("InternalFrame.inactiveTitleGradient"));
		b3.addActionListener(this);
		b3.setBounds(202, 59, 73, 41);
		contentPane.add(b3);

		b4 = new JButton("4");
		b4.setBackground(UIManager.getColor("InternalFrame.inactiveTitleGradient"));
		b4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b4.addActionListener(this);
		b4.setBounds(22, 119, 73, 41);
		contentPane.add(b4);

		b5 = new JButton("5");
		b5.setBackground(UIManager.getColor("InternalFrame.inactiveTitleGradient"));
		b5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b5.addActionListener(this);
		b5.setBounds(115, 119, 73, 41);
		contentPane.add(b5);

		b6 = new JButton("6");
		b6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b6.setBackground(UIManager.getColor("InternalFrame.inactiveTitleGradient"));
		b6.addActionListener(this);
		b6.setBounds(202, 119, 73, 41);
		contentPane.add(b6);

		b7 = new JButton("7");
		b7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b7.setBackground(UIManager.getColor("InternalFrame.inactiveTitleGradient"));
		b7.addActionListener(this);
		b7.setBounds(22, 175, 73, 41);
		contentPane.add(b7);

		b8 = new JButton("8");
		b8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b8.setBackground(UIManager.getColor("InternalFrame.inactiveTitleGradient"));
		b8.addActionListener(this);
		b8.setBounds(115, 175, 73, 41);
		contentPane.add(b8);

		b9 = new JButton("9");
		b9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b9.setBackground(UIManager.getColor("InternalFrame.inactiveTitleGradient"));
		b9.addActionListener(this);
		b9.setBounds(202, 175, 73, 41);
		contentPane.add(b9);
		
		luz = new JPanel();
		luz.setBackground(Color.GREEN);
		luz.setVisible(false);
		luz.setBounds(360, 59, 50, 50);
		contentPane.add(luz);
		
		alarma=new AlarmaHogar(luz);

		generador=new Eventos(this.alarma);
		generador.setSize(new Dimension(450,160));
		generador.setVisible(true);
	}
	
	@SuppressWarnings("static-access")
	public void actionPerformed(ActionEvent e) {  
		
		String codigo=alarma.codigo;
		
		int longitud=alarma.codigoDesactivacion.length(); 

		if(e.getSource()==AlarmaOn) {
			alarma.AlarmaOn();
		}else if(e.getSource()==AlarmaOff) {
			alarma.AlarmaOff();

		}else if(alarma.getEstado().equals(alarma.getEstado().getEstadoEsperandoSalida()) 
				|| (alarma.getEstado().equals(alarma.getEstado().getEstadoIntrusoDetectado()))){    //Que solo introduzca en el codigo cuando se encuentre en cualqueira de esos dos estados
			if(codigo.length()<longitud) {

				if(e.getSource()==b1) {
					alarma.anhadeDigito("1");
				}
				if(e.getSource()==b2) {
					alarma.anhadeDigito("2");
				}
				if(e.getSource()==b3) {
					alarma.anhadeDigito("3");
				}
				if(e.getSource()==b4) {
					alarma.anhadeDigito("4");
				}
				if(e.getSource()==b5) {
					alarma.anhadeDigito("5");
				}
				if(e.getSource()==b6) {
					alarma.anhadeDigito("6");
				}
				if(e.getSource()==b7) {
					alarma.anhadeDigito("7");
				}
				if(e.getSource()==b8) {
					alarma.anhadeDigito("8");
				}
				if(e.getSource()==b9) {
					alarma.anhadeDigito("9");
				}
			}else {
				System.out.println("Nº maximo de caracteres");
			}
		}

	}
}
