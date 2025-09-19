class A {
	int x;
	int y;

	A(int a, int b ) {    //default
		 x = a ;
		 y = b;
	}
void show()  {
	System.out.println(x +" "+y) ;
     }
}
class oops {
	public static void main(String[]args) {
		A ref = new A(100 ,200);
		ref.show();
	}
}
