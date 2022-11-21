package Factory;

import Controle.Controle;
import Controle.ControleAluguel;
import Modelo.Modelo;
import Modelo.ModeloAluguel;
import Persistencia.Persistencia;
import Persistencia.PersistenciaAluguel;
import Visao.Visao;
import Visao.VisaoAluguel;

public class AluguelFactory extends Factory {

	private static final AluguelFactory emprestimo_factory = new AluguelFactory();
	
	private AluguelFactory() {
		
	}
	
	public static AluguelFactory getInstance() {
		return emprestimo_factory;
	}
	
	public Modelo criarModelo() {
		return new ModeloAluguel();
	}
	
	public Controle criarControle() {
		return ControleAluguel.getInstance();
	}
	
	public Visao criarVisao() {
		return VisaoAluguel.getInstance();
	}
	
	public Persistencia criarPersistencia() {
		return PersistenciaAluguel.getInstance();
	}
	
}
