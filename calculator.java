package calculator;
import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Enter First Number : ");		
		int fNum = sc.nextInt();
		System.out.print("Enter Second Number : ");		
		int sNum = sc.nextInt();
		
		
		System.out.print("Enter Operation # 1 is +, 2 is -, 3 is ×, 4 is ÷: ");
		
		int op = sc.nextInt();
		
		if(op == 1){
		  System.out.print("Total :");
		System.out.println(fNum + sNum);
		
	    }else if(op == 2) {
	        System.out.print("Total :");
	        System.out.println(fNum - sNum);
	    }else if(op == 3) {
	          System.out.print("Total :");
	        System.out.println(fNum * sNum);
	    }else if(op == 4) {
	          System.out.print("Total :");
	        System.out.println(fNum / sNum);
	    }else {
	        System.out.println("Error(!)");
	    }
	}
}