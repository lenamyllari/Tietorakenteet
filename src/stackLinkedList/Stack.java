package stackLinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Stack {
	 private LinkedList<ListItem> list; 
	 
	 public Stack() { 
		 list = new LinkedList<ListItem>();        
		 } 
	 
	 boolean push(String item) { 
		 ListItem newItem = new ListItem();
		 newItem.setData(item);
		 list.add(newItem);
		 return true;
	    } 
	    
	 public ListItem pop() { 
		 ListItem deleted = list.getLast();
		 list.remove(deleted);
		 return deleted;
	    }

	public void printItems() {
		Iterator<ListItem> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}	
	} 
	
	public int getSize() {
		return list.size();
	}
}
