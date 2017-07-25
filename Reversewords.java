package program;
import java.util.*;

public class Reversewords {

	public static void main(String[] args) {
		String str="";
		Scanner input=new Scanner(System.in);
		str=input.nextLine();
		String []str1=str.split(" ");
		String []rev=new String[10];
		for(int i=0;i<str1.length;i++){
			rev[i]=new StringBuffer(str1[i]).reverse().toString();
			System.out.print(rev[i]+" ");
			
		}

	}

	

}
