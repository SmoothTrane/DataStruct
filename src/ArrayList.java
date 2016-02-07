
public class ArrayList implements List{

	
	public void add(int n){
	int[] arr = {1,2,3,4};
int[] newArray = new int [arr.length];
for(int i =0; i<arr.length; i++){
	
	newArray[i] = arr[i];
}
newArray[newArray.length -1] = n;

	}
}
