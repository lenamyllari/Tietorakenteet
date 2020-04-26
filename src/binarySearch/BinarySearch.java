package binarySearch;

public class BinarySearch {

	private int[] numbers;

	public BinarySearch(int[] numbers) {
		this.numbers = numbers;
	}

	public void searchSmallest() {
		System.out.println("Smallest number is " + this.numbers[0]);
	}

	public void searchBiggest() {
		System.out.println("Biggest number is " + this.numbers[lastUsedIndex()]);
	}

	public void search(int data) {
		int index = searchIndex(data);
		if((index==0 && this.numbers[0]!=data) || this.numbers[index]!=data) {
			System.out.println("Not found");
		}
		else {
			System.out.println("Found on the position " + index);
		}
	}
	
	public int searchIndex(int data) {
		int start = 0;
        int end = numbers.length - 1;
        while(start <= end) {
            int middle = (start + end) / 2;
            if (numbers[middle] == data) {
                return middle;
            } else if (data > numbers[middle]) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return start;
		
	}

	public void add(int data) {
		int i;
		for (i = lastUsedIndex(); i>=0 && this.numbers[i]>data && this.numbers[i]>0; i--) {
			this.numbers[i+1]=this.numbers[i];
		}
		numbers[i+1]=data;
	}
	
	public int lastUsedIndex() {
		for(int i=this.numbers.length-1; i>=0; i--) {
			if(this.numbers[i]!=0) {
				return i;
			}
		}
		return 0;
	}
}
