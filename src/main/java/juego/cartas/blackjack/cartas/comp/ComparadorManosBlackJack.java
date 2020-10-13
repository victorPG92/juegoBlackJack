package juego.cartas.blackjack.cartas.comp;

import java.util.Comparator;
import java.util.List;

import juego.cartas.blackjack.cartas.ValoradorMano;
import juego.cartas.blackjack.cartas.ValoradorManoJugada;
import juegos.cartas.cartas.cartas.modelos.CartaFrancesa;
import juegos.cartas.cartas.cartas.modelos.ICartaNumeroPaloFrancesa;

public class ComparadorManosBlackJack<C extends CartaFrancesa> implements Comparator<List<C>>
{
	ValoradorMano<C> valMano;
	ValoradorManoJugada<C> valManoJugada;
	

	@Override
	public int compare(List<C> cartasJugador, List<C> cartasBanca) 
	{
		List<Integer> listaPuntosJugador=valMano.valoraPuntos(cartasJugador);
		
		if(listaPuntosJugador.stream().allMatch(i-> i>21))
			return -1;
		
		List<Integer> listaPuntosBanca=valMano.valoraPuntos(cartasBanca);
		
		if(listaPuntosBanca.stream().allMatch(i-> i>21))
			return 1;
		
		// en caso de empate banca gana, aunque la banca no deberia haber llegado a ese extremo
		
		//empate seria devolver el dinero
		
		
		//si ambos son menores o iguales a 21 se compara la mayor
		int puntosJugador= listaPuntosJugador.stream().filter(i->i<22).max(Integer::compareTo).get();
		int puntosBanca= listaPuntosBanca.stream().filter(i->i<22).max(Integer::compareTo).get();
		
		int r= Integer.compare(puntosJugador, puntosJugador);
		
		if(r==-1)
			return r;
		
		boolean jugadorBJ=valManoJugada.esBlackJack(cartasJugador);
		if( r==0
				&& !valManoJugada.esBlackJack(cartasBanca))
		
			return 1;
		else 
			return 0;
		
		
		
		
	}
	 

}
