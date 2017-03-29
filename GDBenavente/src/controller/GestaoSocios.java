package controller;

import java.util.ArrayList;

import model.Socio;
import tools.easyIO;

public class GestaoSocios {
	private ArrayList<Socio> socios;
	private static easyIO io = new easyIO();
	
	public GestaoSocios() {
		socios = new ArrayList<Socio>();
	}
	
	public void listar() {
		for (Socio s:this.socios) {
			mostrar(s);
		}
	}
	
	public void mostrar(Socio s) {
		io.writeL("\nNome: " + s.getNome());
		io.writeL("Localidade: " + s.getLocalidade());
	}
}
