public class Operators {

    public static void main(String[] args) {

        // 산술 연산자

        int a = 10;
        int b = 20;
        String c = "abc";

        double d = 10;
        double e = 20;
        System.out.println(d / e); // 0.5 출력

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b); // 몫 (0 출력)
        System.out.println(a % b); // 나머지 (10 출력)

        System.out.println(a + c); // a가 문자열로 변환되어 취급됨 (10abc 출력)

        // 비교 연산자

        int x = 5;
        int y = 8;

        System.out.println(x > y);
        System.out.println(x < y);

        System.out.println(x >= y);

        System.out.println(x <= y);

        // = 대입연산자, == 비교연산자
        System.out.println(x == y);
        System.out.println(x != y);

        // 논리 연산자
        int s = 3;
        int t = 3;
        int r = 5;

        // AND (&&) - 교집합
        System.out.println(r > s && r < t); // true && false => false

        // OR (||) - 합집합
        System.out.println(r > s || r < t); // true || false => true

        // NOT (!) - 여집합
        System.out.println(!true);
        System.out.println(!false);


        // 대입 연산자
        int num = 1;
        double price = 12.5;

        // 증감 연산자
        num++; // a = a + 1
        num--; // a = a - 1

        ++num;
        --num;

        System.out.println(num++); // 1
        System.out.println(num); // 2
    }
}
