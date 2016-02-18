
public class ArrayList implements List{

	
	public void add(int n){
	int[] arr = {1,2,3,4};
int[] newArray = new int [arr.length];
for(int i =0; i<arr.length; i++){
	
	newArray[i] = arr[i];
}
newArray[newArray.length -1] = n;

	}
	
	public boolean update(int currentN, int replaceN){
		int[] arr = {1,2,3,4};
		for(int i=0; i<arr.length; i++){
		if(arr[i] == currentN){
			arr[i] = replaceN;
			return true;
		}
	
		}
return false;
	}
	
	public int[] delete (int[] arr, int n ){
	
		int[] newArr  = {arr.length-1};
	for(int i =0; i<arr.length; i++){
		if(arr[i] != n){
			newArr[i] = arr[i];
		}
	}
	return newArr;
	}
	}

