package LambdaExperssion;

public class _Print_hello_1 {
    
    public static void main(String [] args){
        Runnable r = () -> { System.out.println("Hello World"); };
        r.run();
    }
}
