package Power;

import java.util.ArrayList;
import java.util.List;

public class Competicion {
	private Participante ganador = null;
	private List<EquipoDeCompeticion> equipos = new ArrayList<>();
	private List<Juez> jueces = new ArrayList<>();
	
	public Competicion(List<EquipoDeCompeticion> equipos,List<Juez> jueces) {
		this.equipos = equipos;
		this.jueces = jueces;
	}
	public void mostrarJueces() {
		for(Juez j: jueces) {
			System.out.println(j);
		}
	}
	public void mostrarEquipos() {
		for(EquipoDeCompeticion ec: equipos) {
			System.out.println(ec);
		}
	}
	public void empezarCompeticion() {
		for(EquipoDeCompeticion ec: equipos) {
			for( Participante p: ec.getCompetidores()) {
				p.hacerSquat();
				Power.Juez.cartas resultado1 = jueces.get(0).juzgar();
				if(resultado1  == Power.Juez.cartas.blanca) {
					p.setValidoSquat(true); 
				}
				p.hacerPress();
				Power.Juez.cartas resultado2 = jueces.get(1).juzgar();
				if(resultado2  == Power.Juez.cartas.blanca) {
					p.setValidoBench(true); 
				}
				p.hacerMuerto();
				Power.Juez.cartas resultado3 = jueces.get(2).juzgar();
				if(resultado3  == Power.Juez.cartas.blanca) {
					p.setValidoMuerto(true); 
				}
				System.out.println("\n ");
			}
		}
	}
	public void ganador() {
		System.out.println("------------ Juzgando ------------ \n \n");
		int max = 0;
		Participante ganador = null;
		
		for(EquipoDeCompeticion ec: equipos) {
			for( Participante p: ec.getCompetidores()) {
				if(p.isValidoSquat() == true && p.isValidoBench() == true && p.isValidoMuerto() == true) {
					int total = p.getSquat() + p.getBench() + p.getMuerto();
					System.out.println(p.nombre + " ha hecho "+ total +" kgs totales ");
					if (total > max) {
						max = total;
						ganador = p;
					}
				}else {
					System.out.println(p.nombre + " te dan por el culo capullo ");
				}
				
			}
		}
		System.out.println("THE WINNER IS " + ganador + " con " + max + " kgs totales");
	}
}

