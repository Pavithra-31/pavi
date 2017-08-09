package program;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Shuffle {
	public static void main(String []args){
		ArrayList<Integer> obj=new ArrayList<Integer>();
		int num;
		Scanner input=new Scanner(System.in);
		num=input.nextInt();
		for(int i=1;i<=num;i++){
			obj.add(i);
			
		}
		System.out.println(obj);
		Collections.shuffle(obj);
		System.out.println(obj);
		input.close();
		
		
		

	
	}

}
