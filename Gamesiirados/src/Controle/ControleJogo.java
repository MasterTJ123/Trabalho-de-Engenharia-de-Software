package Controle;

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
	
	public void alterar(Modelo m) {
		
	}
	
	public void visualizar(Modelo m) {
		
	}
	
	public void excluir(Modelo m) {
		
	}
	
	public Modelo buscarId(Integer i) {
		
	}
	
	public Modelo buscarValor(Float v) {
		
	}

	public void notifyObservers() {
		
	}
	
}
