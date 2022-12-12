package Visao;

import java.util.List;

import Controle.Controle;
import Factory.Factory;
import Gamesiirados.Console;
import Modelo.ModeloAluguel;
import Modelo.ModeloJogo;

public class VisaoAluguel extends Visao {
	
	private Controle aluguel_controle;

	private static final VisaoAluguel visao_aluguel = new VisaoAluguel();
	
	public void adicionarControle(Controle c) {
	    this.aluguel_controle = c;
	}
	
	private VisaoAluguel() {
		
	}
	
	public static VisaoAluguel getInstance() {
		return visao_aluguel;
	}		

	public void mostrarMenu(Factory jogo_factory, Factory aluguel_factory) {
		
		ModeloAluguel modelo_aluguel = new ModeloAluguel();
		Integer busca_id;
		Float busca_valor;
		
		boolean executando = true;
		
		while (executando) {
			
			System.out.println("Menu Aluguel");
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
					System.out.println("Insira o id do aluguel: ");
					modelo_aluguel.setId(Integer.parseInt(Console.readLine()));
					System.out.println("Insira o valor do aluguel: ");
					modelo_aluguel.setValor(Float.parseFloat(Console.readLine()));
					boolean executando2 = true;
					while(executando2 == true) {
						System.out.println("Opções de Cadastro de Aluguel");
						System.out.println("1- Adicionar jogo no aluguel");
						System.out.println("2- Excluir jogo no aluguel");
						System.out.println("3- Concluir");
						
						int opcao2 = Integer.parseInt(Console.readLine());
						
						switch(opcao2) {
							case 1:
								ModeloJogo modelo = null;
								List<ModeloJogo> lista_jogo = Gamesiirados.Gamesiirados.listas.getLista_jogo();
								System.out.println("Insira o id do jogo que deseja adicionar: ");
								Integer busca_id2 = Integer.parseInt(Console.readLine());
								if(lista_jogo.size() == 0) {
									System.out.println("Erro! Não existem jogos cadastrados no sistema!");
									break;
								}
								for(Integer j = 0; j < lista_jogo.size(); j++) {
									if(lista_jogo.get(j).getId() == busca_id2) {
										modelo = lista_jogo.get(j);
										break;
									}
								}
								modelo_aluguel.getLista_jogos().add(modelo);
								break;
							case 2:
								ModeloJogo modelo_remover = null;
								List<ModeloJogo> lista_jogo_remover = Gamesiirados.Gamesiirados.listas.getLista_jogo();
								System.out.println("Insira o id do jogo que deseja excluir: ");
								Integer busca_id_remover = Integer.parseInt(Console.readLine());
								if(lista_jogo_remover.size() == 0) {
									System.out.println("Erro! Não existem jogos cadastrados no sistema!");
									break;
								}
								for(Integer j = 0; j < lista_jogo_remover.size(); j++) {
									if(lista_jogo_remover.get(j).getId() == busca_id_remover) {
										modelo = lista_jogo_remover.get(j);
										break;
									}
								}
								modelo_aluguel.getLista_jogos().remove(modelo_remover);
								break;
							case 3:
								executando2 = false;
								break;
							default:
								System.out.println("Erro! Opção inválida!");
						}
					}
					aluguel_controle.setModelo(modelo_aluguel);
					aluguel_controle.cadastrar();
					System.out.println("Produto cadastrado com sucesso!");
					break;
				case 2:
					System.out.println("Insira o id do aluguel que deseja alterar: ");
					busca_id = Integer.parseInt(Console.readLine());
					modelo_aluguel = (ModeloAluguel) aluguel_controle.buscarId(busca_id);
					if(modelo_aluguel == null) {
						System.out.println("Erro! Não foi possível encontrar um aluguel com esse id!");
					} else {
						modelo_aluguel = (ModeloAluguel) aluguel_controle.alterar(modelo_aluguel);
						System.out.println("Aluguel alterado com sucesso!");
					}
					aluguel_controle.alterar(modelo_aluguel);
					break;
				case 3:
					aluguel_controle.visualizar();
					break;
				case 4:
					System.out.println("Insira o id: ");
					busca_id = Integer.parseInt(Console.readLine());
					modelo_aluguel = (ModeloAluguel) aluguel_controle.buscarId(busca_id);
					if(modelo_aluguel == null) {
						System.out.println("Erro! Não foi possível encontrar um aluguel com esse id!");
					} else {
						aluguel_controle.excluir(modelo_aluguel);
						System.out.println("Aluguel excluído com sucesso!");
					}
					break;
				case 5:
					System.out.println("Insira o id: ");
					busca_id = Integer.parseInt(Console.readLine());
					modelo_aluguel = (ModeloAluguel) aluguel_controle.buscarId(busca_id);
						if(modelo_aluguel == null) {
							System.out.println("Erro! Não foi possível encontrar um aluguel com esse id!");
						} else {
							System.out.println("Id do aluguel: " + modelo_aluguel.getId());
							System.out.println("Valor do aluguel: " + modelo_aluguel.getValor());
							System.out.println("JOGOS NO CARRINHO DO ALUGUEL");
							for(Integer j = 0; j < modelo_aluguel.getLista_jogos().size(); j++) {
								ModeloJogo modelo_jogo = modelo_aluguel.getLista_jogos().get(j);
								System.out.println("Id: " + modelo_jogo.getId());
								System.out.println("Valor: " + modelo_jogo.getValor());
								System.out.println("Nome: " + modelo_jogo.getNome());
								System.out.println("Gênero: " + modelo_jogo.getGenero());
								System.out.println("Descrição: " + modelo_jogo.getDescricao());
								System.out.println("Data de lançamento: " + modelo_jogo.getData_lancamento());
								System.out.println("");
							}
						}
					break;
				case 6:
					System.out.println("Insira o valor: ");
					busca_valor = Float.parseFloat(Console.readLine());
					modelo_aluguel = (ModeloAluguel) aluguel_controle.buscarValor(busca_valor);
						if(modelo_aluguel == null) {
							System.out.println("Erro! Não foi possível encontrar um aluguel com esse valor!");
						} else {
							System.out.println("Id do aluguel: " + modelo_aluguel.getId());
							System.out.println("Valor do aluguel: " + modelo_aluguel.getValor());
							System.out.println("JOGOS NO CARRINHO DO ALUGUEL");
							for(Integer j = 0; j < modelo_aluguel.getLista_jogos().size(); j++) {
								ModeloJogo modelo_jogo = modelo_aluguel.getLista_jogos().get(j);
								System.out.println("Id: " + modelo_jogo.getId());
								System.out.println("Valor: " + modelo_jogo.getValor());
								System.out.println("Nome: " + modelo_jogo.getNome());
								System.out.println("Gênero: " + modelo_jogo.getGenero());
								System.out.println("Descrição: " + modelo_jogo.getDescricao());
								System.out.println("Data de lançamento: " + modelo_jogo.getData_lancamento());
								System.out.println("");
							}
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
