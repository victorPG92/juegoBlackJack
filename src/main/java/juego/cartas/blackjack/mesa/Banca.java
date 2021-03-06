package juego.cartas.blackjack.mesa;

import java.util.List;

import juego.cartas.blackjack.cartas.JugadorBlackjack;
import juego.cartas.blackjack.cartas.ValoradorCartas;
import juego.cartas.blackjack.cartas.ValoradorMano;
import juego.cartas.blackjack.cartas.ValoradorManoJugada;
import juego.cartas.blackjack.juego.AccionBlackJack;
import juego.cartas.blackjack.juego.FaseBlackJack;
import juego.cartas.blackjack.juego.JuegoBlackJack;
import juego.cartas.clasicos.modelos.CartaFrancesa;
import juegos.cartas.cartas.juego.RealizadorTurno;

public class Banca<C extends CartaFrancesa> 
extends RealizadorTurno<C, AccionBlackJack, JuegoBlackJack<FaseBlackJack>, JugadorBlackjack<C>, FaseBlackJack>
{

	ValoradorMano<C> val;
	ValoradorManoJugada<C> valJug;
	ValoradorCartas<C> valCartas;
	public Banca(JugadorBlackjack<C> jugador, JuegoBlackJack<FaseBlackJack> juegoCartas) {
		super(jugador, juegoCartas);
	}

	@Override
	public AccionBlackJack escogeAccion() {
	
		//BlackJackUtils.class
		List<Integer> listPuntos=val.valoraPuntos(jugador.getCartas());
		
		if(listPuntos.size()==1)
		{
			int puntos=listPuntos.get(0);
			if(puntos==17 && valJug.contieneAs(jugador.getCartas()))
			{
				System.out.println("es soft 17");
			}
			if(puntos < 16)
				return AccionBlackJack.Hit;
			else
				return AccionBlackJack.Stand;
		}
		
		return AccionBlackJack.Stand;
	}
	
	public void darSeguroAJugador(JugadorBlackjack<C> j)
	{
		j.setTieneSeguro(true);
	}
	
	

	@Override
	public void realizaTurno() {
		escogeAccion();
		
	}

}
