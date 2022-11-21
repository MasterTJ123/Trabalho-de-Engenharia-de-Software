package Visao;

import Controle.Controle;
import Factory.Factory;
import Gamesiirados.Console;
import Modelo.ModeloJogo;

public class VisaoJogo extends Visao {
	
	private Controle jogo_controle; 

	private static final VisaoJogo visao_jogo = new VisaoJogo();
	
	public void adicionarControle(Controle c) {
		    this.jogo_controle = c;
	}
	
	private VisaoJogo() {
		
	}
	
	public static VisaoJogo getInstance() {
		return visao_jogo;
	}	
	
	public void mostrarMenu(Factory jogo_factory, Factory aluguel_factory) {
		
		ModeloJogo modelo_jogo = new ModeloJogo();
		Integer busca_id;
		Float busca_valor;
		
		boolean executando = true;
		
		while (executando) {
			
			System.out.println("Menu Jogo");
			System.out.println("1- Cadastrar");
			System.out.println("2- Alterar");
			System.out.println("3- Visualizar");
			System.out.println("4- Excluir");
			System.out.println("5- Buscar por id");
			System.out.println("6- Buscar por valor");
			System.out.println("7- Voltar");
			
			int opcao = Integer.parseInt(Console.readLine());
			
			switch (opcao) {
				case 1:
					System.out.println("Insira o nome: ");
					modelo_jogo.setNome(Console.readLine());
					System.out.println("Insira o gênero: ");
					modelo_jogo.setGenero(Console.readLine());
					System.out.println("Insira a descrição: ");
					modelo_jogo.setDescricao(Console.readLine());
					System.out.println("Insira a data de lançamento: ");
					modelo_jogo.setData_lancamento(Console.readLine());
					jogo_controle.setModelo(modelo_jogo);
					jogo_controle.cadastrar();
					System.out.println("Produto cadastrado com sucesso!");
					break;
				case 2:
					jogo_controle.alterar(modelo_jogo);
					break;
				case 3:
					jogo_controle.visualizar(modelo_jogo);
				case 4:
					jogo_controle.excluir(modelo_jogo);
				case 5:
					System.out.println("Insira o id: ");
					busca_id = Integer.parseInt(Console.readLine());
					jogo_controle.buscarId(busca_id);
				case 6:
					System.out.println("Insira o valor: ");
					busca_valor = Float.parseFloat(Console.readLine());
					jogo_controle.buscarValor(busca_valor);
				case 7:
					executando = false;
					break;
				default:
					System.out.println("Erro! Opção inválida!");
			
			}
		
		}
		
	}
	
}