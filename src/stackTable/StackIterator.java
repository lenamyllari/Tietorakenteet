package stackTable;

public class StackIterator {
	private int  currentIndex;
    private Stack container;
    
    StackIterator (Stack c) { // konstruktori on "package visible"
        container = c;
        currentIndex = 0;
    }
    
    public boolean hasNext() {
        if (container.stack[currentIndex] == null)
            return false;
        else
            return true;
    }
    
    public ListItem next() {
        int oldCurrent = currentIndex;
        currentIndex++;
        return container.stack[oldCurrent];
    }
}
