package program;
import java.util.Scanner;
public class reversenumber {

	public static void main(String[] args) {
		int num;
		Scanner input=new Scanner(System.in);
		num=input.nextInt();
		int rem;
		int rev=0;
		while(num!=0){
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;			
		}
		System.out.println("the number becomes after reverse is "+rev);
		input.close();		

	}

}
