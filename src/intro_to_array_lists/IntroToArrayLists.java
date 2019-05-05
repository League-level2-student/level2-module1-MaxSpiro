package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		// 1. Create an array list of Strings
		// Don't forget to import the ArrayList class
		ArrayList<String> strings = new ArrayList<String>();
		// 2. Add five Strings to your list
		strings.add("Adam");
		strings.add("Benjamin");
		strings.add("Connor");
		strings.add("Daryl");
		strings.add("Ethan");
		// 3. Print all the Strings using a standard for-loop
		System.out.println("all strings");
		for (int i = 0; i < strings.size(); i++) {
			System.out.println(strings.get(i));
		}
		// 4. Print all the Strings using a for-each loop
		System.out.println("all strings");
		for (String names : strings) {
			System.out.println(names);
		}
		// 5. Print only the even numbered elements in the list.
		System.out.println("even numbered elements");
		for (int i = 0; i < strings.size(); i++) {
			if (i % 2 == 0) {
				System.out.println(strings.get(i));
			}
		}
		// 6. Print all the Strings in reverse order.
		System.out.println("reverse order");
		for (int i = strings.size() - 1; i >= 0; i--) {
			System.out.println(strings.get(i));
		}
		// 7. Print only the Strings that have the letter 'e' in them.
		System.out.println("contains 5 or more letters");
		for (int i = 0; i < strings.size(); i++) {
			if (strings.get(i).length() >= 5) {
				System.out.println(strings.get(i));
			}

		}
	}
}
