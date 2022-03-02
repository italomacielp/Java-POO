package service;

import java.util.List;
//O método irá se comportar retornando um objeto de qualquer tipo. No caso o arquivo em formato csv (separado por vírgula) são produtos
//com nome e preço.
//public static <T extends Comparable<? super T>> T max(List<T> list) -> Se alguma superclasse tiver implementado o compareTo
//as demais herdam.
public class CalculationService {
	//O método trabalha com qualquer T, se qualquer subtipo for de Comparable<T> permitindo realizar a comparação compareTo.
	public static <T extends Comparable<T>> T max(List<T> list) {
		if(list.isEmpty()) {
			throw new IllegalStateException("List can't be empty");
		}
		T max = list.get(0);
		for(T item: list) {
			if(item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
	}
	
}
