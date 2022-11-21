package Controle;

import Modelo.Modelo;

public abstract class Controle {
	
	private Modelo modelo;
	
	public abstract void notifyObservers();

	public abstract void cadastrar();
	
	public abstract void alterar();
	
	public abstract void visualizar();
	
	public abstract void excluir();
	
	public abstract Modelo buscarId(Integer i);
	
	public abstract Modelo buscarValor(Float v);

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}
	
}
