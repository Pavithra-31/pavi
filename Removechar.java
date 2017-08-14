package program;
import java.util.Scanner;

public class Removechar {

	public static void main(String[] args) {
		String str;
		String str1;
		String str2="";
		
		Scanner input=new Scanner(System.in);
		str=input.nextLine();
		str1=input.nextLine();
		for(int i=0;i<str1.length();i++){
			for(int j=0;j<str.length();j++){
				if(str1.charAt(i)==str.charAt(j)){
					str=str.replace(str.charAt(j)+"", "");
					
				}
			}
		}
		System.out.println(str);
		input.close();
	}

}
