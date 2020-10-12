package juego.cartas.blackjack.cartas;

import java.util.List;

import juego.cartas.blackjack.utils.BlackJackUtils;
import juego.cartas.blackjack.utils.IgualdadNumeros;
import juegos.cartas.cartas.cartas.modelos.CartaFrancesa;
import juegos.cartas.cartas.mesas.Jugador;

public class JugadorBlackjack<C extends CartaFrancesa> extends Jugador<C>{

	//List<C>  cartas2:
	
	List<List<C>> divisiones;
	IgualdadNumeros<C> ig;
	
	public void dividir(int i)
	{
		BlackJackUtils.dividirMultiLista(divisiones, ig, i);
	}
	
	
}
