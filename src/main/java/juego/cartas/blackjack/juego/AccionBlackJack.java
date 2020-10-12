package juego.cartas.blackjack.juego;

import juegos.cartas.cartas.juego.AccionJuego;

/** Las acciones que puede realizar un jugador de blackJack son:
 * pedir otra carta (Hit),
 *  Plantarse (Stand),
 *  Doblar la apuesta (Double-down)
 *   o separar las cartas (Split) 
 * @author victor
 *
 */
public enum AccionBlackJack implements AccionJuego
{
	
	Hit ("pedir otra carta"),
	Stand ("Plantarse"),
	DoubleDown("Doblar la apuesta" ) ,
	Split("separar las cartas" ); 
	
	String descripcion;

	private AccionBlackJack(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

}
