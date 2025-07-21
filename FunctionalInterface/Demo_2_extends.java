package FunctionalInterface;

public class Demo_2_extends implements Demo_2 {

    @Override
    public void sum(int num1, int num2) {
        System.out.println("Sum: " + (num1 + num2));
    }

    public static void main(String[] args) {
        Demo_2 demo = new Demo_2_extends();
        demo.sum(5, 10); // Example usage
    }
    
}
