package doublyLinkedList;

public class DlinkedList {
 Node head;
 Node tail;
 void insert(int data) {
	 Node n = new Node();
	 n.data=data;
	 if(head==null) {
		 head=tail=n;
		 n.prev=null;
		 n.next=null;
	}else {
		tail=head;
		while(tail.next!=null) {
			tail.prev=tail;
			tail=tail.next;
			}
		tail.next=n;
		n.prev=tail;
		n.next=null;		
		}
	}
	 
  void disp() {
	  Node n = new Node();
	  n=head;
	  while(n.next!=null) {
		  System.out.println(n.data);
		  n=n.next;
	  }
	  System.out.println(n.data);
  }
 }

