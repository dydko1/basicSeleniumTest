package pl.sii.trash.lambda2;

public class Test111 {
    public static void main(String[] args) {
        FuncInterface1 fObj = x -> x * 10;

        int xx= fObj.abstractFun(5);
    }
}
