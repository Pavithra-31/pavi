package program;
import java.util.Scanner;

public class Subset {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int m=input.nextInt();		
	int []arr=new int[n];
	int []arr1=new int[m];
	int count=0;	
	System.out.println("enter the first array");
	for(int i=0;i<arr.length;i++){
		arr[i]=input.nextInt();
	}
	System.out.println("enter the second array");
		for(int j=0;j<arr1.length;j++){
			arr1[j]=input.nextInt();
		}
		for(int k=0;k<arr.length;k++){
			for(int l=0;l<arr1.length;l++){
				if(arr[k]==arr1[l]){
					count++;			
				}
			}
		}
			if(count==n){
				System.out.println("the array a1  is  a subset of a2");
			}
			else{
				System.out.println("the array a1 is not  subset of a2");
			}
			
		input.close();
		}

}
