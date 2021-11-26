public class Switch {
    public static void main(String[] args) {
        /*
        a+ = 100
        a = 90-99
        b = 80-89
        ...
         */
        // 시험점수
        int score = 97;

        // 성적
        String grade;

        switch (score / 10) {
            case 10:
                grade = "A+";
                break;
            case 9:
                grade = "A";
                break;
            case 7:
                grade = "B";
                break;
            default:
                grade ="F";
                break;

        }  System.out.println("성적: " +grade);
    }
}
