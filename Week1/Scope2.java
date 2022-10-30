package scope;
    // Scope2 is a small application. It has only one class.
    // It has two methods, the main method and an add method
public class Scope2 {
    // Main Method - There is always a main method in an application
    // There is not always a main method in a class (we will come to this later)
    public static void main(String[] args) {
        int a=1,b=2,c=3;
        //calls (go to the) add method
        add(a,b,c);
        // prints a message after the add method is finished
        System.out.println("Back in main()");
    }
    // The add method has no return
    // The add method takes in 3 variables (a,b,c) which are declared as int
// The add method then adds the 3 variables and prints the answer within the method
    public static void add(int a, int b, int c){
        // prints text only. There are no variables
        System.out.println("in method add()");
        int sum = a + b + c;
        //prints text and the variable sum
        System.out.println("sum in add() == "+sum);
    }    
}
