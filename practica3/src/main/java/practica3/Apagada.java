package practica3;

public class Apagada extends AlarmaHogarState {

	public void entryAction(AlarmaHogar context) {
		context.getPiloto().apagar();
	}
	
	public void AlarmaOn(AlarmaHogar context) {
		context.getPiloto().parpadear();
		estadoEsperandoSalida.entryAction(context);
		context.setState(estadoEsperandoSalida);
	}
	
	public void desactivarSensores(AlarmaHogar context) {
		System.out.println("Usted a desactivado los sensores");
	}

}
