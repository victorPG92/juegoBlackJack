package juego.cartas.blackjack.cartas;

import java.util.ArrayList;
import java.util.List;

import juego.cartas.blackjack.utils.BlackJackUtils;
import juegos.cartas.cartas.cartas.modelos.CartaFrancesa;

public class ValoradorCartasImp<C extends CartaFrancesa> implements ValoradorMano<C>
{
	
	ValoradorCartas<C> val;
	private static final int VALOR_OBJETIVO=21;
	
	@Override
	public int valoraMano(List<C> cartas)
	{
		//cartas.stream().map(c->val.dameValor(c)).collect(Math::addExact);
		List<C> cartasValorMultiple=new ArrayList<>();
		int acum=0;
		//primero recorre las cartas y suma solo las que tienen valor unico
		for (C c : cartas)
		{
			if(val.dameValorAlternativo(c)!=null)
				cartasValorMultiple.add(c);
			
			else
				acum+=val.dameValor(c);
		}
		List<Integer> posibilidades = valoraPosibilidades(cartasValorMultiple);
		
		boolean puedeSeguirJugando=false;
		for (Integer p : posibilidades)
		{
			int posib= acum+p;
			if(p==VALOR_OBJETIVO)
				return 1;// no necesita seguir
			else if((p<VALOR_OBJETIVO))
				puedeSeguirJugando=true;
		}
		
		
		return (puedeSeguirJugando? 0:-1);
	}

	@Override
	public List<Integer> valoraPuntos(List<C> cartas)
	{
		//cartas.stream().map(c->val.dameValor(c)).collect(Math::addExact);
		List<C> cartasValorMultiple=new ArrayList<>();
		int acum=0;
		//primero recorre las cartas y suma solo las que tienen valor unico
		for (C c : cartas)
		{
			if(val.dameValorAlternativo(c)!=null)
				cartasValorMultiple.add(c);
			
			else
				acum+=val.dameValor(c);
		}
		List<Integer> posibilidades = valoraPosibilidades(cartasValorMultiple);
		
		posibilidades=BlackJackUtils.addAllInt1(posibilidades, acum);
		
		
		return posibilidades;
	}
	
	public List<Integer> valoraPosibilidades(List<C> mult)
	{
		return valoraPosibilidades(mult,0,0);
	}
	
	public List<Integer> valoraPosibilidades(List<C> mult, int pos, int acum)
	{
		List<Integer> posibilidades= new ArrayList();
		
		
		
		if(pos< mult.size())
		{
			C carta= mult.get(pos);
			
			pos++;
			//con valor normal
			posibilidades.addAll(valoraPosibilidades(mult,pos,acum+val.dameValor(carta)));
			//con valor alternativo
			posibilidades.addAll(valoraPosibilidades(mult,pos,acum+val.dameValorAlternativo(carta)));
		}
		else
		{
			posibilidades.add(acum);
		}
		
		return posibilidades;
	}

	
	public static void main(String[] args) 
	{
		
		
		
	}
	
	
	

}
