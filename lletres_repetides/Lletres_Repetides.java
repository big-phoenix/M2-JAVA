package lletres_repetides;

import java.util.*;

public class Lletres_Repetides {

	public static void main(String[] args) {
	
		List<Character> nom = new ArrayList<>();
		char [] vocales = {'a','e','i','o','u'};
		int contador = 0;
		boolean vocal = false;
		
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
		
		
		for(int i=0; i<nom.size(); i++) {
			
			while(contador != vocales.length) {
				
				if(nom.get(i) == vocales[contador]) {
					System.out.print("VOCAL: " +nom.get(i)+ "\n");
					vocal = true;
					contador = vocales.length;
				}else {
					contador++;
				}
				
			}
			
			if(vocal == false) {
				System.out.print("CONSONTANT\n");
			};
			
			vocal = false;
			contador = 0;
			
		}

	}

}
