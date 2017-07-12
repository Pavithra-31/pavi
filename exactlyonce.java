package program;
import java.util.Scanner;


public class exactlyonce {
	
	public static void main(String[] args) {
		int []arr=new int[5];
		Scanner input=new Scanner(System.in);
		for(int i=0;i<arr.length;i++ ){
			arr[i]=input.nextInt();
		}
		
		int count=0;
			for(int i=0;i<arr.length;i++){
			count=0;
			for(int j=0;j<arr.length;j++){
				if(arr[i]==arr[j]){
					count++;
				}
			}
		
		
			if(count==1){
				System.out.println(arr[i]);
			
		}
		}
		

	}

}
