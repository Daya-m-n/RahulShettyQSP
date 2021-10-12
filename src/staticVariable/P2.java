package staticVariable;

public class P2 {
	static int b=55;
public static void main(String[] args) {
	int b=66;
	System.out.println(b);
	System.out.println(P2.b);//when we use local and global variable name as same we can call global variable by using class name reference.
}
}
