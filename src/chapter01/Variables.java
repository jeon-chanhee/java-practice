public class Variables {
    public static void main(String[] args) {
        int age; // 변수 선언
        age = 27;

        int num = 21;   // 변수 선언과 저장 동시에 가능
        age = 26;

        // age = 22.6 은 변수에 대입이 안됨 소수이기 때문에
        age = num;
        age = age + 1;

        System.out.print("Hello, I'm ");
        System.out.print(age);
        System.out.println(".");
    }
}
