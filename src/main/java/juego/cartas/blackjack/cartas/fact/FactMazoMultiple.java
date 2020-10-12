package juego.cartas.blackjack.cartas.fact;

import juegos.cartas.cartas.cartas.modelos.CartaFrancesa;
import juegos.cartas.cartas.cartas.modelos.imp.fr.CartaFrancesaImpI;
import juegos.cartas.cartas.cartas.supplier.SupplierNewCarta;
import juegos.cartas.cartas.mazos.impl.gen.MazoMultipleGenOptMatrizLista;
import juegos.cartas.cartas.mazos.modelos.func.MazoMultiple;

public class FactMazoMultiple<C extends CartaFrancesaImpI<V, P>,V,P>
{
	SupplierNewCarta<C, N, P> supplier;
	FactD
	
	public MazoMultiple<C> creaMazoMult(int numMazos)
	{
		return new MazoMultipleGenOptMatrizLista<C, V, P>(supplier,);
		
	}

}
