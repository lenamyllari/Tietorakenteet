package postFixCalculator;

public class ListItem {
	private double data;
	private ListItem next;
	
	public ListItem() {
		next = null;
	}
	
	public double getData() {
		return data;
	}
	public void setData(double data) {
		this.data = data;
	} 
	public ListItem getNext() {
		return next;
	}
	public void setNext(ListItem next) {
		this.next = next;
	}
}
