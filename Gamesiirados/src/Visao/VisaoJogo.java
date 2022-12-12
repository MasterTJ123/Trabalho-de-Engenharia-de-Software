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
					System.out.println("Insira o id: ");
					modelo_jogo.setId(Integer.parseInt(Console.readLine()));
					System.out.println("Insira o valor: ");
					modelo_jogo.setValor(Float.parseFloat(Console.readLine()));
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
					System.out.println("Insira o id do jogo que deseja alterar: ");
					busca_id = Integer.parseInt(Console.readLine());
					modelo_jogo = (ModeloJogo) jogo_controle.buscarId(busca_id);
					if(modelo_jogo == null) {
						System.out.println("Erro! Não foi possível encontrar um jogo com esse id!");
					} else {
						modelo_jogo = (ModeloJogo) jogo_controle.alterar(modelo_jogo);
						System.out.println("Produto alterado com sucesso!");
					}
					break;
				case 3:
					jogo_controle.visualizar();
					break;
				case 4:
					System.out.println("Insira o id: ");
					busca_id = Integer.parseInt(Console.readLine());
					modelo_jogo = (ModeloJogo) jogo_controle.buscarId(busca_id);
					if(modelo_jogo == null) {
						System.out.println("Erro! Não foi possível encontrar um jogo com esse id!");
					} else {
						jogo_controle.excluir(modelo_jogo);
						System.out.println("Produto excluído com sucesso!");
					}
					break;
				case 5:
					System.out.println("Insira o id: ");
					busca_id = Integer.parseInt(Console.readLine());
					modelo_jogo = (ModeloJogo) jogo_controle.buscarId(busca_id);
						if(modelo_jogo == null) {
							System.out.println("Erro! Não foi possível encontrar um jogo com esse id!");
						} else {
							System.out.println("Id: " + modelo_jogo.getId());
							System.out.println("Valor: " + modelo_jogo.getValor());
							System.out.println("Nome: " + modelo_jogo.getNome());
							System.out.println("Gênero: " + modelo_jogo.getGenero());
							System.out.println("Descrição: " + modelo_jogo.getDescricao());
							System.out.println("Data de lançamento: " + modelo_jogo.getData_lancamento());
						}
					break;
				case 6:
					System.out.println("Insira o valor: ");
					busca_valor = Float.parseFloat(Console.readLine());
					modelo_jogo = (ModeloJogo) jogo_controle.buscarValor(busca_valor);
						if(modelo_jogo == null) {
							System.out.println("Erro! Não foi possível encontrar um jogo com esse id!");
						} else {
							System.out.println("Id: " + modelo_jogo.getId());
							System.out.println("Valor: " + modelo_jogo.getValor());
							System.out.println("Nome: " + modelo_jogo.getNome());
							System.out.println("Gênero: " + modelo_jogo.getGenero());
							System.out.println("Descrição: " + modelo_jogo.getDescricao());
							System.out.println("Data de lançamento: " + modelo_jogo.getData_lancamento());
						}
					break;
				case 7:
					executando = false;
					break;
				default:
					System.out.println("Erro! Opção inválida!");
			
			}
		
		}
		
	}
	
}