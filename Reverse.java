package list;
import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		String str;
		Scanner input=new Scanner(System.in);
		str=input.nextLine();
		String []arr=str.split(" ");
		String str1="";
		for(int i=arr.length-1;i>=0;i--){
			str1=str1+" "+arr[i];
		}
		System.out.print(str1+" ");
	}

}
