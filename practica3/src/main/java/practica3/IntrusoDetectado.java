package practica3;

import java.util.Timer;
import java.util.TimerTask;

public class IntrusoDetectado extends AlarmaHogarState {
	
	private int intentos=0;
	protected Timer timer=new Timer();
	protected IntentosTask intentosTask;
	
	static final int NUMERO_MAXIMO_INTENTOS = 3;

	/*metodo que controla el intervalo de desactivación*/
	public void doAction( AlarmaHogar context )
	{
		intentosTask=new IntentosTask(context);
		timer.schedule(intentosTask, context.intervaloDesactivacion);
	}

	/*AlarmaOFF de la clase intrusoDetectado*/
	public void AlarmaOff(AlarmaHogar context) {
		if(intentos<NUMERO_MAXIMO_INTENTOS) {  //Solo deja 3 intentos
			
			//caso en el que mete bien el codigo
			if(context.codigoDesactivacion.equals(context.codigo)) {
				timer.cancel();
				context.setState(getEstadoApagada());
				context.getEstado().entryAction(context);
				intentos=0; //Reiniciamos el contador de intentos
				
				System.out.println("La alarma fue desactivada");
			}else {
				//caso en el que se falla al introducir el código
				int numeroIntentos= intentos +1;
				
				System.out.println("nº de intentos restantes :"+numeroIntentos+"/3");
				context.codigo=""; //se borra el codigo
			}

		}if(intentos>=NUMERO_MAXIMO_INTENTOS) {
			System.out.println("Maximo nº de intentos superado");
			context.codigo=""; //se borra el codigo
		}
		intentos++; //añadimos un intento
	}
	
	/*Timer de intentos*/
	public class IntentosTask extends TimerTask{
		private AlarmaHogar context;
		
		public IntentosTask(AlarmaHogar context) {
			this.context=context;
		}
		@Override
		public void run() {
			context.notificarCentralita();
			estadoCentralita.entryAction(context);
			context.setState(estadoCentralita);

			intentos=0; //Reiniciamos el contador de intentos
		}

	}

}
