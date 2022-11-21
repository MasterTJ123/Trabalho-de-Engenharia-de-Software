package Factory;

import Controle.Controle;
import Controle.ControleJogo;
import Modelo.Modelo;
import Modelo.ModeloJogo;
import Persistencia.Persistencia;
import Persistencia.PersistenciaJogo;
import Visao.Visao;
import Visao.VisaoJogo;

public class JogoFactory extends Factory {

	private static final JogoFactory jogo_factory = new JogoFactory();
	
	private JogoFactory() {
		
	}
	
	public static JogoFactory getInstance() {
		return jogo_factory;
	}
	
	
	public Modelo criarModelo() {
		return new ModeloJogo();
	}
	
	public Controle criarControle() {
		return ControleJogo.getInstance();
	}
	
	public Visao criarVisao() {
		return VisaoJogo.getInstance();
	}
	
	public Persistencia criarPersistencia() {
		return PersistenciaJogo.getInstance();
	}
	
}
