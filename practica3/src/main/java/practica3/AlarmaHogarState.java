package practica3;

public abstract class AlarmaHogarState {
	
	/*Creación de estados*/
	
	protected static Centralita estadoCentralita = new Centralita();
	protected static IntrusoDetectado estadoIntrusoDetectado = new IntrusoDetectado();
	protected static Activado estadoActivado = new Activado();
	protected static Apagada estadoApagada = new Apagada();
	protected static EsperandoSalida estadoEsperandoSalida = new EsperandoSalida();

	/*Inicialización al primer estado*/
	public static AlarmaHogarState init(AlarmaHogar context) {
		estadoApagada.entryAction(context);
		return estadoApagada;
	}

	public void AlarmaOff(AlarmaHogar context) {};
	public void AlarmaOn(AlarmaHogar context) {};
	public void Intruso(AlarmaHogar context) {};
	public void Off(AlarmaHogar context) {};
	public void activarSensores( AlarmaHogar context ){};
	public void desactivarSensores( AlarmaHogar context ){};
	public void notificarSensores( AlarmaHogar context ){};
	public void doAction( AlarmaHogar context ){};
	public void entryAction( AlarmaHogar context ){};
	public void exitAction(AlarmaHogar context) {};
	
	/*Getters*/
	public static AlarmaHogarState getEstadoCentralitao() {
		return estadoCentralita;
	}
	public static AlarmaHogarState getEstadoIntrusoDetectado() {
		return estadoIntrusoDetectado;
	}
	public static AlarmaHogarState getEstadoActivado() {
		return estadoActivado;
	}
	public static AlarmaHogarState getEstadoApagada() {
		return estadoApagada;
	}
	public static AlarmaHogarState getEstadoEsperandoSalida() {
		return estadoEsperandoSalida;
	}

}
