class Student {
	int id;
	String name;

	// Normal constructor
	Student(int id, String name) {
		//id = 1;
		//name = "madhuri";
	}

	// Copy constructor
	Student(Student s) {
		id = s.id;
		name = s.name;
	}

	void display() {
		System.out.println(id + " " + name);
	}
	
	

	public static void main(String args[]) {
		Student s1 = new Student(101, "Madhuri");  // Normal constructor
		Student s2 = new Student(s1);                   //    Copy constructor

		s1.display();
		s2.display();
	}
}
