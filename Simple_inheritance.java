class Student {
	int roll ;
	int marks ;
	String name;

	void input() {
		System.out.println("Enter roll name & matks:");
	}
}
class ankit extends Student {
	void dish() {
		 roll = 1;
		name = "ankit";
		marks = 80;
		System.out.println(roll + " " + name + " " + marks);
	}
	public static void main(String[]args) {
		ankit r = new ankit();
		r.input();
		r.dish();
	}
}
