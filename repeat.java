package logic;
import java.util.Scanner;

public class repeat {

	public static void main(String[] args) {
		int n;
		System.out.println("enter the size");
		Scanner input=new Scanner(System.in);
		n=input.nextInt();
		int[]arr=new int[n];
		System.out.println("enter the numbers");
		for(int i=0;i<arr.length;i++){
		arr[i]=input.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					System.out.println(arr[i]);
					
					
				}	//break;		
			
		}break;
					
		}
		input.close();	
		
		

	

}
}
