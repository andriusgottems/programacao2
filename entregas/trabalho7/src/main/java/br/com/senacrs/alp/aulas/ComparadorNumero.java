package br.com.senacrs.alp.aulas;

import java.util.Comparator;

public class ComparadorNumero implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		
		int par = 0;
		
		if (o1 % 2 == 0) {
			par = o1;
		} else {
			par = o2;
		}
		
		return par;
	}

}
