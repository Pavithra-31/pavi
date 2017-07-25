package program;
import java.util.Arrays;
import java.util.Scanner;

public class Arraystudent {

	public static void main(String[] args) {
		double[]arr=new double [10];
		Scanner input=new Scanner(System.in);
		for(int i=0;i<arr.length;i++){
			arr[i]=input.nextDouble();
		}
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" "+"\n");
		}
		System.out.println("the 4th tallest member is"+arr[arr.length-4]);
		int k=7;
		System.out.println(" the kth tallest member is"+arr[arr.length-k]);
		input.close();


	}

}
