package Gamesiirados;

import Factory.Factory;
import Modelo.Listas;
import Visao.MenuPrincipal;

public class Gamesiirados {

	public static Listas listas = Listas.getInstance();
	
	public static void main(String[] args) {

		Factory factory_jogo = Factory.getFactory("jogo");
		Factory factory_aluguel = Factory.getFactory("aluguel");
				
		MenuPrincipal menu_principal = MenuPrincipal.getInstance();
		
		menu_principal.mostrarMenu(factory_jogo, factory_aluguel);
		
	}

}
