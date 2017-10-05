package Program;
import java.util.Scanner;

public class Guvi {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int[][] arr=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++){
				arr[i][j]=input.nextInt();
			}
					
		}
		int[][] arr1=new int[n][n];
		int count=0;
		int count1=0;
		int s=0;
		for(int i=0;i<n;i++) {count=0;
			for(int j=0;j<n;j++) {
				if(arr[i][j]!=0) {
					count++;
				}
			}
			if(count==n) {
				for(int h=0;h<n;h++) {
				count1=0;
				for(int k=0;k<n;k++) {					
                if(arr[k][h]!=0) {
                	count1++;
                	
                }
                
				}
				if(count1==n) {
						arr1[i][h]=1;
				}
					else {
							arr1[i][h]=0;						
						}
						
					}
			}
					
			else {
				for(int l=0;l<n;l++) {
				arr1[i][l]=0;
					
				}
				
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
	}

	}


