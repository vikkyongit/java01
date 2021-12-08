
import TestTriangle;
public class Triangle {

	public  Triangle (String[] args){
		if(args != null && args.length == 3 ) {
		System.out.println("Triangle formed is : " + TriangleType(args));
		}
		}
	
		public static void main String TriangleType(String[] args) {
		String result="Not a Triangle";
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		if((a<b+c)&&(b<c+a)&&(c<a+b)) {
		if(a==b && b==c && c==a) {
		result="Equilateral";
		}
		else if(a!=b && a!=c && c!=a) {
		result="Scalene";
		}
		else if((a==b)||(b==c)||(c==a)) {
		result="Isoceles";
		}
		}
		return result; }
}
