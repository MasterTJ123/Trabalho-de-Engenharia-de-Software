package Controle;

import Modelo.Modelo;

public abstract class Controle {
	
	private Modelo modelo;
	
	public abstract void notifyObservers();

	public abstract void cadastrar();
	
	public abstract Modelo alterar(Modelo modelo_jogo);
	
	public abstract void visualizar();
	
	public abstract void excluir(Modelo modelo_jogo);
	
	public abstract Modelo buscarId(Integer i);
	
	public abstract Modelo buscarValor(Float v);

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}
	
}
