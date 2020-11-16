package lletres_repetides;

import java.util.*;

public class Lletres_Repetides {

	public static void main(String[] args) {

		List<Character> nom = new ArrayList<>();
		List<Character> cognom = new ArrayList<>();
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
		
		cognom.add('b');
		cognom.add('e');
		cognom.add('n');
		cognom.add('i');
		cognom.add('t');
		cognom.add('o');
		
		
		nom.add(' ');
		nom.addAll(cognom);
		System.out.print("Fullname: " +nom);
		
	

	}

}
