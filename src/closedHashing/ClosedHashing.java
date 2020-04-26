package closedHashing;

public class ClosedHashing {
	private int size;
	private String[] data;
	private int[] indexes;
	private int j=0;

	public ClosedHashing(int size) {
		this.size = size;
		this.data = new String[size];
		this.indexes = new int[size];
	}

	public void add(int index, String input) {
		if(!isFull()) {
			if(!indexUsed(index)) {
				indexes[j]=index;
				j++;

				int hashIndex = index % size;
				for(int i = 0; i < size; i++) {
					if( data[hashIndex] == null ) {
						data[hashIndex] = input;
						break;
					}
				hashIndex = (hashIndex + 1) % size;
				}
			}
			else{
				System.out.println("Index used already");
			}
		}
		else {
			System.out.println("Table is full already");
		}
	}

	public String find(int index) {
		return data[index % size];
	}

	public String delete(int index) {
		String delete = data[index % size];
		data[index % size] = null;
		return delete;
	}

	public void deleteAll() {
		for (int i = 0; i < data.length; i++) {
			data[i] = null;
		}
	}

	public void printAll() {
		for (String string : data) {
			System.out.println(string);
		}
	}
	
	private boolean indexUsed(int index) {
		for(int i=0; i<size; i++) {
			if(indexes[i]==index) {
				return true;
			}
		}
		return false;
	}
	
    private boolean isFull()//checks for open spaces in the table for insertion
    {
        boolean isFull = true;
        for (int i = 0; i < size; i++)
        {
            if (data[i] == null)
            {
                isFull = false;
            }
        }
        return isFull;
    }
}
