package staticMethod;

public class P3 {
public static void main(String[] args) {
	System.out.println("From Main");
	System.out.println(add(5.5,6.7));
	System.out.println(add1(6,7,8));
	System.out.println(sub(10,5));
}
static int add(double a,double b) {
	return (int) (a+b);
}
static int add1(int a,int b,int v) {
return a+b+v;
}
static int sub(int a,int b) {
return a-b;
}
}
