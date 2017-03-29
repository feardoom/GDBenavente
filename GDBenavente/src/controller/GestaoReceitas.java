package controller;

import java.util.ArrayList;

import model.Receita;
import tools.easyIO;

public class GestaoReceitas {
	private ArrayList<Receita> receitas;
	private static easyIO io = new easyIO();
	
	public GestaoReceitas() {
		receitas = new ArrayList<Receita>();
	}
	
	public void menuReceitas() {
		int op;
		do {
			io.writeL("Escolha uma opcao");
			io.writeL("1. Registar Entrada");
			io.writeL("2. Listar Receitas");
			io.writeL("3. O melhor socio");
			io.writeL("4. Receitas por mês");
			io.writeL("0. Sair");
			op = io.readN();
			
			switch (op) {
				case 1:
					inserirReceita();
					break;
				case 2:
					listarExposicoes();
					break;
				case 3:
					detalheExposicao();
					break;
				case 4:
					gerirObras();
					break;
				case 5:
					mostrarLucros();
					break;
			}
		}while(op!=0);
	}
	
	public void inserirExposicao() {
		Receita re =  new Receita();
		int op;
		io.writeL("\nQual é o tipo de entrada?");
		io.writeL("  Escolha uma opção:");
		io.writeL("  1. Donativo");
		io.writeL("  2. Bilheteria");
		do {
			op = io.readN();
			re.setTipo(op==1?"Donativo":"Bilheteria");
		}while(op!=1 || op!=2);
		
		
		
		io.writeL("\nQual foi o sócio?");
		
		
		io.writeL("Introduza a data de inicio");
		ex.setData_inicio(io.readS());
		
		io.writeL("Introduza a data de fim");
		ex.setData_fim(io.readS());
		
		io.writeL("Introduza o preco");
		ex.setPreco(io.readD());
		
		io.write("Agora introduza os Obras para esta exposicao");
		GestaoObras GO = new GestaoObras();
		GO.inserirObras();
		ex.setObras(GO.getAll());
							
		this.exposicoes.add(ex);
	}	
	
}
