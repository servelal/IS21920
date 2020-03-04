package practica3;

public class Centralita extends AlarmaHogarState {
	
	public void entryAction( AlarmaHogar context ){
		notificarCentralita(context);
	}
	
	public void notificarCentralita(AlarmaHogar context) {
		System.out.println("Se ha notificado a la Centralita un posible intruso");
	}
	
	public void Off(AlarmaHogar context) {
		estadoApagada.entryAction(context);
		context.desactivarSensores();
		context.setState(estadoApagada);
	}
	
	public void desactivarSensores(AlarmaHogar context) {
		System.out.println("Sensores Desactivados.");
	}
}
