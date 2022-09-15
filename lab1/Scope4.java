package scope;

public class Scope4 {
    
    public static void main(String[] args) {
        int a=1,b=2,c=3;
       // int result = a+b+c;
        add(a,b,c);
        //int result = add2(a,b,c);  
       // System.out.println("result in main() == "+result);
       System.out.println("result in main() == ");
    }
    public static void add(int a, int b, int c){
        System.out.println("in method add()");
        int sum = a + b + c;
        System.out.println("sum in add() == "+sum);
    }    
  /*  public static int add2(int x, int y, int z){
        System.out.println("in method add2()");
        int sum = x + y + z;
        return sum;
        
    }
*/
}
