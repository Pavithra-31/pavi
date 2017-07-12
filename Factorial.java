package logic;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int num;
		Scanner input=new Scanner(System.in);
		num=input.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++){
			fact=fact*i;
			
		}
		System.out.println("the factorial number for 5 is "+fact);
		input.close();
		

	}

}
