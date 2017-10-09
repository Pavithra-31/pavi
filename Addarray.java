package Program;
import java.util.Scanner;

public class Addarray {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int num=input.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=input.nextInt();
		}
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				sum=arr[i]+arr[j];
				if(sum==num) {
					System.out.print(arr[i]+" "+arr[j]);
				}
				
			}
		}
		input.close();

	}

}
