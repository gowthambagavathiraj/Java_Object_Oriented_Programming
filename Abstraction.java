abstract class Bank {
    abstract void withdraw();
}

class SBI extends Bank {
    void withdraw() {
        System.out.println("Money withdrawn from SBI");
    }
}

public class Main {
    public static void main(String[] args) {
        Bank b = new SBI();
        b.withdraw();
    }
}
