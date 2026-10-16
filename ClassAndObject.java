import java.util.*;
class ClassAndObject{
  String name="Gowtham";
  int age=20;
 public  void display(){
  System.out.println("Name :"+name);
  System.out.println("Age :"+age);
 }
}
public class Main {
    public static void main(String[] args) {
     ClassAndObject obj=new ClassAndObject();
     obj.display();

    }
}
