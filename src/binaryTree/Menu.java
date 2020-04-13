package binaryTree;

public class Menu {
	//main alkaa-----------------------------------------------------------------------------
    public static void main(String[] args) {

                    printMenu();

    }
//main loppuu --------------------------------------------------------------------------
//printMenu alkaa------------------------------------------------------------------
    private static void printMenu() {
            char select;
            BinaryTree tree = new BinaryTree();
            int data;
            do {

                    System.out.println("\n\t\t\t1. Lisää solmu.");
                    System.out.println("\t\t\t2. Tulosta puu esijärjestyksessä.");
                    System.out.println("\t\t\t3. Etsi puusta.");
                    System.out.println("\t\t\t4. Poista puusta.");
                    System.out.println("\t\t\t5. lopetus ");
                    System.out.print("\n\n"); // tehdään tyhjiä rivejä
                    select = Lue.merkki();
                    switch (select) {
                    case '1':
                        System.out.println("Anna juuren sisältö (merkkijono)");
                        data = Integer.parseInt(Lue.rivi());
                        if(tree.find(data)!=null) {
                        	 System.out.println("Tämä löytyy jo puusta");
                        }
                        else {
                        	tree.insert(data);
                        }
                        break;
                    case '2':
                    	tree.preOrder();
                        break;
                    case '3':
                    	System.out.println("Anna etsittävä numero");
                    	data = Integer.parseInt(Lue.rivi());
        		System.out.println((tree.find(data)!=null) ? "Avain löytyi.": "Avainta ei löytynyt.");       		
                        break;
                    case '4':
                        System.out.println("Anna poistettava numero");
                        data = Integer.parseInt(Lue.rivi());
                        if(tree.find(data)==null) {
                        	 System.out.println("Ei löydy puusta");
                        }
                        else {
                        	tree.delete(data);
                        }
                        break;
                    case '5':
                        break;
                    }
            }
            while (select != '5');
    }
//printMenu loppuu 
}
