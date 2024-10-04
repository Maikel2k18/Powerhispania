package Power;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		Participante p1 = new Participante(21,"juan",93);
		Participante p2 = new Participante(22,"jaume",83);
		Participante p3 = new Participante(23,"antonio",74);
		Participante p4 = new Participante(10,"jose",93);
		Participante p5 = new Participante(12,"federico",83);
		Participante p6 = new Participante(8,"picasso",74);
		
		List<Participante> competidoresPower = new ArrayList<>();
		competidoresPower.add(p1);
		competidoresPower.add(p2);
		competidoresPower.add(p3);
		List<Participante> competidoresPower2 = new ArrayList<>();
		competidoresPower2.add(p4);
		competidoresPower2.add(p5);
		competidoresPower2.add(p6);
		
		EquipoDeCompeticion malagaPower = new EquipoDeCompeticion(competidoresPower, "malagaPower","malaga","españa");
		malagaPower.mostrarEquipo();
		EquipoDeCompeticion madridPower = new EquipoDeCompeticion(competidoresPower2, "madridPower","madrid","españa");
		madridPower.mostrarEquipo();
		
		List<EquipoDeCompeticion> listaEquipos = new ArrayList<>();
		listaEquipos.add(malagaPower);
		listaEquipos.add(madridPower);
		
		Juez juez1 = new Juez(34,"fernanado",true);
		Juez juez2 = new Juez(45,"javi",true);
		Juez juez3 = new Juez(50,"rakelaton",false);
		
		List<Juez> listaJueces = new ArrayList<>();
		listaJueces.add(juez1);
		listaJueces.add(juez2);
		listaJueces.add(juez3);
		
		Competicion campeonatoDeEspaña = new Competicion(listaEquipos,listaJueces);
		campeonatoDeEspaña.mostrarJueces();
		campeonatoDeEspaña.mostrarEquipos();
		campeonatoDeEspaña.empezarCompeticion();
		campeonatoDeEspaña.ganador();
	}

}
