public class Main {
    public static void main(String[] args) {

        MathInterface math = (int a, int b) -> a * b;

        System.out.println(math.operate(10,10));
        System.out.println(math.add(10,10));
        System.out.println(math.subtract(10,10));
        System.out.println(MathInterface.divide(10,2));

        DefaultMethodsInterface methodsInterface = new DefaultMethodsInterface();

        System.out.println(methodsInterface.operate(10,20));
        System.out.println(methodsInterface.add(10,20));
        System.out.println(methodsInterface.subtract(10,20));
        System.out.println(methodsInterface.multiply(10,20));
    }
}
