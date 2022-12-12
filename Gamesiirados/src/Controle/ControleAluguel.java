package Controle;

import java.util.List;

import Gamesiirados.Console;
import Modelo.Modelo;
import Modelo.ModeloAluguel;
import Modelo.ModeloJogo;

public class ControleAluguel extends Controle {

	private static final ControleAluguel controle_aluguel = new ControleAluguel();
	
	private ControleAluguel() {
		
	}
	
	public static ControleAluguel getInstance() {
		return controle_aluguel;
	}	
	
	public void cadastrar() {
		ModeloAluguel m = (ModeloAluguel) ControleAluguel.super.getModelo();
		m.cadastrar();
	}
	
	public Modelo alterar(Modelo m) {
		ModeloAluguel modelo_aluguel = (ModeloAluguel) m;
		System.out.println("Insira o id do aluguel: ");
		modelo_aluguel.setId(Integer.parseInt(Console.readLine()));
		System.out.println("Insira o valor do aluguel: ");
		modelo_aluguel.setValor(Float.parseFloat(Console.readLine()));
		boolean executando = true;
		while(executando == true) {
			System.out.println("Alterar Aluguel");
			System.out.println("1- Adicionar jogo no aluguel");
			System.out.println("2- Excluir jogo no aluguel");
			System.out.println("3- Concluir");
			
			int opcao = Integer.parseInt(Console.readLine());
			
			switch(opcao) {
				case 1:
					ModeloJogo modelo = null;
					List<ModeloJogo> lista_jogo = Gamesiirados.Gamesiirados.listas.getLista_jogo();
					System.out.println("Insira o id do jogo que deseja adicionar: ");
					Integer busca_id = Integer.parseInt(Console.readLine());
					if(lista_jogo.size() == 0) {
						System.out.println("Erro! Não existem jogos cadastrados no sistema!");
						break;
					}
					for(Integer j = 0; j < lista_jogo.size(); j++) {
						if(lista_jogo.get(j).getId() == busca_id) {
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
					executando = false;
					break;
				default:
					System.out.println("Erro! Opção inválida!");
			}
		}
		
		return modelo_aluguel;
	}
	
	public void visualizar() {
		List<ModeloAluguel> lista_aluguel = Gamesiirados.Gamesiirados.listas.getLista_aluguel();
		if(lista_aluguel.size() == 0) {
			System.out.println("Erro! Não existem aluguéis cadastrados no sistema!");
		} else {
			System.out.println("ALUGUÉIS CADASTRADOS NO SISTEMA");
			System.out.println("");
			for(Integer i = 0; i < lista_aluguel.size(); i++) {
				System.out.println("Id do aluguel: " + lista_aluguel.get(i).getId());
				System.out.println("Valor do aluguel: " + lista_aluguel.get(i).getValor());
				System.out.println("JOGOS NO CARRINHO DO ALUGUEL");
					for(Integer j = 0; j < lista_aluguel.get(i).getLista_jogos().size(); j++) {
						ModeloJogo modelo_jogo = lista_aluguel.get(i).getLista_jogos().get(j);
						System.out.println("Id: " + modelo_jogo.getId());
						System.out.println("Valor: " + modelo_jogo.getValor());
						System.out.println("Nome: " + modelo_jogo.getNome());
						System.out.println("Gênero: " + modelo_jogo.getGenero());
						System.out.println("Descrição: " + modelo_jogo.getDescricao());
						System.out.println("Data de lançamento: " + modelo_jogo.getData_lancamento());
						System.out.println("");
					}
			}
		}
	}
	
	public void excluir(Modelo m) {
		ModeloAluguel modelo_aluguel = (ModeloAluguel) m;
		List<ModeloAluguel> lista_aluguel = Gamesiirados.Gamesiirados.listas.getLista_aluguel();
		lista_aluguel.remove(modelo_aluguel);
	}
	
	public Modelo buscarId(Integer i) {
		List<ModeloAluguel> lista_aluguel = Gamesiirados.Gamesiirados.listas.getLista_aluguel();
		ModeloAluguel modelo = null;
		if(lista_aluguel.size() == 0) {
			return modelo;
		}
		for(Integer j = 0; j < lista_aluguel.size(); j++) {
			if(lista_aluguel.get(j).getId() == i) {
				modelo = lista_aluguel.get(j);
			}
		}
		return modelo;
	}
	
	public Modelo buscarValor(Float v) {
		List<ModeloAluguel> lista_aluguel = Gamesiirados.Gamesiirados.listas.getLista_aluguel();
		ModeloAluguel modelo = null;
		if(lista_aluguel.size() == 0) {
			return modelo;
		}
		for(Integer j = 0; j < lista_aluguel.size(); j++) {
			if(lista_aluguel.get(j).getValor() == v) {
				modelo = lista_aluguel.get(j);
			}
		}
		return modelo;
	}
	
	public void notifyObservers() {
		
	}
	
}
