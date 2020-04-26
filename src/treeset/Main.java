package treeset;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;


public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		TreeSet<Integer> tree = new TreeSet<Integer>();
		char input;
		do {
			int data;
			System.out.println("0: Stop	1: Add data	2: Find data 3: Delete data 4: Print all data 5: Delete all data");
			input = reader.next().charAt(0);
			switch (input) {
			case '1':
				System.out.println("Give the data to be added");
				tree.add(Integer.valueOf(reader.next()));
				break;
			case '2':
				System.out.println("Give the data to be found.");
				data = reader.nextInt();
				System.out.println( tree.contains(Integer.valueOf(data)) ? "Found" : "Not found");
				break;
			case '3':
				System.out.println("Give the data to be deleted");
				data = reader.nextInt();
				System.out.println(tree.remove(Integer.valueOf(data)));
				break;
			case '4':
				System.out.println("tree: " + tree.descendingSet());
				for(Integer i : tree) {
					System.out.println(i);
				}
                System.out.println();
				break;
			case '5':
				tree.clear();
				System.out.println("Tree is empty.");
				break;
			}
		} while (input != '0');
		reader.close();
	}

}
