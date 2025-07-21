package FunctionalInterface;

@FunctionalInterface
interface  DemoInterface {
    void display();
}

public class Demo_1 {


    public static void main(String[] args) {
        DemoInterface demo = () -> System.out.println("Hello from Functional Interface!");
        demo.display();       
    }
    
}
