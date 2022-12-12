package Modelo;

import java.util.ArrayList;
import java.util.List;

public class ModeloAluguel extends Modelo {

	private List<ModeloJogo> lista_jogos = new ArrayList<ModeloJogo>();

	public void adicionarLista_jogos(ModeloJogo modelo_jogo) {
		lista_jogos.add(modelo_jogo);
	}
	
	public List<ModeloJogo> getLista_jogos() {
		return lista_jogos;
	}

	public void setLista_jogos(List<ModeloJogo> lista_jogos) {
		this.lista_jogos = lista_jogos;
	}
	
	public void cadastrar() {
		Gamesiirados.Gamesiirados.listas.getLista_aluguel().add(this);
	}
	
}
