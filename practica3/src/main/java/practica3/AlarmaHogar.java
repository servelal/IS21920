package practica3;

import javax.swing.JPanel;

public class AlarmaHogar {

	/*intentos realizados inicialmente = 0 los meto en las clases que lo utilicen*/
	//private int intentos=0;

	/*Constante del numero maximo de intentos*/
	static final int NUMERO_MAXIMO_INTENTOS = 3;

	public String codigoDesactivacion = "1234";
	public int intervaloSalida = 10000; /*SON MILISEGUNDOS*/
	public int intervaloDesactivacion = 10000; /*SON MILISEGUNDOS*/
	public String codigo;
	public JPanel luz;
	private AlarmaHogarState state;
	private Piloto piloto;


	//	public AlarmaHogar() {
	//		state = AlarmaHogarState.init(this);
	//	}

	public AlarmaHogar(JPanel luz) {

		this.luz = luz;
		
		setPiloto(new Piloto(this));

		codigo="";  //Inicializamos el codigo vacio

		state = AlarmaHogarState.init(this); //Initial state

	}

	public void setState(AlarmaHogarState value) {
		this.state = value;
	}

	/*Definición de las señales*/

	public void AlarmaOff() {
		state.AlarmaOff(this);
	}

	public void AlarmaOn() {
		state.AlarmaOn(this);
	}

	public void Intruso() {
		state.Intruso(this);
	}

	public void Off() {
		state.Off(this);
	}


	/*Definición de las acciones*/

	public void activarSensores() {
		state.activarSensores(this);
	}

	public void desactivarSensores() {
		state.desactivarSensores(this);
	}

	public void notificarCentralita() {
		state.notificarSensores(this);
	}

	public AlarmaHogarState getEstado() {
		return state;
	}

	public void anhadeDigito(String digito) {
		codigo= codigo + digito;
	}

	public Piloto getPiloto() {
		return piloto;
	}

	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}
}

