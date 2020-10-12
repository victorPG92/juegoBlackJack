package juego.cartas.blackjack.cartas;

import juegos.cartas.cartas.cartas.ICartaComparable;

public interface ValoradorCartas<C extends ICartaComparable>
{

	/**
	 * Da el valor "normal" de la carta
	 * @param carta
	 * @return
	 */
	public int dameValor(C carta);

	/**
	 * Da el valor alternativo, suele usarse con el as
	 * @param carta
	 * @return
	 */
	public Integer dameValorAlternativo(C carta);
	
	/**
	 * Es un as
	 * @param carta
	 * @return
	 */
	public boolean esAs(C carta);
	
	/**
	 * Contiene un as
	 * @param carta
	 * @return
	 */
	public boolean contieneAs(C carta);
}
