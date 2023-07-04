public class ArraysExample {

    public static void main(String[] args) {

        // 배열 (Arrays)

        int[] price = {10000, 9000, 40000, 7000};
        String[] mbti = {"INFP", "ENFP", "ISTJ", "ESTP"};

        System.out.println(price[0]);
        System.out.println(mbti[0]);

        price[1] = 8000;
        System.out.println(price[1]);

        // System.out.println(price); // price 배열의 시작 주소값 출력

        System.out.println(mbti.length); // 배열의 크기(길이)

        for (int i = 0; i < mbti.length; i++){
            System.out.println(mbti[i]);
        }
    }
}
