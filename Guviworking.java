package program;
import java.util.Scanner;

public class Guviworking {

	public static void main(String[] args) {
		String str;
		Scanner input=new Scanner(System.in);
		str=input.nextLine();
		if(str.equals("monday")||str.equals("tuesday")||str.equals("wednesday")||str.equals("thursday")||str.equals("friday")||str.equals("saturday")){
			
		System.out.print("true");

	}
		else{
			System.out.print("false");
		}
		input.close();
	}

}
