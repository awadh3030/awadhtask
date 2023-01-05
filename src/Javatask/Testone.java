package Javatask;

import java.util.HashMap;
import java.util.Map;

public class Testone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input = {"Atyab", "Fatima", "Saeed", "Abdullah", "Malak", "Fatima", "Daniyal", "atyab", "Abdullah", "Abdullah"};
        Map<String, Integer> counts = new HashMap<>();

        for (String element : input) {
            if (counts.containsKey(element)) {
                counts.put(element, counts.get(element) + 1);
            } else {
                counts.put(element, 1);
            }
        }

        System.out.println(counts);
        System.out.println("Done");
	}

}
