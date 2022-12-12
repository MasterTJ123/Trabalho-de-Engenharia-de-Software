package Controle;

import java.util.List;

import Gamesiirados.Console;
import Modelo.Modelo;
import Modelo.ModeloJogo;

public class ControleJogo extends Controle {

	private static final ControleJogo controle_jogo = new ControleJogo();
	
	private ControleJogo() {
		
	}
	
	public static ControleJogo getInstance() {
		return controle_jogo;
	}	
	
	public void cadastrar() {
		ModeloJogo m = (ModeloJogo) ControleJogo.super.getModelo();
		m.cadastrar();
	}
	
	public Modelo alterar(Modelo m) {
		ModeloJogo modelo_jogo = (ModeloJogo) m;
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
		return modelo_jogo;
	}
	
	public void visualizar() {
		List<ModeloJogo> lista_jogo = Gamesiirados.Gamesiirados.listas.getLista_jogo();
		if(lista_jogo.size() == 0) {
			System.out.println("Erro! Não existem jogos cadastrados no sistema!");
		} else {
			System.out.println("JOGOS CADASTRADOS NO SISTEMA");
			System.out.println("");
			for(Integer i = 0; i < lista_jogo.size(); i++) {
				System.out.println("Id: " + lista_jogo.get(i).getId());
				System.out.println("Valor: " + lista_jogo.get(i).getValor());
				System.out.println("Nome: " + lista_jogo.get(i).getNome());
				System.out.println("Gênero: " + lista_jogo.get(i).getGenero());
				System.out.println("Descrição: " + lista_jogo.get(i).getDescricao());
				System.out.println("Data de lançamento: " + lista_jogo.get(i).getData_lancamento());
				System.out.println("");
			}
		}
	}
	
	public void excluir(Modelo m) {
		ModeloJogo modelo_jogo = (ModeloJogo) m;
		List<ModeloJogo> lista_jogo = Gamesiirados.Gamesiirados.listas.getLista_jogo();
		lista_jogo.remove(modelo_jogo);
	}
	
	public Modelo buscarId(Integer i) {
		List<ModeloJogo> lista_jogo = Gamesiirados.Gamesiirados.listas.getLista_jogo();
		ModeloJogo modelo = null;
		if(lista_jogo.size() == 0) {
			return modelo;
		}
		for(Integer j = 0; j < lista_jogo.size(); j++) {
			if(lista_jogo.get(j).getId() == i) {
				modelo = lista_jogo.get(j);
			}
		}
		return modelo;
	}
	
	public Modelo buscarValor(Float v) {
		List<ModeloJogo> lista_jogo = Gamesiirados.Gamesiirados.listas.getLista_jogo();
		ModeloJogo modelo = null;
		if(lista_jogo.size() == 0) {
			return modelo;
		}
		for(Integer j = 0; j < lista_jogo.size(); j++) {
			if(lista_jogo.get(j).getValor() == v) {
				modelo = lista_jogo.get(j);
			}
		}
		return modelo;
	}

	public void notifyObservers() {
		
	}
	
}
