package binarySearch;

import java.util.Random;

public class Menu {
	//final static int MAX=2000;
	static int[] numbers; 
	//main alkaa-----------------------------------------------------------------------------
    public static void main(String[] args) {
    	numbers = new int[100]; //taul tallettaa lajiteltavat tiedot
	    System.out.println("Generoidaan syöttöaineisto: ");
	    for (int i=0;i<50;i++) {
	        numbers[i] = i*2;//generoidaan luvut
	        System.out.print(numbers[i]+" ");
	        if (i>0 && i%40==0) // rivinvaihto
              System.out.println();
	    }
                    printMenu();

    }
//main loppuu --------------------------------------------------------------------------
//printMenu alkaa------------------------------------------------------------------
    private static void printMenu() {
    		
            char select;
            int data;
            
            BinarySearch search = new BinarySearch(numbers);
            do {

                    System.out.println("\n\t1. Find smallest number.");
                    System.out.println("\t2. Find biggest number.");
                    System.out.println("\t3. Find a number.");
                    System.out.println("\t4. Add a number.");
                    System.out.println("\t5. Print numbers.");
                    System.out.println("\t6. Stop ");
                    select = Lue.merkki();
                    switch (select) {
                    case '1':
                        search.searchSmallest();
                        break;
                    case '2':
                        search.searchBiggest();
                        break;
                    case '3':
                    	System.out.println("Give a number to find");
                    	data = Integer.parseInt(Lue.rivi());
        				search.search(data);       		
                        break;
                    case '4':
                        System.out.println("Give a number to add");
                        data = Integer.parseInt(Lue.rivi());
                        search.add(data);
                        break;
                    case '5':
                	    for (int i=0;i<=search.lastUsedIndex();i++) {
                	        System.out.print(numbers[i]+" ");
                	        if (i>0 && i%40==0) // rivinvaihto
                              System.out.println();
                	    }
                        break;
                    case '6':
                        break;
                    }
            }
            while (select != '6');
    }
//printMenu loppuu 
}
