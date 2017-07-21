package logic;
import java.util.Scanner;

public class Swapevenodd {

	public static void main(String[] args) {
		String str;
		String str1="";
		Scanner input=new Scanner(System.in);
		str=input.nextLine();
		if(str.length()%2==0){
			for(int i=0;i<str.length();i=i+2){
				str1=str1+str.substring(i+1,i+2)+str.substring(i,i+1);				
			}
			System.out.println(str1);
		}
		else if(str.length()%2!=0){
			for(int i=0;i<str.length()-2;i=i+2){
				str1=str1+str.substring(i+1,i+2)+str.substring(i,i+1);					
				}
			System.out.println(str1+str.substring(str.length()-1));
			}
		input.close();

	}

}
