//class = buleprint ✓
class Student {

   String name;  //variable

   int age;

 
//method
   public void getInfo() {  

       System.out.println("The name of this Student is " + this.name);

       System.out.println("The age of this Student is " + this.age);

   }

}

//class
public class OOPS {
//method
   public static void main(String args[]) {
//obj
       Student s1 = new Student();
//call
       s1.name = "Aman";

       s1.age = 24;

       s1.getInfo();


       Student s2 = new Student();

       s2.name = "Shradha";

       s2.age = 22;

       s2.getInfo();

   }

}