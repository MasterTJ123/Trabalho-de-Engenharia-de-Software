package Visao;

import Controle.Controle;
import Factory.Factory;
import Gamesiirados.Console;
import Modelo.ModeloAluguel;

public class VisaoAluguel extends Visao {
	
	private Controle aluguel_controle;

	private static final VisaoAluguel visao_aluguel = new VisaoAluguel();
	
	public void adicionarControle(Controle c) {
	    this.aluguel_controle = c;
	}
	
	private VisaoAluguel() {
		
	}
	
	public static VisaoAluguel getInstance() {
		return visao_aluguel;
	}		

	public void mostrarMenu(Factory jogo_factory, Factory aluguel_factory) {
		
		ModeloAluguel modelo_aluguel = new ModeloAluguel();
		Integer busca_id;
		Float busca_valor;
		
		boolean executando = true;
		
		while (executando) {
			
			System.out.println("Menu Aluguel");
			System.out.println("1- Cadastrar");
			System.out.println("2- Alterar");
			System.out.println("3- Visualizar");
			System.out.println("4- Excluir");
			System.out.println("5- Buscar por id");
			System.out.println("6- Buscar por valor");
			System.out.println("7- Voltar");
			
			int opcao = Integer.parseInt(Console.readLine());
			
			switch (opcao) {
				case 1:
					aluguel_controle.cadastrar(modelo_aluguel);
					break;
				case 2:
					aluguel_controle.alterar(modelo_aluguel);
					break;
				case 3:
					aluguel_controle.visualizar(modelo_aluguel);
					break;
				case 4:
					aluguel_controle.excluir(modelo_aluguel);
					break;
				case 5:
					System.out.println("Insira o id: ");
					busca_id = Integer.parseInt(Console.readLine());
					aluguel_controle.buscarId(busca_id);
				case 6:
					System.out.println("Insira o valor: ");
					busca_valor = Float.parseFloat(Console.readLine());
					aluguel_controle.buscarValor(busca_valor);
				case 7:
					executando = false;
					break;
				default:
					System.out.println("Erro! Opção inválida!");
			
			}
		
		}
		
	}
	
}
