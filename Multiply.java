package program;
import java.util.Scanner;
public class Multiply {

	public static void main(String[] args) {
		String str;
		Scanner input=new Scanner(System.in);
		str=input.nextLine();
		String str1=str.substring(0,1);
		String str2=str.substring(1,2);
		int a=Integer.parseInt(str1);
		int b=Integer.parseInt(str2);
		int x=a*b;
		String s=String.valueOf(x);
		System.out.println(s);
		input.close();

	}

}
