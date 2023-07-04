public class StringExample {

    public static void main(String[] args) {

        // String => 문자열 객체
        // 객체 => 힙 메모리 영역
        // 변수 => 힙 메모리 영역의 주소

        // 2가지 방식으로 문자열 할당 가능
        String str = "안녕하세요!"; // 문자열 리터럴
        String str_2 = new String("안녕하세요!"); // 생성자
        String str_3 = "안녕하세요!"; // str_3 는 str 과 동일한 힙 메모리 주소 사용

        // 주소값 비교
        if (str == str_2)
            System.out.println("str == str_2"); // str 과 str_2는 다름

        if (str == str_3)
            System.out.println("str == str_3"); // str 과 str_3는 같음

        // 실제 값(내용) 비교
        if (str.equals(str_2))
            System.out.println("str.equals(str_2)");

        if (str.equals(str_3))
            System.out.println("str.equals(str_3)");

        // 문자열 병합

        // 1. '+' 연산자
        String s1 = "Hello, ";
        String s2 = "World!";
        System.out.println(s1 + s2);

        // 2. StringBuilder
        StringBuilder strBdr_1 = new StringBuilder("Hello,");
        strBdr_1.append("World!");

        System.out.println(strBdr_1.toString());

        // 문자열 슬라이스

        String s_1 = "이름: 김자바";
        // System.out.println(s_1.indexOf("이"));
        // System.out.println(s_1.indexOf("름"));
        String s_name = s_1.substring(4, 7);
        System.out.println(s_name);

        // 문자열 대소문자 변환
        String str_a = "abc";
        String str_b = "ABC";

        str_a = str_a.toUpperCase();
        str_b = str_b.toLowerCase();

        System.out.println(str_a);
        System.out.println(str_b);

        if (str_a.equals(str_b))
            System.out.println("str_a.equals(str_b)");

        if (str_a.equalsIgnoreCase(str_b))
            System.out.println("str_a.equalsIgnoreCase(str_b)");

        // 공백 제거

        // 1. 양쪽 끝 공백 (trim 함수 사용)
        String a = "     Hello   ";
        a = a.trim();
        System.out.println(a);

        // 2. 문자열 중간 공백 (replace(" ", "") 사용 -> 공백을 없앤다는 의미)
        String b = "   Hel   lo   ";
        b = b.trim();
        b = b.replace(" ", "");
        System.out.println(b);
    }
}
