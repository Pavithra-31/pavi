package program;
import java.util.Scanner;
public class Repeatedletters {

	public static void main(String[] args) {
		String str;
		int count=0;
		int kk=0;
		Scanner input=new Scanner(System.in);
		str=input.nextLine();
		String []arr=str.split(" ");
		int[]a=new int[arr.length];
		for(int i=0;i<arr.length;i++){
			count=0;
			String s=arr[i];
			for(int j=0;j<s.length();j++){
				for(int k=j+1;k<s.length();k++){
					if(s.charAt(j)==s.charAt(k)){
						count++;
					}
					
				}
			}
			a[i]=count;
			
		}
		int max=a[0];
		for(int l=1;l<a.length;l++){
			if(a[l]>max){
				max=a[l];
				kk=l;
				
			}
			
		}
		System.out.println("the max repeated letters: "+arr[kk]);

	}

}
