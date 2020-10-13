package juego.cartas.blackjack.cartas.fact;

import juegos.cartas.cartas.cartas.modelos.ICartaNumeroPaloFrancesa;
import juegos.cartas.cartas.mazos.fact.TipoClasico;
import juegos.cartas.cartas.mazos.fact.TipoParametrizacion;
import juegos.cartas.cartas.mazos.fact.mult.FactMazoMultiple;
import juegos.cartas.cartas.mazos.modelos.func.MazoMultiple;


/**
 * Crea un mazo para el blackjack sabiendo el  numero de mazos, y el tipo de parametro I S
 * @author victor
 *
 * @param <C>
 * @param <P>
 */
public class FactMazoMultBlackJack <C extends ICartaNumeroPaloFrancesa<Integer, P>,P>
{
	
	
	private FactMazoMultiple<C, P> factMazoMult= new FactMazoMultiple<>();
	
	public MazoMultiple<C> creaMazoBlackJack(TipoParametrizacion tipoParam, int numMazos)
	{
		return factMazoMult.creaMazoMult(numMazos, TipoClasico.Francesa, tipoParam);
	}
	/*
	private FactFachadaMazoEspFr factMazo= FactFachadaMazoEspFr.getInst();
	
	public MazoMultiple<C,Integer,P> creaMazoMultiple(TipoParametrizacion param, int numMazos)
	{
		TipoClasico tipoClasico= TipoClasico.Francesa;
		 SupplierNewCarta<C,Integer,P> s = factMazo.dameSuplierCarta(tipoClasico, param);
		 DominioValorPalo<C,Integer,P> domVP = factMazo.dameDominio(tipoClasico, param);
		return new MazoMultipleGenOptMatrizLista<>(s, domVP, numMazos);
	}*/

}
