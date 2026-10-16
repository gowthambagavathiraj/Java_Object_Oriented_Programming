import java.util.*;
class Encapsulation{
    private String name;
    private double amount;
    public void setName(String name){
      this.name=name;
    }
    public void setAmount(double amount){
      this.amount=amount;
    }
    public String getName(){
      return name;
    }
    public double getAmount(){
      return amount;
    }
  
}
public class Main {
    public static void main(String[] args) {
    Encapsulation e1=new Encapsulation();
    e1.setAmount(50);
    System.out.println(e1.getAmount());
    e1.setName("Gowtham");
    System.out.println(e1.getName());

    }
}
