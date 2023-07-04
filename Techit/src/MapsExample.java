import java.util.HashMap;

public class MapsExample {

    public static void main(String[] args) {

        // Map
        // 키-값 쌍을 요소로 가지는 데이터의 모음, 순서 구분 없음
        // 키는 중복 불가, 값은 중복 허용
        // HashMap

        // 데이터 타입 제한x
        HashMap map1 = new HashMap();

        // 키-값 쌍의 데이터 타입 제한하는 경우
        HashMap<String, String> map2 = new HashMap();
        map2.put("age", "30");
        map2.put("mbti", "INFP");

        System.out.println(map2.get("age")); // 키에 대응하는 값 출력
        System.out.println(map2.get("mbti"));
    }
}
