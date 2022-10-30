package scope;

    // Scope3 is a small application. It has only one class.
    // It has two methods, the main method and an add method
    // The add method is different to the one in Scope2
public class Scope3 {
    // Main Method - There is always a main method in an application
    // There is not always a main method in a class (we will come to this later)
    public static void main(String[] args) {
        int a=1,b=2,c=3;
        //calls (go to the) add method
        int result = add2(a,b,c);  
        // prints a message after the add method is finished
        // but this time it also prints a variable which is result
        System.out.println("result in main() == "+result);

    }
// The add method has a return this time
// The return is an int
// The add method takes in 3 variables (a,b,c) which are declared as int
// The add method then adds the 3 variables and assigns the answer to the variable sum 
 //Then, the answer sum is returned (to the main method where it was sent from) 
    public static int add2(int x, int y, int z){
        System.out.println("in method add2()");
        // add x, y and z and assign the answer to sum (which is an int)
        int sum = x + y + z;
        // return sum
        return sum;
        
    }

}
