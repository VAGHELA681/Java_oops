class A {
    void input ()
    {
        System.out.println("enter your name:");
        }
    }
 
 class B extends A
 {
     void show () 
     {
         System.out.println("my name is shiva");
     }
 }
 
 class c extends A 
 {
     void dish ()
     {
         System.out.println("my name is shivani");
         }
  }
 
class demo {
    public static void main (String[]args) {
        B ref = new B ();
        c ref2= new c ();
        
        ref.input();
        ref.show();
        
        ref2.dish();
        ref2.input();
        
        }
    }
