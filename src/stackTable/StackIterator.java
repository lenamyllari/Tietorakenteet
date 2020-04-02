package stackTable;

public class StackIterator {
	private int  currentIndex;
    	private Stack container;
	int oldCurrent; 
    
    StackIterator (Stack c) { // konstruktori on "package visible"
        container = c;
        currentIndex = 0;
    }
    
    public boolean hasNext() {
        return container.stack[currentIndex]!=null;
    
    public ListItem next() {
      oldCurrent = currentIndex;
        currentIndex++;
        return container.stack[oldCurrent];
    }
}
