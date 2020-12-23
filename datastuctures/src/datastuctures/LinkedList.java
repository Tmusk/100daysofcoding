package datastuctures;

public class LinkedList {
	Node head;
	int i;
	
	public void insert (int data) {
	
		Node node = new Node();
		node.data=data;
		node.next=null;
		
		if(head==null) {
			
			head = node;
		}else {
			Node n= head;
			
			while(n.next!=null)
			{
				
				n=n.next;
			}
			n.next=node;
			node.next=null;
		}
	}
  public void show() {
	  Node node = head;
	  while(node.next!=null) {
		  System.out.println(node.data);
		  node=node.next;
	  }
	 System.out.println(node.data);
  }
}
