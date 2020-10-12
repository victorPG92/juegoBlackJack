package juego.cartas.blackjack.cartas;

import java.util.List;

import juegos.cartas.cartas.cartas.modelos.CartaFrancesa;

public interface ValoradorMano <C extends CartaFrancesa>
{
	
	
	/**
	 * Valora si ha llegado al blackjack 1, aun no 0, o se ha pasado -1
	 * 
	 * @param cartas
	 * @return
	 */
	public int valoraMano(List<C> cartas);

	List<Integer> valoraPuntos(List<C> cartas);

}
