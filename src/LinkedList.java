
public class LinkedList implements List{
	private ListNode head;
	private boolean hasNext;
	private int size;


	
	


	@Override
	public void add(int n) {
		if(head == null){
			head = new ListNode(n);
			
		}
		else{
			ListNode tmp = head;
			while(tmp.next != null){
				tmp = tmp.next; 
			}
			tmp.next = new ListNode(n);
			}
			size++;
	}
	

	private int getSize(){
		return size;
	}

	@Override
	public boolean delete(int n) {
		if(head == null){
			throw new NullPointerException();
		}
		else{
			ListNode tmp = head;
			while(tmp.next !=  null){
				if(tmp.data == n){
					tmp = tmp.next.next;
					return true;
				}
				tmp = tmp.next;
				
			}
			return false;
		}
	}



	@Override
	public boolean contains(int n) {
		ListNode tmp = head;
		while(tmp.next != null){
			if(tmp.data == n){
				return true;
			}
			tmp = tmp.next;
		}
		return false;
	}



	@Override
	public boolean update(int currentN, int replaceN) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	public String toString(){
		
		ListNode tmp = head;
		String arr = "[";
		while(tmp != null){
			arr += tmp.data + ",";
			tmp = tmp.next;
		}
		return arr + "]";
	}
	
}
