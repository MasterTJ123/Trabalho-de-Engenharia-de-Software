package Persistencia;

import Modelo.Modelo;

public class PersistenciaAluguel extends Persistencia {

	private static final PersistenciaAluguel persistencia_aluguel = new PersistenciaAluguel();
	
	private PersistenciaAluguel() {
		
	}
	
	public static PersistenciaAluguel getInstance() {
		return persistencia_aluguel;
	}		
	
	public void salvarArquivo(Modelo m) {
		
	}
	
	public void excluirArquivo(Modelo m) {
		
	}
	
}
