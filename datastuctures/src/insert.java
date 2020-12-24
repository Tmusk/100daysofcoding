
public class insert {
 cLinkedList head;
 cLinkedList tail;
 
  public void cinsert(int data) {
	  cLinkedList link = new cLinkedList(); 
	  link.data=data;
	  if (head==null) {
		  head=link;
		  link.node=head;
		  tail=link;
	  }else
	  {
		 tail.node=link;
		 tail = link;
		 tail.node = head;
		  
	  }
	  
  }
  public void disp () {
	  cLinkedList temp;
	  temp=head;
	  while(temp.node!=head) {
		  System.out.println(temp.data);
		  temp=temp.node;
	  }
	  System.out.println(temp.data);
  }
}
