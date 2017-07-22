package logic;
import java.util.Scanner;

public class Mins {

	public static void main(String[] args) {
		double time1;
		double time2;
		double min;
		double diff;
		Scanner input=new Scanner(System.in);
		time1=input.nextDouble();
		time2=input.nextDouble();
		min=time1-time2;
		diff=Math.abs(min*60);
		System.out.println(diff);
		input.close();
	}

}
