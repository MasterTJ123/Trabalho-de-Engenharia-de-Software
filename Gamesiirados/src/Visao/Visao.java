package Visao;

import Controle.Controle;
import Factory.Factory;

public abstract class Visao {

	public abstract void adicionarControle(Controle c);
	
	public abstract void mostrarMenu(Factory jogo_factory, Factory aluguel_factory); 
	
}
