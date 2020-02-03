public class Calculator{
    public int add(int op1,int op2){
        return op1+op2;
    }

    public int sub(int op1,int op2){
        return op1>op2?op1-op2:op2-op1;
    }

    public int mul(int op1,int op2){
        return op1*op2;
    }

    public int div(int op1,int op2){
        return op1/op2;
    }

    public int mod(int op1,int op2){
        return op1%op2;
    }
}