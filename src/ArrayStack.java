
public class ArrayStack implements Stack{
	int cap;
	int arr[];
	int size;
	//LIFO
	public ArrayStack(int val){
		cap = val;
		arr = new int[cap];
		size = 0;
		
	}
	public void push(int n){
		if(size>=cap){
			throw new ArrayIndexOutOfBoundsException();
	}
		arr[size] = n;
		size++;
	}

	public void pop(){
		if(size<=0){
			throw new ArrayIndexOutOfBoundsException();
		}
		arr[size] = 0;
		size--;
		}

	public int peek(){
		return arr[size-1];
	}
}
