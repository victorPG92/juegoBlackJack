package juego.cartas.blackjack.utils;

import java.util.ArrayList;
import java.util.List;

import juegos.cartas.cartas.cartas.modelos.CartaFrancesa;

public class BlackJackUtils
{
	
	
	
	/**
	 * Modifica la propia lista sumando en cada posicion el valor requerido
	 * @param list
	 * @param value
	 * @return
	 */
	public static List<Integer> addAllInt1(List<Integer> list, int value)
	{
		for (int i = 0; i < list.size(); i++)
		{
			list.set(i, list.get(i)+value);
		}
		
		return list;
	}
	
	/**
	 * Crea una nueva lista y en cada posicion inserta el valor requerido
	 * para crear la lista usa arraylist
	 * @param list
	 * @param value
	 * @return
	 */
	public static List<Integer> addAllInt2(List<Integer> list, int value) throws InstantiationException, IllegalAccessException
	{
		List<Integer> newList= new ArrayList();
		for (int i = 0; i < list.size(); i++)
		{
			newList.add(list.get(i)+value);
		}
		
		return newList;
	}
	
	/**
	 * Crea una nueva lista y en cada posicion inserta el valor requerido
	 * para crear la lista usa reflexion
	 * @param list
	 * @param value
	 * @return
	 */
	public static List<Integer> addAllInt3(List<Integer> list, int value) throws InstantiationException, IllegalAccessException
	{
		List<Integer> newList= list.getClass().newInstance();
		for (int i = 0; i < list.size(); i++)
		{
			newList.add(list.get(i)+value);
		}
		
		return newList;
	}
	
	
	
	
	/**
	 * Divide la lista
	 * @param list
	 * @param value
	 * @return
	 */
	public static <C extends CartaFrancesa> List<List<C>> dividirMultiLista(List<List<C>> list,IgualdadNumeros<C> ig)
	{
		//List<C> newList= new ArrayList<>();
		
		for (List<C> list2 : list) 
		{
			if(sePuedeDividir(list2, ig))
			{
				list.remove(list2);
				list.addAll(dividirLista(list2));
			}
		}
		
		return list;
	}
	
	/**
	 * Divide la lista
	 * @param list
	 * @param value
	 * @return
	 */
	public static <C extends CartaFrancesa> List<List<C>> dividirMultiLista(List<List<C>> list,IgualdadNumeros<C> ig, int i)
	{
		//List<C> newList= new ArrayList<>();
		
		List<C> list2 = list.get(i); 
		
		if(sePuedeDividir(list2, ig))
		{
			list.remove(list2);
			list.addAll(dividirLista(list2));
		}
		
		
		return list;
	}
	
	public static <C> boolean sePuedeDividir(List<C> list,IgualdadNumeros<C> ig)
	{
		return (list.size()==2) && ig.tieneNumerosIguales(list.get(0), list.get(1));
		
	}
	
	/**Suponer 	que el elemento es igual
	 * Divide la lista de 2 elementos en 2 listas de uno
	 * @param list
	 * @param value
	 * @return
	 */
	public static <C extends CartaFrancesa> List<List<C>> dividirLista(List<C> list)//,IgualdadNumeros<C> ig)
	{
		
		//if(list.get(0).equals(list.get))
		List<List<C>> listaDeListas= new ArrayList();
		list.forEach(
		c->{
			List<C> listC=new ArrayList();
			listC.add(c);
			listaDeListas.add(listC);	
		});
		
		
		
		return listaDeListas;
	}

}
