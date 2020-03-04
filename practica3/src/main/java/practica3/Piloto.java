package practica3;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Piloto {
	
	private JPanel luz;
	public Timer timer;
	
	/*Constructor de la clase Piloto*/
	public Piloto(AlarmaHogar context) {
		this.luz=context.luz;
		timer=new Timer(500,new Parpadeo(luz));  //parpadea cada 0.5 segundos
	}
	
	public void encender() {
		timer.stop();
		luz.setVisible(true); //la luz se enciende
		luz.setBackground(Color.GREEN); //la cambiamos a verde
	}
	
	public void apagar() {
		timer.stop();
		luz.setVisible(false); //la luz sale apagada
	}
	
	public void parpadear() {
		timer.start();
	}

	public class Parpadeo implements ActionListener{
		
		private JPanel luz;

		public Parpadeo(JPanel luz) {
			this.luz=luz;
		}
		
		/*
		 * si la luz esta activada se desactica y viceversa 
		 */
		public void actionPerformed(ActionEvent e) {
			if(luz.isVisible()) {
				luz.setVisible(false);
			}else {
				luz.setVisible(true);
			}

		}

	}

}
