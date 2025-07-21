public class StaticDemo {

    static int count;

    static {
        count = 10;
        System.out.println("Static block executed: count = " + count);
    }

    static void incrementCount() {
        count++;
        System.out.println("Static method called: count = " + count);
    }

    void showCount() {
        System.out.println("Instance method: count = " + count);
    }

    public static void main(String[] args) {
        System.out.println("Main method started");

        StaticDemo.incrementCount();

        System.out.println("Accessing static variable: " + StaticDemo.count);

        StaticDemo obj = new StaticDemo();
        obj.showCount();

        StaticDemo.count = 50;
        obj.showCount();
    }
}
