public class CallByReference{
    public static void main(String[] args) {
        int value = 100; //Primitive
        int[] arr = new int[10];
        CallByValue(value);
        System.out.println("Value = "+value);

        CallByRef(arr);
        System.out.println("Changed? " + arr[0]);
    }

    public static void CallByValue(int value){
        ++value;
    }

    public static void CallByRef(int[] arr) {
        System.out.println("Before "+arr[0]);
        arr[0] = 100;
        System.out.println("After "+arr[0]);
    }

}