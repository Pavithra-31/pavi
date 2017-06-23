package programs;

public class array {
	public static void main(String[] args) {
			// TODO Auto-generated method stub
	int [] x=new int[]{9,7,9,8};int c=0,s=0;
	for(int i=0;i<x.length;i++){
		for(int j=i+1;j<x.length;j++){
		if(x[i]==x[j]){
			c++;
		s=x[i];	
			}
			
}
	}System.out.println(s);
}
}