package Program;
import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		for(int i=0;i<n;i++) {			
				if(i==0||i==n-1) {
					for(int j=0;j<n;j++) {
				System.out.print("*"+" ");
				}
				}
			else {
				for(int j=0;j<n;j++) {
				
					if(j==0) {
						System.out.print("*"+" ");
					}
					if((j>0)&&(j<n-1)) {
						System.out.print(" "+" ");
					}
					if(j==n-1) {
						System.out.print("*"+" ");
					}
				}
			}
			System.out.println();
		}
		input.close();

	}

}
