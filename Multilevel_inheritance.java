class A {
	int a, b, c;

	void add() {
		a = 10;
		b = 20;
		c = a + b;
		System.out.println("sum of the two numbers:" + c);
	}
	
	void sub() {
		a = 100;
		b = 200;
		c = a - b;
		System.out.println("sub of the two number:" + -c);
	}
}

class B extends A {
	void multi() {
	    a = 20;
	    b = 46;
    	c = a*b;
       //System.out.println("multi of the two number:" +*c);
  }

    void div () {
	  a = 10;
	  b = 20;
	  c = a/b;

   }
}

class c extends B {
	void rem() {
		a = 10;
		b = 2;
		c = a % b;
	
	}
}
class test {
    public static void main (String[]args) {
        c  r = new  c ();
        r.add();
        r.sub();
        r.multi();
        r.div();
        r.rem();
        }
    }
