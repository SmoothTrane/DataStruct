
public class Driver {
public static void main(String[] args){
	
	
	List array = new ArrayList(50);
	List linked = new LinkedList();
	Stack myStack = new ArrayStack(10);
	linked.add(5);
	linked.add(6);
	linked.add(9);
	System.out.println(linked.delete(9));
	System.out.println(linked.toString());

	}


}


