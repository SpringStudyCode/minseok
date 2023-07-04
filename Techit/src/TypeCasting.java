public class TypeCasting {

    public static void main(String[] args) {

        // 형변환
        // byte < short < int < long <<< float < double

        // 강제 형변환
        // 작은 범위의 데이터에 큰 범위의 데이터 넣는 경우
        // 타입을 직접적으로 명시해줘야 함
        int a = 128;
        short b = (short) a;
        byte c = (byte) a; // -128 ~ 127

        System.out.println(a);
        System.out.println(b);
        System.out.println(c); // c는 overflow 발생해서 -128 출력됨

        double k = 10.331235685;
        float r = (float) k;
        System.out.println(k);
        System.out.println(r); // 가능한 정밀도(범위)만큼 소수점 출력

        // 자동 형변환
        // 큰 범위의 데이터에 작은 범위의 데이터 넣는 경우
        short x = 10;
        int y = x;

        int m = 80;
        double n = m;
        System.out.println(m); // 80
        System.out.println(n); // 80.0

        // 서로 다른 type 의 데이터 연산
        // 더 큰 범위를 갖는 type 을 따라감
        int e = 10;
        short f = 20;

        short g = (short)(e + f);
        int h = e + f;

        System.out.println(g);
        System.out.println(h);
    }
}
