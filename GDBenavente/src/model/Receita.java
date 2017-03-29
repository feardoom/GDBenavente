package model;

public class Receita {
	private Socio socio;
	private String tipo; 
	private double valor;
	private String ref_mes;
	
	public Receita() {
		
	}

	public Receita(Socio socio, String tipo, double valor, String ref_mes) {
		super();
		this.socio = socio;
		this.tipo = tipo;
		this.valor = valor;
		this.ref_mes = ref_mes;
	}

	public Socio getSocio() {
		return socio;
	}

	public void setSocio(Socio socio) {
		this.socio = socio;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public String getRef_mes() {
		return ref_mes;
	}

	public void setRef_mes(String ref_mes) {
		this.ref_mes = ref_mes;
	}
	
	
		
}
