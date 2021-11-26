public class 숫자연산자 {
    public static void main(String[] args) {
        System.out.println("숫자 연산자");
        int a = 9;
        int b = 5;
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));
        System.out.println(a + " % " + b + " = " + (a % b));
        System.out.println("----------------------------");

        System.out.println("비교 연산자");
        System.out.println(3 + " > " + 2 + " = " + (3 > 2));
        System.out.println(3 + " < " + 2 + " = " + (3 < 2));
        System.out.println(3 + " >= " + 2 + " = " + (3 >= 2));
        System.out.println(3 + " <= " + 2 + " = " + (3 <= 2));
        System.out.println(3 + " == " + 2 + " = " + (3 == 2));

        System.out.println("----------------------------");
        System.out.println("불린 연산자 - and");
        System.out.println("true && true: " + (true && true));
        System.out.println("true && false: " + (true && false));
        System.out.println("false && true: " + (false && true));
        System.out.println("false && true: " + (false && false));

        System.out.println("불린 연산자 - or");
        System.out.println("true || true: " + (true || true));
        System.out.println("true || false: " + (true || false));

        System.out.println("불린 연산자 - not");
        System.out.println("!true: " + (!true));
    }
}
