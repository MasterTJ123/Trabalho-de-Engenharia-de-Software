package Factory;

import Controle.Controle;
import Modelo.Modelo;
import Persistencia.Persistencia;
import Visao.Visao;

public abstract class Factory {

	public static Factory getFactory(String f) {
		if (f.equals("jogo"))
			return JogoFactory.getInstance();
		else
			return AluguelFactory.getInstance();
	}
	
	public abstract Modelo criarModelo();
	public abstract Controle criarControle();
	public abstract Visao criarVisao();
	public abstract Persistencia criarPersistencia();
	
}
