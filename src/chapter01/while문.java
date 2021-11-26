public class while문 {
    public static void main(String[] args) {
        int num = 10000;
        int key = 153;
        int i = 0;

        // 여기에 코드를 작성하세요.
        // 10000 미만의 정수 중에서, 153의 배수중 가장 큰 값을 찾아 출력하세요.
        /*
        내 코드
        while (true) {
            num--;
            if (num % key == 0) {
                System.out.print(num);
                break;
            }
        }
         */
        // 모범 답안
        while (num % key > 0) {
            num--;
        } // num % key 가 0이 되어버리면 while문을 튀어나감.
        System.out.println(num);
    }
}