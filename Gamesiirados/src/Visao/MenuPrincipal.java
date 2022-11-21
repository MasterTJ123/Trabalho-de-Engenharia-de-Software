package Visao;

import Controle.Controle;
import Factory.Factory;
import Gamesiirados.Console;

public class MenuPrincipal extends Visao {

	private static final MenuPrincipal menu_principal = new MenuPrincipal();
	
	private MenuPrincipal() {
		
	}
	
	public static MenuPrincipal getInstance() {
		return menu_principal;
	}	
	
	public void mostrarMenu(Factory jogo_factory, Factory aluguel_factory) {
		
		boolean executando = true;
		
		while (executando) {
			
			System.out.println("Menu Principal");
			System.out.println("1- Jogo");
			System.out.println("2- Aluguel");
			System.out.println("3- Sair");
			
			int opcao = Integer.parseInt(Console.readLine());
			
			switch (opcao) {
				case 1:
					Visao jogo_visao = jogo_factory.criarVisao();
					Controle jogo_controle = jogo_factory.criarControle();
					jogo_visao.adicionarControle(jogo_controle);
					jogo_visao.mostrarMenu(jogo_factory, aluguel_factory);
					break;
				case 2:
					Visao aluguel_visao = aluguel_factory.criarVisao();
					Controle aluguel_controle = aluguel_factory.criarControle();
					aluguel_visao.adicionarControle(aluguel_controle);
					aluguel_visao.mostrarMenu(jogo_factory, aluguel_factory);
					break;
				case 3:
					System.out.println("Finalizando programa com sucesso!");
					executando = false;
					break;
				default:
					System.out.println("Erro! Opção inválida!");
			
			}
			
		}
		
	}

	public void adicionarControle(Controle c) {
		
	}
	
}
