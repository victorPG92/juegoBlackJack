package juego.cartas.blackjack.cartas;

import java.util.List;

public interface ValoradorManoJugada <C>
{
	
	/**
	 * Contiene un as
	 * @param carta
	 * @return
	 */
	public boolean contieneAs(List<C> carta);
	
	
	/**
	 * Identifica lam jugada como blackJack
	 * @param carta
	 * @return
	 */
	public boolean esBlackJack(List<C> carta);

}
