package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Listas {

	private List<ModeloJogo> lista_jogo = new ArrayList<ModeloJogo>();
	private List<ModeloAluguel> lista_aluguel = new ArrayList<ModeloAluguel>();
	
	private static final Listas listas = new Listas();
	
	private Listas() {
		
	}
	
	public static Listas getInstance() {
		return listas;
	}	
	
	public List<ModeloJogo> getLista_jogo() {
		return lista_jogo;
	}
	
	public void setLista_jogo(List<ModeloJogo> lista_jogo) {
		this.lista_jogo = lista_jogo;
	}
	
	public List<ModeloAluguel> getLista_aluguel() {
		return lista_aluguel;
	}
	
	public void setLista_aluguel(List<ModeloAluguel> lista_aluguel) {
		this.lista_aluguel = lista_aluguel;
	}
	
}
