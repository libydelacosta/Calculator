import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Chose Operator (+ - × ÷) >> ");
		String o = sc.nextLine();
		System.out.print("First Number >> ");
		int f = sc.nextInt();
		System.out.print("First Number >> ");
		int s = sc.nextInt();
		
		if(o.equals("+")) {
		    System.out.println(f + s);
		} else if (o.equals("-")) {
		    System.out.println(f - s);
		}  else if (o.equals("×")) {
		    System.out.println(f * s);
		}  else if (o.equals("÷")) {
		    System.out.println(f / s);
		} else {
		    System.out.println("Error");
		}		
	}
}