package logicprogram;
import java.util.Scanner;

public class equalindex {

	public static void main(String[] args) {
		int[]arr=new int[5];
		Scanner input=new Scanner(System.in);
		int count=0;
		for(int i=0;i<arr.length;i++){
		arr[i]=input.nextInt();
		}
		
		
			for(int i=0;i<arr.length;i++){
				if(arr[i]==i){
					count++;
					
				
			
				System.out.println(arr[i]+"is equal to"+i);
				}

			}
		
		
			//System.out.prequalintln(arr[i]+"is  to"+j);

			if(count==0){
				System.out.println("there is no number equal to its index");
			}
			
		
		
		input.close();
	}
}

