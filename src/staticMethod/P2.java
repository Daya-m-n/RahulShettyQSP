package staticMethod;

public class P2 {
public static void main(String[] args) {
	System.out.println("From Main");
	System.out.println(mul(3,6));
	System.out.println(betta('a','b'));
}
static double mul(int a,int b) {
	return a*b;
}
static double betta(char a,char b) {
	return a+b;
}
}
