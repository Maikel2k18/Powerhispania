package Power;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EquipoDeCompeticion {
	Scanner scanner = new Scanner(System.in);
	private List<Participante> competidores = new ArrayList<>();
	private String ciudad;
	private String pais;
	private String nombreEquipo;
	
	public EquipoDeCompeticion(List<Participante> competidores,String nombreE,String Ciudad,String Pais) {
		this.competidores = competidores;
		this.ciudad=Ciudad;
		this.pais=Pais;
		this.nombreEquipo = nombreE;
	}

	@Override
	public String toString() {
		return "EquipoDeCompeticion es :"  + this.nombreEquipo + " de " + this.ciudad + " de " + this.pais ;
	}
	public void mostrarEquipo() {
		for(Participante p : competidores) {
			System.out.println(p);
		}
	}

	public List<Participante> getCompetidores() {
		return competidores;
	}
	
	
}
