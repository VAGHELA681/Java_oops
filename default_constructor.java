class A {
	int a;
	String name;

	A() {    //default
		 a = 0;
		name = null;
	}
void show()  {
	System.out.println(a + " " + name) ;
     }
}
class oops {
	public static void main(String[]args) {
		A ref = new A();
		ref.show();
	}
}
