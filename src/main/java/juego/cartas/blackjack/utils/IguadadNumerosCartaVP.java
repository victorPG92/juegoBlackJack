package juego.cartas.blackjack.utils;

import juegos.cartas.cartas.cartas.CartaNumeroPalo;

public class IguadadNumerosCartaVP<C extends CartaNumeroPalo<V, P>,V,P>
implements IgualdadNumeros<C>
{
	public boolean tieneNumerosIguales(C c1,C c2)
	{
		return c1.getNumero().equals(c2.getNumero());
	}

}
