package stackTable;

public class Stack {
	static final int MAX = 100; 
    int top; 
    ListItem stack[] = new ListItem[MAX];
    
    boolean push(String item) 
    { 
        if (top >= (MAX - 1)) { 
            System.out.println("Stack Overflow"); 
            return false; 
        } 
        else { 
        	ListItem listItem = new ListItem();
        	listItem.setData(item);
            stack[top++] = listItem; 
            System.out.println(listItem.toString() + " pushed into stack"); 
            return true; 
        } 
    } 
    
    ListItem pop() 
    { 
        if (top < 0) { 
            System.out.println("Stack Underflow"); 
            return null; 
        } 
        else { 
            ListItem item = stack[top--]; 
            return item; 
        } 
    } 

}
