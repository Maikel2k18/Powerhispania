package Power;

import java.util.Random;

public class Participante extends Persona {
	private Random random = new Random();
	private int peso;
	private int bench; 
	private int squat;
	private int muerto;
	private boolean validoBench = false;
	private boolean validoSquat = false;
	private boolean validoMuerto = false;
	public boolean isValidoBench() {
		return validoBench;
	}
	public boolean isValidoSquat() {
		return validoSquat;
	}
	public int getBench() {
		return bench;
	}
	public int getSquat() {
		return squat;
	}
	public int getMuerto() {
		return muerto;
	}
	public boolean isValidoMuerto() {
		return validoMuerto;
	}
	public Participante(int edad,String nombre, int peso) {
		super(edad,nombre);
		this.peso = peso;
	}
	public void setValidoBench(boolean validoBench) {
		this.validoBench = validoBench;
	}
	public void setValidoSquat(boolean validoSquat) {
		this.validoSquat = validoSquat;
	}
	public void setValidoMuerto(boolean validoMuerto) {
		this.validoMuerto = validoMuerto;
	}
	public void hacerSquat() {
		this.squat = random.nextInt(200);
		System.out.println("participante :  " + nombre + "\n peso : "+ this.squat + "  en sentadilla ");
	}
	public void hacerPress() {
		this.bench = random.nextInt(200);
		System.out.println("participante " + nombre + " \n peso : "+ this.bench + "  en banca ");
	}
	public void hacerMuerto() {
		this.muerto = random.nextInt(200);
		System.out.println("participante " + nombre + " \n peso : "+ this.muerto + "  en muerto");
	}
	public void Saludar() {
		System.out.println("Hola soy "+ super.nombre + "y voy a ganar");
	}
	@Override
	public String toString() {
		return " El participante "+ super.nombre + " Pesa " + peso + " y tiene " + super.edad + "años \n"  ;
	}
	
	
}
