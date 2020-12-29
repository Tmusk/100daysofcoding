package stack;

import java.util.Scanner;

public class StackMain {

	public static void main(String[] args) {
		
			Stack s = new Stack();
			try (Scanner sc = new Scanner(System.in)) {
				while(true) {
					 System.out.println("Enter 1.Push 2.Pop 3.Display 4.Exit");
					 int ch = sc.nextInt();
					 switch(ch) {
					 case 1 : System.out.println("Enter element to be pushed");
					          int x=sc.nextInt();
					          s.push(x);
					          break;
					 case 2 :s.pop();
					         break;
					 case 3 :s.disp();
					         break;
					 case 4 : System.exit(0);
					 default:System.out.println("invalid Input");
						 
					 }
				 }
			}
		}

	}


