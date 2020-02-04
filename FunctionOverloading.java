public class FunctionOverloading {
    
    public long sum(int a, long b) {
        System.out.println("One Integers and One Long ");
        return a + b;
    }

    public long sum(long a, int b){
        System.out.println("One Long and One Integers");
        return a+b;
    }

    public int sum(int a, int b){
        System.out.println("Both Integers");
        return a+b;
    }

    public static void main(String[] args) {
        FunctionOverloading obj = new FunctionOverloading();
        int a = 10;
        int b = 20;
        long c = 1000;
        System.out.println(obj.sum(12, 12));

    }

}