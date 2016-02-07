import java.util.Arrays;


public class ArrayList implements List{

	
	public int[] add(int[]arr, int n){

int[] newArray = new int [arr.length+ 1];
for(int i =0; i<arr.length; i++){
	
	newArray[i] = arr[i];
}
newArray[newArray.length -1] = n;
return arr;
	}
	
	
}
