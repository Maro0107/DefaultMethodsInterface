public class DefaultMethodsInterface implements MathInterface {
    @Override
    public int operate(int a, int b) {
        System.out.println("operate");
        return a*b;
    }

    @Override
    public int add(int a, int b) {
        System.out.println("add");
        return a+b;
    }

    @Override
    public int subtract(int a, int b) {
        System.out.println("subtract");
        return a-b;
    }

    @Override
    public int multiply(int a, int b) {
        System.out.println("multiply");
        return MathInterface.super.multiply(a,b);
    }
}
