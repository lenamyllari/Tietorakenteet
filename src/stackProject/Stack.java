package stackProject;

public class Stack {
	
	private ListItem top;
	private int size;
	
	//muodosta uusi lista-alkio ja vie sen pinon huipulle
	public void push (String aData) {
		ListItem new_item = new ListItem();
		new_item.setData(aData); 
        if (top == null) { 
        	new_item.setNext(null);  
        } 
        else { 
            new_item.setNext(top);
        }
        top = new_item;
	}
	
	//poista ja palauta alkio pinon huipulta, jos pino on tyhjä, palauta null
	public ListItem pop() {
		if(top != null) {
			ListItem deleted = top; 
			top = top.getNext();
			return deleted;
		}
		else {
			return null;
		}
	}
	
	//tulosta pinon sisältö muuttamatta pinoa
	public void printItems() {
		ListItem currNode = top; 
		if(top != null) {
			System.out.print("Stack: "); 
			while (currNode != null) { 
				System.out.print(currNode.getData() + " "); 
				currNode = currNode.getNext(); 
			} 
		}
		else {
			System.out.print("Stack is empty."); 
		}
	}	
	
	//palauta pinon koon
	public int getSize() {
		size = 0;
		ListItem currNode = top; 
		while (currNode != null) { 
			size++; 
			currNode = currNode.getNext(); 
		} 
		return size;
	}
}
