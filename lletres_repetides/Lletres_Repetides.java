package lletres_repetides;

import java.util.*;

public class Lletres_Repetides {

	public static void main(String[] args) {

		List<Character> nom = new ArrayList<>();
		HashMap<Character, Integer> llista = new HashMap<Character, Integer>();
		
		nom.add('j');
		nom.add('o');
		nom.add('s');
		nom.add('e');
		nom.add('j');
		nom.add('a');
		nom.add('v');
		nom.add('i');
		nom.add('e');
		nom.add('r');
		
		
		System.out.print(nom+"\n");
		
		for(int i=0; i < nom.size() ;i++) {
			
			int num = 0;
			int contador = 0;
			
			while(contador != nom.size()) {
				
				char igual = nom.get(i);
				
				
				if(igual == nom.get(contador)) {
					num++;
				}
				
				contador++;
			}
			
			llista.put(nom.get(i), num);
			
		}
			
		System.out.print(llista);

	}

}
