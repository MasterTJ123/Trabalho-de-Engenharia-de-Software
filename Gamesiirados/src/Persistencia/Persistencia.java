package Persistencia;

import Modelo.Modelo;

public abstract class Persistencia {

	public abstract void salvarArquivo(Modelo m);
	
	public abstract void excluirArquivo(Modelo m);
	
}
