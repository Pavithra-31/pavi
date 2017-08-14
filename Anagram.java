package program;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram {

	public static void main(String[] args) {
		String str;
		String str1;
		int count=0;
		Scanner input=new Scanner(System.in);
		str=input.nextLine();
		str1=input.nextLine();
		str=str.toLowerCase();
		str1=str1.toLowerCase();
		
		char []arr=str.toCharArray();
		char []arr1=str1.toCharArray();
		Arrays.sort(arr);
		Arrays.sort(arr1);
		if(arr.length==arr1.length){
			for(int i=0;i<arr.length;i++){
			if(arr[i]==arr1[i]){
				count++;
			}
		}
		}
		
			if(count==arr1.length){
				System.out.println("the two strings are anagram");
			}
			else{
				System.out.println("the two strings are not anagram");
			}

	
		
		input.close();
	}

}
