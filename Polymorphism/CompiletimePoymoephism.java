import java.util.*;

class CompileTimepolymorphism{
  int add(int a, int b){
    return a+b;
  }
  int add(int a,int b, int c){
    return a+b+c;
  }
  double add(double a, double b){
    return a+b;
  }
} 

public class Main {
    public static void main(String[] args) {
      CompileTimepolymorphism c1=new CompileTimepolymorphism();
     System.out.println( c1.add(10,20));
     System.out.println(c1.add(10,20,30));
     System.out.println(c1.add(5.5,6.5));
    }
}
