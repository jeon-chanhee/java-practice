public class for문 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 5; i++) { //for(초기화식(초깃값 설정)), 종결제어식(while의 조건같은것 true면 수행부분으로 들어가고 false면 반복문 끝 )
            sum += i;               // 증감제어식(수행부분이 끝나고 실행되는 부분)
            System.out.println(sum); //  for 문 안에
        } System.out.println(sum); // for 문 밖에

        // 연습문제 구구단
        for (int i = 1; i <=9; i++) {
            for (int j = 1; j <=9; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }
    }
}
