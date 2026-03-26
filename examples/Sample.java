public class Sample {
    public int add(int a, int b) {
        return a + b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public void printMessage() {
        System.out.println("Hello from DeadDoc");
    }
    public void unusedHelper() {
        int x = 100;
    }
    public void anotherUnusedMethod() {
        System.out.println("This is never called");
    }
    public static void main(String[] args) {
        Sample obj = new Sample();
        int sum = obj.add(5, 3);
        int product = obj.multiply(4, 2);
        obj.printMessage();
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}