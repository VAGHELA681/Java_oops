class A {
	int a;
	String b;
	boolean c;

	A() {
		a = 100;
		b = "meera";
		c = true;
	}
		void dish() {
			System.out.println(a + " " + b + " " + c);
		}
}

	class B {
		public static void main(String[]args) {
			A ref = new A();
			ref.dish();
		}
	}
