
public class Driver {
public static void main(String[] args){
	
	
List array = new ArrayList(5);
array.add(1);
array.update(1, 3);
array.add(5);
array.add(50);

System.out.println(array.toString());
array.add(20, 1);
System.out.println(array.toString());


	}


}


