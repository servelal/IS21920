package practica3;

public class Activado extends AlarmaHogarState {

	public void entry( AlarmaHogar contexto )
	{
		contexto.getPiloto().encender();
	
	}
	public void Intruso(AlarmaHogar contexto) {
		estadoIntrusoDetectado.entryAction(contexto);  //No es necesario, ya que no tiene
		estadoIntrusoDetectado.doAction(contexto);
		contexto.setState(estadoIntrusoDetectado);
		System.out.println("Intruso Detectado");
	}
	
	
}
