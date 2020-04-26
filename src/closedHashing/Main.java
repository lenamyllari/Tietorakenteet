package closedHashing;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Give the size of the hash");
		ClosedHashing sh = new ClosedHashing(reader.nextInt());

		char input;
		do {
			int index;
			System.out.println("0: Stop	1: Add data	2: Find data 3: Delete data 4: Print all data 5: Delete all data");
			input = reader.next().charAt(0);
			switch (input) {
			case '1':
				System.out.println("Give the index to be added.");
				index = reader.nextInt();
				System.out.println("Give the data to be added");
				sh.add(index, reader.next());
				break;
			case '2':
				System.out.println("Give the index of the data to be found.");
				index = reader.nextInt();
				System.out.println(sh.find(index));
				break;
			case '3':
				System.out.println("Give the index of the data to be deleted");
				index = reader.nextInt();
				System.out.println(sh.delete(index));
				break;
			case '4':
				sh.printAll();
				break;
			case '5':
				sh.deleteAll();
				System.out.println("Hash is empty.");
				break;
			}
		} while (input != '0');
		reader.close();
	}

}
