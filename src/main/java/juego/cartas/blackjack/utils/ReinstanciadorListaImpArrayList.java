package juego.cartas.blackjack.utils;

import java.util.ArrayList;
import java.util.List;

public class ReinstanciadorListaImpArrayList<T> implements ReinstanciadorLista<T>
{
	
	public List<T> reinstanciaLista(List<T> lista)
	{
		return new ArrayList<>();
	}

}
