package practica3;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @(#) EsperandoSalida.java
 */

public class EsperandoSalida extends AlarmaHogarState
{
	protected Timer timer=new Timer();
	protected intervaloSalidaTask intervaloSalidaTask;

	public void entryAction( AlarmaHogar context )
	{
		intervaloSalidaTask= new intervaloSalidaTask(context);
		timer.schedule(intervaloSalidaTask, context.intervaloSalida);
	}

	public void AlarmaOff(AlarmaHogar context) {
		if(context.codigoDesactivacion.equals(context.codigo)) {
			intervaloSalidaTask.cancel();
			if(context.getPiloto().timer.isRunning()) {
				context.getPiloto().timer.stop();
			}
			estadoApagada.entryAction(context);
			estadoApagada.desactivarSensores(context);
			context.setState(estadoApagada);
			System.out.println("La alarma fue desactivada correctamente");
		}
		context.codigo=""; //reiniciamos el codigo
	}
	
	public void activarSensores(AlarmaHogar context) {
		System.out.println("Los sensores fueron activados");
	}


	public class intervaloSalidaTask extends TimerTask{
		private AlarmaHogar context;
		public intervaloSalidaTask(AlarmaHogar context) {
			this.context=context;
		}
		@Override
		public void run() {
			context.activarSensores();
			estadoActivado.entryAction(context);
			context.setState(estadoActivado);
			if(context.getPiloto().timer.isRunning()) {
				context.getPiloto().timer.stop();
			}
			context.getPiloto().encender();
		}
	}

}
