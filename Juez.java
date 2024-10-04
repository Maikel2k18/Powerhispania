package Power;
import java.util.Random;

public class Juez extends Persona{
	private boolean esAmable;
	private boolean esValido;
	private Random random = new Random();
	
	public Juez(int edad,String nombre,boolean a) {
		super(edad,nombre);
		this.esAmable = a;
	}
	public enum cartas {
		roja,
		blanca,
		azul
	}
	public cartas juzgar() {
		int i = 6;
		if(this.esAmable) 
			i = 10;
		int numeroAl = random.nextInt(i);
		if(numeroAl == 0) {
			System.out.println("el movimiento es nulo, la carta es " + cartas.roja + " , el juez es " + super.nombre);
			return cartas.roja;
		}else if (numeroAl == 1 ) {
			System.out.println("el movimiento es nulo por descenso, la carta es " + cartas.azul + " , el juez es "+ super.nombre);
			return cartas.azul;
		}else {
			System.out.println("el movimiento es valido, la carta es " + cartas.blanca + " , el juez es " + super.nombre);
			return cartas.blanca;
		}
	}
	@Override
	public String toString() {
		return "Juez edad=" + edad + ", nombre=" + nombre ;
	}
	
	
}
