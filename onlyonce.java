package program;

import java.util.Scanner;

public class onlyonce {

	public static void main(String[] args) {
		int []arr=new int[5];
		Scanner input=new Scanner(System.in);
		for(int i=0;i<arr.length;i++ ){
			arr[i]=input.nextInt();
		}
		
		int f=0;
			for(int i=0;i<arr.length;i++){
			f=0;
			for(int j=0;j<arr.length;j++){
				if(arr[i]==arr[j]){
					f++;
				}
			}		
			if(f==1){
				System.out.println(arr[i]);
			
		}
		}
			input.close();

	}

}
