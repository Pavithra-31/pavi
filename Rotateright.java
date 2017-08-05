package program;
import java.util.Scanner;


public class Rotateright {

	public static void main(String[] args) {
		int n;
		int num;
		Scanner input=new Scanner(System.in);
		n=input.nextInt();
		num=input.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<arr.length;i++){
			arr[i]=input.nextInt();
			
		}
		
			for(int k=num;k<arr.length;k++){
				System.out.print(arr[k]);
			
			
		}
			for(int j=0;j<num;j++){
				System.out.print(arr[j]);
			}
			input.close();
		

	}

}
