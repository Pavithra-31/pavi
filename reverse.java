package logic;

public class reverse {

	public static void main(String[] args) {
		String str="pavi";
		String reverse="";
		for(int i=str.length()-1;i>=0;i--){
			reverse=reverse+str.charAt(i);
		}
		System.out.println("the string after reverse will be "+reverse);

	}

}
