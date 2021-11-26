public class array {
    public static void main(String[] args) {
        int[] intArray = new int[5]; // 5개의 int를 담은 배열 만들어짐

        intArray[0] = 2;
        intArray[1] = 3;
        intArray[2] = 5;
        intArray[3] = 7;
        intArray[4] = 11;

        System.out.println(intArray[2] + intArray[4]);

        for (int i = 0; i < intArray.length; i++) {  // intArray.length 배열의 길이를 알 수 있음.
            System.out.println(intArray[i]);
        }

        // for-each 주어진 리스트에 차례로 삽입이 됨.
        String[] fruitsArray = new String[5];

        fruitsArray[0] = "딸기";
        fruitsArray[1] = "당근";
        fruitsArray[2] = "수박";
        fruitsArray[3] = "참외";
        fruitsArray[4] = "메론";

        for (String fruit: fruitsArray) {
            System.out.println(fruit);
        }

        int[] aArray = new int[30];
        String[] remainders = new String[4];

        remainders[0] = "Zero";
        remainders[1] = "One";
        remainders[2] = "Two";
        remainders[3] = "Three";

        for (int j=0; j < aArray.length; j++) {
            aArray[j] = 1001 + j;
        }
        for (int element: aArray) {
            System.out.println(remainders[element % 4]);
        }
    }
}
