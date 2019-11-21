
package Lesson11Recursion;

public class Fibonacci {

    public static void main(String[] args) {
        
        System.out.println("The 10th fib is " + fib1(10));
        System.out.println("The 10th fib(recursive) is " + rectfib(10));
    }
    
    public static int rectfib(int num){
          if(num==1 || num ==2) 
              return 1;     
          else 
              return rectfib(num-1) + rectfib(num-2);
    }
    public static int fib1(int num){
        if(num==1 || num ==2) return 1;     
        int num1 =1, num2 =1;      
        int fib=2;
        for (int i = 3; i <=num; i++) {
        fib = num1 + num2;    
        num1 = num2;
        num2 =fib;
        }
        return fib;
    }
}
