public class DataTypes {

    /**
     * This is a documented comment.
     * 
     * @author Anshul
     * @version 1.0
     * @since 1.0
     */
    public static void main(String[] args) {
        byte b1 = 12;
        int _i1 = 128;
        // i1 = b1;
        // b1 = i1; // Error
        b1 = (byte) _i1;
        System.out.println(b1);

        //Primitive Data Types
        byte byteVar = 19; //-128 to 127
        int intVar = 100;
        short shortVar = 400;
        boolean flag = true;
        char ch = 'a';
        long numberOfEmployees = 40_000;
        float distance = 10.3434f;
        double largeDistance = 413.0015;
    }
}