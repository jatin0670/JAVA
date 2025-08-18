package Lecture1;
public class Lec1 {
    public static void main(String[] args) {
        student s1 = new student();
        // s1.name = "jatin";          // normal way to initialize values
        // s1.age = 19;
        
        // System.out.println(s1.name + " " + s1.age + " " + s1.gender);  // through constructor

        // s1.changeName("ayush");
        // s1.greeting();
        // System.out.println(s1.name);
        
        

        System.out.println(s1.age + " " + s1.name);
    }  
    
    static class student{     //this is how we create a class
        String name;
        int age;
       char gender;

        void greeting(){                                      // normal greeting message
            System.out.println("hello this is me " + name);
        }


        void changeName(String name){                 // name change mehtod
            this.name = name;
        }
       
        student(){            //this is how we call a constructor from another constructor               
            this ("ayush", 19);
        }

        student(String name, int age){   // 2 parameterized constructor
           this.name = name;
           this.age = age;
        }

        student(String name, int age, char g){    // 3 parameterized constructor
            this.name = name;
            this.age = age;
            this.gender = g;
        }


    }
    
    
}
