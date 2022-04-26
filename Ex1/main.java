package Ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne[] tab = new Personne[3];
		tab[0] = new Personne("ismail", "agu", "RT5");
		tab[1] = new Personne("ismail", "pul", "ez");
		tab[2] = new Personne("aaaa", "aa", "aa");
		
		Personne p = new Personne();
		Personne.Comparateur pc = new Personne.Comparateur();
		
	
		Arrays.sort(tab, pc);
		System.out.println(Arrays.toString(tab));
		
	}

}
