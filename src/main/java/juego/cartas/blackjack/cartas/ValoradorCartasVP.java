package juego.cartas.blackjack.cartas;

import juegos.cartas.cartas.cartas.modelos.ICartaNumeroPaloFrancesa;

/**
 * Valora una carta francesa con numeros de Integer
 * El palo no importa
 * @author victor
 *
 * @param <C>
 * @param <V>
 */
public class ValoradorCartasVP<C extends ICartaNumeroPaloFrancesa<Integer,V>,V> 
implements ValoradorCartas<C> 
{

	/**
	 * Da el valor "normal" de la carta
	 * @param carta
	 * @return
	 */
	public int dameValor(C carta)
	{
		int n= carta.getNumero();
		if(n>=2 && n<=9)//el 10 no se usa
			return n;
		else
			return 10;
		
	}
	/**
	 * Da el valor alternativo, suele usarse con el as
	 * @param carta
	 * @return
	 */
	public Integer dameValorAlternativo(C carta)
	{
		if(carta.getNumero()==1)
			return 11;
		else return null;
	}
	@Override
	public boolean esAs(C carta) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean contieneAs(C carta) {
		// TODO Auto-generated method stub
		return false;
	}
}
