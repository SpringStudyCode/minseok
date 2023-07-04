public class PrimitiveType {

    public static void main(String[] args) {

        // 정수형
        // 1. byte (1 byte = 8 bits) : -2^7 ~ 2^7-1 (-128 ~ 127)
        // 2. short (2 bytes) : -2^15 ~ 2^15-1 (-32,768 ~ 32,767)
        // 3. int (4 bytes) : -2^31 ~ 2^31-1
        // 4. long (8 bytes) : -2^63 ~ 2^63-1

        // 실수형 (소수)
        // 1. double (8 bytes) - 소수점 15자리
        // 2. float (4 bytes) - 소수점 7자리

        double a = 1.23;
        float b = 9.45f; // float 로 선언할 때는 f 붙여줘야 함
        System.out.println(a);
        System.out.println(b);

        // 문자형
        // char (2 bytes)
        // 아스키, 유니코드
        char char_1 = 'a'; // 문자형은 작은 따옴표 사용
        char char_2 = 97; // a는 ASCII 코드로 97

        char char_3 = 43;
        char char_4 = 0x61; // a를 나타내는 유니코드 방식

        System.out.println(char_1);
        System.out.println(char_2);
        System.out.println(char_3);
        System.out.println(char_4);

        // 논리형
        // boolean (1 byte)

        boolean bool_1 = true;
        boolean bool_2 = false;
        boolean bool_3 = (100 < 0);
        // boolean bool_4 = 1; (c 또는 c++에서만 가능)

        System.out.println(bool_1);
        System.out.println(bool_2);
        System.out.println(bool_3);
    }
}
