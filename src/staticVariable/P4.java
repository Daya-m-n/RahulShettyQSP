package staticVariable;

public class P4 {
	static int k;
	public static void main(String[] args) {
		System.out.println(k);
		test();
	}
	static void test() {
		System.out.println(k);//we can use static variable anywhere inside class
	}

}
 