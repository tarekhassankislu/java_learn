package ac.dia;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Testset {

	public static void main(String[] args) {
		ArrayList<String> set = new ArrayList<String>();
		
		//HashSet<String> set = new HashSet<String>();
		//set.add(50);
		set.add("Alice");
		//set.add(50.50);
		set.add("Bob");
		
		//System.out.println(set);
		
		set.add("Cathryne");
		
		//System.out.println( set);
		
		set.add("Donald");
		
		//System.out.println(set);
		
		TreeSet tree = new TreeSet(set);
		
		System.out.println(tree);
	
	}

}
