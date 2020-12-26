package doublyLinkedList;
import java.util.*;
public class run {

	public static void main(String[] args) {
		
		DlinkedList dn = new DlinkedList();
		int n;
		try (Scanner s = new Scanner(System.in)) {
			while(true) {
				int ch;
				System.out.println("Enter 1 to insert 2 to display 3 to exit");
				ch = s.nextInt();
				switch(ch) {
				case 1 :
					System.out.println("enter number to insert");
					n=s.nextInt();
					dn.insert(n);
					System.out.println("Node created succesfully");
					break;
				case 2 :
					dn.disp();
					break;
				case 3 :
					System.exit(0);
				default :
					System.out.println("invalid option");
					
				}
			}
		}

	}

}
