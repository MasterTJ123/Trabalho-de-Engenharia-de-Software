package Persistencia;

import Modelo.Modelo;

public class PersistenciaJogo extends Persistencia {

	private static final PersistenciaJogo persistencia_jogo = new PersistenciaJogo();
	
	private PersistenciaJogo() {
		
	}
	
	public static PersistenciaJogo getInstance() {
		return persistencia_jogo;
	}	
	
	public void salvarArquivo(Modelo m) {
		
	}
	
	public void excluirArquivo(Modelo m) {
		
	}
	
}
