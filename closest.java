package program;
import java.util.Scanner;

public class closest {
	public static void main(String []args){
		int n;
		System.out.println("enter the size");
		Scanner input=new Scanner(System.in);
		n=input.nextInt();
		int []arr=new int [n];
		for(int i=0;i<arr.length;i++){
		arr[i]=input.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]+arr[j]==0){
					System.out.println("the two elements are "+arr[i]+" "+arr[j]);
				}
			}
		}
		input.close();
		
		
	}

}
