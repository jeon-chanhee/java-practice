public class TypeConversionCasting {
    public static void main(String[] args) {
        double x = 3.14;
        int y = (int) x; // 형변환 (typecasting)

        System.out.println(y);

        int a = 9;
        int b = 5;
        System.out.println(a / b);
        System.out.println((double) a / b); // 프린트문에서도 형변환 가능

        /**
         * 여러분이 국어(koreanScore) 86점, 수학(mathScore) 94점, 과학(scienceScore) 87점, 컴퓨터(computerScore) 100점을 맞았다고 합시다
         * 이 값들을 사용하여 평균 점수(average)를 구하고 소수로 출력해보세요.
         */

        int koreanScore, mathScore, scienceScore, computerScore;

        koreanScore = 86;
        mathScore = 94;
        scienceScore = 87;
        computerScore = 100;


        double average = (double) (koreanScore+mathScore+scienceScore+computerScore)/4;
        // 계산식에 double이 있어야 소수점으로 들억가게됨.

        System.out.print(average);
    }
}
