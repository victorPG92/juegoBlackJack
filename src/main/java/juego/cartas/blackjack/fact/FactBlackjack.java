package juego.cartas.blackjack.fact;

import juegos.cartas.cartas.cartas.CartaNumeroPalo;
import juegos.cartas.cartas.cartas.ICartaNumeroPalo;
import juegos.cartas.cartas.mazos.fact.FactMazoConcreto;
import juegos.cartas.cartas.mazos.impl.gen.MazoGen;

public class FactBlackjack //<CartaNumeroPalo<Integer, String>, Integer, String>//<C extends CartaNumeroPalo<N,P>, N, P>
{
	
	FactMazoConcreto fMazo=new FactMazoConcreto();
	
	public MazoGen<ICartaNumeroPalo<Integer, String>, Integer, String>/*<C,N,P>*/ creaMazo()
	{
		MazoGen<ICartaNumeroPalo<Integer, String>, Integer, String> barajaFrancesa = fMazo.crearBarajaFrancesa();
		
		return barajaFrancesa;
	}

}
