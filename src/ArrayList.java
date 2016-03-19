
public class ArrayList implements List{
private int[] arr;
private int size;
public ArrayList(int val){
	arr = new int[val];
	size = 0;
	//USER MUST SPECIFY a CAPACITY on the array in order to add elements 
}

	
	public void add(int n){
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
		int[] arr = {1,2,3,4};
	int[] newArr = new int[arr.length-1];
		for(int i = 0; i<arr.length; i++){
			if(arr[i] != n){
				newArr[i] = arr[i];
			}
			
		}
		
	return true;

		
	}
	
	public int size(){
		return size;
	}
}
