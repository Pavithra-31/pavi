package program;
import java.util.Scanner;
public class Appearsonce {

	public static void main(String[] args) {
		int []arr=new int[9];
		int count=0;
		Scanner input=new Scanner(System.in);
		for(int i=0;i<arr.length;i++){
			arr[i]=input.nextInt();
		}
		for(int j=0;j<arr.length;j++){
			count=0;
			for(int k=0;k<arr.length;k++){
				if(arr[j]==arr[k]){
					count++;
				}
			}
			if(count==1){
				System.out.println(arr[j]);
		}
		
		}
		
		

	}

}
