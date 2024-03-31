public class ArithmeticException extends Throwable {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0, res;
            res = a / b;
            System.out.println(res);
        } catch (java.lang.ArithmeticException e) {
            System.out.println(e);
            System.out.println("Exception is handled");
        }
    }
}