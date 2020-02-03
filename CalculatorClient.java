import java.util.Scanner;

public class CalculatorClient {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter First Operand");
        int a = scn.nextInt();
        System.out.println("Enter Second Operand");
        int b = scn.nextInt();
        System.out.println("Enter Operator");
        char op = scn.next().charAt(0);
        int ans = 0;
        switch (op) {
            case '+':
                ans = cal.add(a, b);
                break;
            case '-':
                ans = cal.sub(a, b);
                break;
            case '*':
                ans = cal.mul(a, b);
                break;
            case '/':
                ans = cal.div(a, b);
                break;
            case '%':
                ans = cal.mod(a, b);
                break;
                
            default:
                break;
        }
        System.out.println(ans);
    }
}