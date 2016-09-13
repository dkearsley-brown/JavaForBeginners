package alwaysmakeanewproject;

public class AlwaysMakeANewProject {


    public static void main(String[] args) {
        // String variables
        // Strings are for characters only
        String colour = "Purple";
        String name = "Danny";
        String street = "Botesworth Close";
        
        // Print Strings
        System.out.println("My favourite colour is " + colour);
        System.out.println("My name is "+name);
        System.out.println("The street I grew up on is "+street);
        
        // int variables 
        // int is for whole numbers only
        int number = 5;
        int age = 16;
        int shoeSize = 7;
        
        // Print int
        System.out.println("Your chosen number was: "+number);
        System.out.println("My age is "+age);
        System.out.println("My shoe size is: "+shoeSize);
        
        // "double" is for decimals only
        double test = 1.5;
        double pi = 3.14;
        
        // print double
        System.out.println(test);
        System.out.println(pi);
        
        // Area of a circle is pi*r^2
        // Speed = distance/time
        
            // Testing Calculations
        // Adding
        System.out.println(age+shoeSize);
        // Subtract
        System.out.println(age-shoeSize);
        // Multiply
        System.out.println(age*shoeSize);
        // Divide
        System.out.println(age/shoeSize);
        
        //x and y variables
        int x = 1;
        int y = 20;
        // If Statement
        if (x < y) {
            //if the condition is true
            System.out.println("x is less than y");
        }else{
            //if the condition is false
            System.out.println("x is more than y");
        }
    }
    
}
