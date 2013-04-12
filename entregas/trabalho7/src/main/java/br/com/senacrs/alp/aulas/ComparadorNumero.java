package br.com.senacrs.alp.aulas;

import java.util.Comparator;

public class ComparadorNumero implements Comparator<Integer>{

	
	@Override
	public int compare(Integer o1, Integer o2) {
		
		if (o1 % 2 == 0 && o2 % 2 == 0) {
			if (o1 > o2) {
				return o1.compareTo(o2);
			}else {
				return o2.compareTo(o1);}
		} else if (o1 < o2) {
			return o2.compareTo(o1);
		}
		else{return o2.compareTo(o1);}
		
	}

}
