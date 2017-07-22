package logic;
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		int number;
		Scanner input=new Scanner(System.in);
		number=input.nextInt();
		int count=0;
		int a=0;
		for(int i=2;i<number;i++){
			count=0;
			for(int j=2;j<i+1;j++){
				if(i%j==0){
					count++;				
					
				}
			}
				if(count<2){
					a++;
					System.out.print(i+" ");										
				}
				
			}
		System.out.println("the count of prime number is"+a);
		input.close();

	}

}
