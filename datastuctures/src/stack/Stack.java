package stack;
public class Stack {
	static int top = 10;
	Node head =null;
	
	
	 void push (int x) {
	    Node ohead=head;
	    head=new Node();
	    head.data=x;
	    if(ohead==null) {
		    System.out.println("Pushed successfully"+ x);
	    return;
	    }else {
		    System.out.println("Pushed successfully"+ x);
		    head.next=ohead;
	    }
	   }
	
		
	void pop() {
		 if(head==null) {
		 	 System.out.println("Stack underflow");
	 	 }else {
			 System.out.println(head.data);
			 head=head.next;
		 }
		
		 }
	
	 void disp() {
			if(head==null) {
				System.out.println("Stack underflow");
			}else {
				while(head!=null) {
					System.out.println(head.data);
					head=head.next;
				}
			}
		   }
}
