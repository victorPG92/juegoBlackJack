package juego.cartas.blackjack.utils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReinstanciadorListaImpReflCases<T> implements ReinstanciadorLista<T>
{
	
	public List<T> reinstanciaLista(List<T> lista)
	{
		if(lista instanceof ArrayList)
			return new ArrayList<>();
		else if(lista instanceof LinkedList)
			return new LinkedList<>();
		else
			return null;
		
	}

}
