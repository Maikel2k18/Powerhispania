package Power;

public class Persona {

	protected int edad;
	protected String nombre;
	
	
	public Persona(int e, String n) {
		this.edad = e;
		this.nombre = n;
	}
	public void saludar() {
		System.out.println("Hola, soy " + this.nombre);
	}
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	
}
