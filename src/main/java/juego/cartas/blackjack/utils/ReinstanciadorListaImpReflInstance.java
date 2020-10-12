package juego.cartas.blackjack.utils;

import java.util.ArrayList;
import java.util.List;

public class ReinstanciadorListaImpReflInstance<T> implements ReinstanciadorLista<T>
{
	
	public List<T> reinstanciaLista(List<T> lista)
	{
		try {
			return lista.getClass().newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
			return null;
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			return null;
		}
	}

}
