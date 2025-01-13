package exception;

public class TryCatch {

    public static void main(String[] args) {
        int a,b,c;
        try {
            // 예외가 발생할 수 있는 문장
            a = 10;
            b = 0;
            c = a / b; // 0으로 나눴으니 산술오류 ArithmeticException
        } catch (ArithmeticException e) {
            // 해당 예외가 발생했을 때 실행되는 블록
            System.out.println(e);
            c = -1; // 예외 발생하여 실행됨
            System.out.println(c);  // -1
        }
    }
}
