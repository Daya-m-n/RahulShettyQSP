package staticMethod;

public class P1 {
	public static void main(String[] args) {
		System.out.println("From Main");
		print();
		System.out.println(print1());
	}
	static void print() {
		System.out.println("From Print");
	}
	static int print1() {
		System.out.println("From Print1");
		return 23;
	}


}
