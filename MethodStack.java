public class MethodStack{
    public static void main(String[] args) {
        System.out.println("Called before executing method 1");
        method1();
        System.out.println("Called after executing method 1");
    }

    private static void method1() {
        System.out.println("Called before executing method 2");
        method2();
        System.out.println("Called after executing method 2");
    }

    private static void method2() {
        System.out.println("Called before executing method 3");
        method3();
        System.out.println("Called after executing method 3");
    }

    private static void method3() {
        System.out.println("Executing Method 3");
        
    }
}