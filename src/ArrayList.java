
public class ArrayList implements List{
private int[] arr;
private int size;
private int capacity;
public ArrayList(int val){
	capacity = val;
	arr = new int[val];
	size = 0;
}

	
	public void add(int n){
		if(size>=capacity){
			throw new ArrayIndexOutOfBoundsException();
		}
	arr[size] = n;
	size++;
	// O(1) 

	}
	
	public boolean update(int currentN, int replaceN){
	
	int i=0;
	while(arr[i]!=currentN){
		i++;
		if(i>=size){
		return false;
	}

	}

arr[i]= replaceN;

return true;


}
		

	
	public String toString(){
		if(size==0){
			return "Array is empty: []";
		}
		String ret = "[" + arr[0];
		for(int i=1; i<size; i++){
			ret += "," + arr[i];
		}
		ret += "]";
		return ret;
	}
	public boolean contains(int n){
		
		for(int i=0; i<arr.length; i++){
			if(arr[i] == n){
				return true;
			}
		}
		return false;
	}
	
	
	
	public boolean delete(int n){
		for(int i=0; i<size; i++){
			if(arr[i] == n){
				if(i + 1 >= size){
					size--;
					return true;
				}
				else{
					size--;
					for(int k =i; k<size; k++){
						arr[k] = arr[k+1];
					}
					return true;
				}
			}
		}
		return false;
	}
	
	public int size(){
		return size;
	}
	
	//implement indexOf method
	public int indexOf(int n){
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == n) {
				return i;           
			}

		}
		return -1;
	}
	
}
