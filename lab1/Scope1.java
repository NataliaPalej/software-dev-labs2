package scope;
    // Scope1 is a small application. It has only one class.
    // The class has only one method which is the main method
public class Scope1 {
   // Main Method - There is always a main method in an application but 
   // There is not always a main method in a class (we will come to this later)
    public static void main(String[] args) {
        int a=1,b=2,c=3;
        int result = a+b+c;
       
        System.out.println("result in main() == "+result);

    }
    
}
