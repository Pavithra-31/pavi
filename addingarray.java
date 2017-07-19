package program;
import java.util.Scanner;

public class addingarray {

	public static void main(String[] args) {
		int n;
		System.out.println("enter the size");
		Scanner input=new Scanner (System.in);
		n=input.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++){
			arr[i]=input.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				for(int k=0;k<arr.length;k++){
				
				if(arr[i]+arr[j]==arr[k]){
						System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
					}
				}
				}
			}
		
		input.close();
	}
		

	

}
