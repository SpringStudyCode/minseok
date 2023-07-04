public class ReferenceType {

    public static void main(String[] args) {

        // 참조형
        // 참조형 데이터의 값 => 힙 메모리 영역
        // 변수에 대입되는 값 => 힙 메모리 영역의 주소값

        // 1. new 연산자 사용
        // 기존에 동일한 문자열 있어도 새롭게 생성
        String a = new String("Hello!");
        System.out.println(a);

        // 2. 문자열 리터럴 사용
        // 힙 메모리에 동일한 문자열 있으면 동일한 주소를 바라봄
        String b = "Hello!";
        String c = "Hello!";

        if (a == b)
            System.out.println("a == b");

        if (b == c)
            System.out.println("b == c");
    }
}
