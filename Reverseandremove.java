package program;
import java.util.Scanner;
public class Reverseandremove {

	public static void main(String[] args) {
		String str;
		String str1="";
		Scanner input=new Scanner(System.in);
		str=input.nextLine();
		for(int i=0;i<str.length();i++){
			str1=str1+str.substring(str.length()-i-1,str.length()-i);
			
		}
		System.out.println(str1);
		String str2=str1.replaceAll("[aeiouAEIOU]", "");
		System.out.println(str2);

	}

}
