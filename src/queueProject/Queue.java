package queueProject;

import queueProject.ListItem;

public class Queue {
	private ListItem head;
	private ListItem tail;
	private int size;
	
	//muodosta uusi lista-alkio ja vie sen pinon huipulle
	public void push (String aData) {
		ListItem new_item = new ListItem();
		new_item.setData(aData);
        new_item.setNext(null);
        if (head == null) { 
            head = new_item;  
        } 
        else {
        	tail = head; 
            while (tail.getNext() != null) { 
                tail = tail.getNext(); 
            }
            tail.setNext(new_item);
        }
	}

	//poista ja palauta alkio pinon huipulta, jos pino on tyhjä, palauta null
	public ListItem pop() {
		if(head != null) {
			ListItem deleted = head; 
			head = head.getNext();
			return deleted;
		}
		else {
			return null;
		}

	}
	
	//tulosta pinon sisältö muuttamatta pinoa
	public void printItems() {
		ListItem currNode = head; 
		if(head != null) {
			System.out.print("Queue: "); 
			while (currNode != null) { 
				System.out.print(currNode.getData() + " ");
				currNode = currNode.getNext(); 
			} 
		}
		else {
			System.out.print("Queue is empty."); 
		}
	}
	
	
	//palauta pinon koon
	public int getSize() {		
		size = 0;
		ListItem currNode = head; 
		while (currNode != null) { 
			size++; 
			currNode = currNode.getNext(); 
		} 
		return size;
	}
}
