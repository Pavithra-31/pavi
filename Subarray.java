package program;
import java.util.Scanner;
public class Subarray {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner input=new Scanner(System.in);
			System.out.println("Enter the size of the array");
			int n=input.nextInt();
			System.out.println("Enter array elements");
			int i,j;
			int arr[]=new int[n];
			for(i=0;i<n;i++) {
				arr[i]=input.nextInt();
			}
			int sum=0;
			int temp=0;
			int m=0;
			int k=0;
			for(i=0;i<n;i++) {
				for(j=i;j<n;j++) {
					sum=sum+arr[j];
					if(sum>temp) {
						temp=sum;
						m=i;
						k=j;
					}
				}
				sum=0;
			}
			
			for(i=m;i<=k;i++) {
				System.out.print(arr[i]+" ");
	}
			input.close();

	}

}
